package c8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class m0 {
    public m0() {
        new ConcurrentHashMap();
    }

    public abstract Typeface a(Context context, h0.e eVar, Resources resources, int i7);

    public abstract Typeface b(Context context, o0.h[] hVarArr, int i7);

    public Typeface c(Context context, List list, int i7) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File d = n0.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (n0.c(d, inputStream)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i7, String str, int i10) {
        File d = n0.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (n0.b(d, resources, i7)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public o0.h f(o0.h[] hVarArr, int i7) {
        new nb.a(11);
        int i10 = (i7 & 1) == 0 ? 400 : 700;
        boolean z10 = (i7 & 2) != 0;
        o0.h hVar = null;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (o0.h hVar2 : hVarArr) {
            int abs = (Math.abs(hVar2.c - i10) * 2) + (hVar2.d == z10 ? 0 : 1);
            if (hVar == null || i11 > abs) {
                hVar = hVar2;
                i11 = abs;
            }
        }
        return hVar;
    }
}
