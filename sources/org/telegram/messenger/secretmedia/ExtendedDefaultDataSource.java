package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import b8.zb;
import g2.n0;
import i2.b;
import i2.b0;
import i2.d0;
import i2.e;
import i2.f;
import i2.h;
import i2.m;
import i2.n;
import i2.s;
import i2.u;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.s8;
import p4.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    private s8 streamLoadOperation;
    private final List<d0> transferListeners;

    public ExtendedDefaultDataSource(Context context, String str, boolean z10) {
        this(context, str, 8000, 8000, z10);
    }

    private void addListenersToDataSource(h hVar) {
        for (int i3 = 0; i3 < this.transferListeners.size(); i3++) {
            hVar.addTransferListener(this.transferListeners.get(i3));
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
            u uVar = new u(false);
            this.fileDataSource = uVar;
            addListenersToDataSource(uVar);
        }
        return this.fileDataSource;
    }

    private h getRawResourceDataSource() {
        if (this.rawResourceDataSource == null) {
            b0 b0Var = new b0(this.context);
            this.rawResourceDataSource = b0Var;
            addListenersToDataSource(b0Var);
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
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.rtmpDataSource == null) {
                this.rtmpDataSource = this.baseDataSource;
            }
        }
        return this.rtmpDataSource;
    }

    private h getStreamDataSource() {
        if (this.streamLoadOperation == null) {
            s8 s8Var = new s8();
            this.streamLoadOperation = s8Var;
            addListenersToDataSource(s8Var);
        }
        return this.streamLoadOperation;
    }

    private void maybeAddListenerToDataSource(h hVar, d0 d0Var) {
        if (hVar != null) {
            hVar.addTransferListener(d0Var);
        }
    }

    @Override // i2.h
    public void addTransferListener(d0 d0Var) {
        this.baseDataSource.addTransferListener(d0Var);
        this.transferListeners.add(d0Var);
        maybeAddListenerToDataSource(this.fileDataSource, d0Var);
        maybeAddListenerToDataSource(this.assetDataSource, d0Var);
        maybeAddListenerToDataSource(this.contentDataSource, d0Var);
        maybeAddListenerToDataSource(this.rtmpDataSource, d0Var);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, d0Var);
        maybeAddListenerToDataSource(this.rawResourceDataSource, d0Var);
    }

    @Override // i2.h
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

    @Override // i2.h
    public Map<String, List<String>> getResponseHeaders() {
        h hVar = this.dataSource;
        return hVar == null ? Collections.EMPTY_MAP : hVar.getResponseHeaders();
    }

    @Override // i2.h
    public Uri getUri() {
        h hVar = this.dataSource;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override // i2.h
    public long open(n nVar) {
        zb.p(this.dataSource == null);
        Uri uri = nVar.a;
        if ("mtproto".equals(uri.getScheme())) {
            uri = this.mtprotoUris.get(Long.parseLong(nVar.a.toString().substring(8)));
            m a10 = nVar.a();
            a10.e = uri;
            nVar = a10.d();
        }
        String scheme = uri.getScheme();
        String str = n0.a;
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
        return this.dataSource.open(nVar);
    }

    @Override // d2.o
    public int read(byte[] bArr, int i3, int i10) {
        h hVar = this.dataSource;
        hVar.getClass();
        return hVar.read(bArr, i3, i10);
    }

    public ExtendedDefaultDataSource(Context context, String str, int i3, int i10, boolean z10) {
        this(context, new s(str, i3, i10, z10, new q(23)), (LongSparseArray<Uri>) null);
    }

    public ExtendedDefaultDataSource(Context context, h hVar, LongSparseArray<Uri> longSparseArray) {
        this.context = context.getApplicationContext();
        hVar.getClass();
        this.baseDataSource = hVar;
        this.transferListeners = new ArrayList();
        this.mtprotoUris = longSparseArray;
    }

    @Deprecated
    public ExtendedDefaultDataSource(Context context, d0 d0Var, h hVar, LongSparseArray<Uri> longSparseArray) {
        this(context, hVar, longSparseArray);
        if (d0Var != null) {
            this.transferListeners.add(d0Var);
            hVar.addTransferListener(d0Var);
        }
    }
}
