package f7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class j8 {
    public j8() {
        new ConcurrentHashMap();
    }

    public abstract Typeface a(Context context, h0.e eVar, Resources resources, int i9);

    public abstract Typeface b(Context context, o0.i[] iVarArr, int i9);

    public Typeface c(Context context, List list, int i9) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File d = k8.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (k8.c(inputStream, d)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i9, String str, int i10) {
        File d = k8.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (k8.b(d, resources, i9)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public o0.i f(o0.i[] iVarArr, int i9) {
        new wa.a(9);
        int i10 = (i9 & 1) == 0 ? 400 : 700;
        boolean z10 = (i9 & 2) != 0;
        o0.i iVar = null;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (o0.i iVar2 : iVarArr) {
            int abs = (Math.abs(iVar2.c - i10) * 2) + (iVar2.d == z10 ? 0 : 1);
            if (iVar == null || i11 > abs) {
                iVar = iVar2;
                i11 = abs;
            }
        }
        return iVar;
    }
}
