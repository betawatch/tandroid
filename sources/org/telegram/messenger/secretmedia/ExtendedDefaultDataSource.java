package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import e2.d;
import e2.d0;
import g2.a0;
import g2.b;
import g2.c0;
import g2.e;
import g2.f;
import g2.h;
import g2.l;
import g2.m;
import g2.r;
import g2.t;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.FileStreamLoadOperation;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class ExtendedDefaultDataSource implements h {
    private static final String SCHEME_ASSET = "asset";
    private static final String SCHEME_CONTENT = "content";
    private static final String SCHEME_RAW = "rawresource";
    private static final String SCHEME_RTMP = "rtmp";
    private static final String TAG = "ExtendedDefaultDataSource";
    private h assetDataSource;
    private final h baseDataSource;
    private h contentDataSource;
    private final Context context;
    private h dataSchemeDataSource;
    private h dataSource;
    private h encryptedFileDataSource;
    private h fileDataSource;
    private final LongSparseArray<Uri> mtprotoUris;
    private h rawResourceDataSource;
    private h rtmpDataSource;
    private FileStreamLoadOperation streamLoadOperation;
    private final List<c0> transferListeners;

    public ExtendedDefaultDataSource(Context context, String str, boolean z10) {
        this(context, str, 8000, 8000, z10);
    }

    private void addListenersToDataSource(h hVar) {
        for (int i10 = 0; i10 < this.transferListeners.size(); i10++) {
            hVar.addTransferListener(this.transferListeners.get(i10));
        }
    }

    private h getAssetDataSource() {
        if (this.assetDataSource == null) {
            b bVar = new b(this.context);
            this.assetDataSource = bVar;
            addListenersToDataSource(bVar);
        }
        return this.assetDataSource;
    }

    private h getContentDataSource() {
        if (this.contentDataSource == null) {
            e eVar = new e(this.context);
            this.contentDataSource = eVar;
            addListenersToDataSource(eVar);
        }
        return this.contentDataSource;
    }

    private h getDataSchemeDataSource() {
        if (this.dataSchemeDataSource == null) {
            f fVar = new f(false);
            this.dataSchemeDataSource = fVar;
            addListenersToDataSource(fVar);
        }
        return this.dataSchemeDataSource;
    }

    private h getEncryptedFileDataSource() {
        if (this.encryptedFileDataSource == null) {
            EncryptedFileDataSource encryptedFileDataSource = new EncryptedFileDataSource();
            this.encryptedFileDataSource = encryptedFileDataSource;
            addListenersToDataSource(encryptedFileDataSource);
        }
        return this.encryptedFileDataSource;
    }

    private h getFileDataSource() {
        if (this.fileDataSource == null) {
            t tVar = new t(false);
            this.fileDataSource = tVar;
            addListenersToDataSource(tVar);
        }
        return this.fileDataSource;
    }

    private h getRawResourceDataSource() {
        if (this.rawResourceDataSource == null) {
            a0 a0Var = new a0(this.context);
            this.rawResourceDataSource = a0Var;
            addListenersToDataSource(a0Var);
        }
        return this.rawResourceDataSource;
    }

    private h getRtmpDataSource() {
        if (this.rtmpDataSource == null) {
            try {
                h hVar = (h) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.rtmpDataSource = hVar;
                addListenersToDataSource(hVar);
            } catch (ClassNotFoundException unused) {
                Log.w(TAG, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.rtmpDataSource == null) {
                this.rtmpDataSource = this.baseDataSource;
            }
        }
        return this.rtmpDataSource;
    }

    private h getStreamDataSource() {
        if (this.streamLoadOperation == null) {
            FileStreamLoadOperation fileStreamLoadOperation = new FileStreamLoadOperation();
            this.streamLoadOperation = fileStreamLoadOperation;
            addListenersToDataSource(fileStreamLoadOperation);
        }
        return this.streamLoadOperation;
    }

    private void maybeAddListenerToDataSource(h hVar, c0 c0Var) {
        if (hVar != null) {
            hVar.addTransferListener(c0Var);
        }
    }

    @Override // g2.h
    public void addTransferListener(c0 c0Var) {
        this.baseDataSource.addTransferListener(c0Var);
        this.transferListeners.add(c0Var);
        maybeAddListenerToDataSource(this.fileDataSource, c0Var);
        maybeAddListenerToDataSource(this.assetDataSource, c0Var);
        maybeAddListenerToDataSource(this.contentDataSource, c0Var);
        maybeAddListenerToDataSource(this.rtmpDataSource, c0Var);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, c0Var);
        maybeAddListenerToDataSource(this.rawResourceDataSource, c0Var);
    }

    @Override // g2.h
    public void close() {
        h hVar = this.dataSource;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.dataSource = null;
            }
        }
    }

    @Override // g2.h
    public Map<String, List<String>> getResponseHeaders() {
        h hVar = this.dataSource;
        return hVar == null ? Collections.EMPTY_MAP : hVar.getResponseHeaders();
    }

    @Override // g2.h
    public Uri getUri() {
        h hVar = this.dataSource;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override // g2.h
    public long open(m mVar) {
        d.g(this.dataSource == null);
        Uri uri = mVar.a;
        if ("mtproto".equals(uri.getScheme())) {
            uri = this.mtprotoUris.get(Long.parseLong(mVar.a.toString().substring(8)));
            l a2 = mVar.a();
            a2.e = uri;
            mVar = a2.d();
        }
        String scheme = uri.getScheme();
        String str = d0.a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Objects.equals(scheme2, "file")) {
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
        return this.dataSource.open(mVar);
    }

    @Override // b2.k
    public int read(byte[] bArr, int i10, int i11) {
        h hVar = this.dataSource;
        hVar.getClass();
        return hVar.read(bArr, i10, i11);
    }

    public ExtendedDefaultDataSource(Context context, String str, int i10, int i11, boolean z10) {
        this(context, new r(str, i10, i11, z10, new of.b(14)), (LongSparseArray<Uri>) null);
    }

    public ExtendedDefaultDataSource(Context context, h hVar, LongSparseArray<Uri> longSparseArray) {
        this.context = context.getApplicationContext();
        hVar.getClass();
        this.baseDataSource = hVar;
        this.transferListeners = new ArrayList();
        this.mtprotoUris = longSparseArray;
    }

    @Deprecated
    public ExtendedDefaultDataSource(Context context, c0 c0Var, h hVar, LongSparseArray<Uri> longSparseArray) {
        this(context, hVar, longSparseArray);
        if (c0Var != null) {
            this.transferListeners.add(c0Var);
            hVar.addTransferListener(c0Var);
        }
    }
}
