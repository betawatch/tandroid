package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LongSparseArray;
import g5.a0;
import g5.c;
import g5.i;
import g5.k;
import g5.m;
import g5.p;
import g5.r0;
import g5.v0;
import g5.x;
import h5.a;
import h5.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.FileStreamLoadOperation;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class ExtendedDefaultDataSource implements m {
    private static final String SCHEME_ASSET = "asset";
    private static final String SCHEME_CONTENT = "content";
    private static final String SCHEME_RAW = "rawresource";
    private static final String SCHEME_RTMP = "rtmp";
    private static final String TAG = "ExtendedDefaultDataSource";
    private m assetDataSource;
    private final m baseDataSource;
    private m contentDataSource;
    private final Context context;
    private m dataSchemeDataSource;
    private m dataSource;
    private m encryptedFileDataSource;
    private m fileDataSource;
    private final LongSparseArray<Uri> mtprotoUris;
    private m rawResourceDataSource;
    private m rtmpDataSource;
    private FileStreamLoadOperation streamLoadOperation;
    private final List<v0> transferListeners;

    public ExtendedDefaultDataSource(Context context, String str, boolean z4) {
        this(context, str, 8000, 8000, z4);
    }

    private void addListenersToDataSource(m mVar) {
        for (int i10 = 0; i10 < this.transferListeners.size(); i10++) {
            mVar.addTransferListener(this.transferListeners.get(i10));
        }
    }

    private m getAssetDataSource() {
        if (this.assetDataSource == null) {
            c cVar = new c(this.context);
            this.assetDataSource = cVar;
            addListenersToDataSource(cVar);
        }
        return this.assetDataSource;
    }

    private m getContentDataSource() {
        if (this.contentDataSource == null) {
            i iVar = new i(this.context);
            this.contentDataSource = iVar;
            addListenersToDataSource(iVar);
        }
        return this.contentDataSource;
    }

    private m getDataSchemeDataSource() {
        if (this.dataSchemeDataSource == null) {
            k kVar = new k(false);
            this.dataSchemeDataSource = kVar;
            addListenersToDataSource(kVar);
        }
        return this.dataSchemeDataSource;
    }

    private m getEncryptedFileDataSource() {
        if (this.encryptedFileDataSource == null) {
            EncryptedFileDataSource encryptedFileDataSource = new EncryptedFileDataSource();
            this.encryptedFileDataSource = encryptedFileDataSource;
            addListenersToDataSource(encryptedFileDataSource);
        }
        return this.encryptedFileDataSource;
    }

    private m getFileDataSource() {
        if (this.fileDataSource == null) {
            a0 a0Var = new a0(false);
            this.fileDataSource = a0Var;
            addListenersToDataSource(a0Var);
        }
        return this.fileDataSource;
    }

    private m getRawResourceDataSource() {
        if (this.rawResourceDataSource == null) {
            r0 r0Var = new r0(this.context);
            this.rawResourceDataSource = r0Var;
            addListenersToDataSource(r0Var);
        }
        return this.rawResourceDataSource;
    }

    private m getRtmpDataSource() {
        if (this.rtmpDataSource == null) {
            try {
                m mVar = (m) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.rtmpDataSource = mVar;
                addListenersToDataSource(mVar);
            } catch (ClassNotFoundException unused) {
                a.K(TAG, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e6) {
                throw new RuntimeException("Error instantiating RTMP extension", e6);
            }
            if (this.rtmpDataSource == null) {
                this.rtmpDataSource = this.baseDataSource;
            }
        }
        return this.rtmpDataSource;
    }

    private m getStreamDataSource() {
        if (this.streamLoadOperation == null) {
            FileStreamLoadOperation fileStreamLoadOperation = new FileStreamLoadOperation();
            this.streamLoadOperation = fileStreamLoadOperation;
            addListenersToDataSource(fileStreamLoadOperation);
        }
        return this.streamLoadOperation;
    }

    private void maybeAddListenerToDataSource(m mVar, v0 v0Var) {
        if (mVar != null) {
            mVar.addTransferListener(v0Var);
        }
    }

    @Override // g5.m
    public void addTransferListener(v0 v0Var) {
        this.baseDataSource.addTransferListener(v0Var);
        this.transferListeners.add(v0Var);
        maybeAddListenerToDataSource(this.fileDataSource, v0Var);
        maybeAddListenerToDataSource(this.assetDataSource, v0Var);
        maybeAddListenerToDataSource(this.contentDataSource, v0Var);
        maybeAddListenerToDataSource(this.rtmpDataSource, v0Var);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, v0Var);
        maybeAddListenerToDataSource(this.rawResourceDataSource, v0Var);
    }

    @Override // g5.m
    public void close() {
        m mVar = this.dataSource;
        if (mVar != null) {
            try {
                mVar.close();
            } finally {
                this.dataSource = null;
            }
        }
    }

    @Override // g5.m
    public Map<String, List<String>> getResponseHeaders() {
        m mVar = this.dataSource;
        return mVar == null ? Collections.EMPTY_MAP : mVar.getResponseHeaders();
    }

    @Override // g5.m
    public Uri getUri() {
        m mVar = this.dataSource;
        if (mVar == null) {
            return null;
        }
        return mVar.getUri();
    }

    @Override // g5.m
    public long open(p pVar) {
        a.i(this.dataSource == null);
        Uri uri = pVar.a;
        if ("mtproto".equals(uri.getScheme())) {
            uri = this.mtprotoUris.get(Long.parseLong(pVar.a.toString().substring(8)));
            c4.c a2 = pVar.a();
            a2.e = uri;
            pVar = a2.d();
        }
        String scheme = uri.getScheme();
        int i10 = d0.a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.dataSource = getAssetDataSource();
            } else if (uri.getPath().endsWith(".enc")) {
                this.dataSource = getEncryptedFileDataSource();
            } else {
                this.dataSource = getFileDataSource();
            }
        } else if ("tg".equals(scheme)) {
            this.dataSource = getStreamDataSource();
        } else if (SCHEME_ASSET.equals(scheme)) {
            this.dataSource = getAssetDataSource();
        } else if (SCHEME_CONTENT.equals(scheme)) {
            this.dataSource = getContentDataSource();
        } else if (SCHEME_RTMP.equals(scheme)) {
            this.dataSource = getRtmpDataSource();
        } else if ("data".equals(scheme)) {
            this.dataSource = getDataSchemeDataSource();
        } else if (SCHEME_RAW.equals(scheme)) {
            this.dataSource = getRawResourceDataSource();
        } else {
            this.dataSource = this.baseDataSource;
        }
        return this.dataSource.open(pVar);
    }

    @Override // g5.j
    public int read(byte[] bArr, int i10, int i11) {
        m mVar = this.dataSource;
        mVar.getClass();
        return mVar.read(bArr, i10, i11);
    }

    public ExtendedDefaultDataSource(Context context, String str, int i10, int i11, boolean z4) {
        this(context, new x(str, i10, i11, z4, null), (LongSparseArray<Uri>) null);
    }

    public ExtendedDefaultDataSource(Context context, m mVar, LongSparseArray<Uri> longSparseArray) {
        this.context = context.getApplicationContext();
        mVar.getClass();
        this.baseDataSource = mVar;
        this.transferListeners = new ArrayList();
        this.mtprotoUris = longSparseArray;
    }

    @Deprecated
    public ExtendedDefaultDataSource(Context context, v0 v0Var, m mVar, LongSparseArray<Uri> longSparseArray) {
        this(context, mVar, longSparseArray);
        if (v0Var != null) {
            this.transferListeners.add(v0Var);
            mVar.addTransferListener(v0Var);
        }
    }
}
