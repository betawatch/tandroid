package bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import c8.bc;
import java.util.ArrayList;
import org.telegram.messenger.n10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class m7 implements org.telegram.ui.ActionBar.u4, yb.a {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    @Override // org.telegram.ui.ActionBar.u4
    public boolean a() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public boolean b(org.telegram.ui.ActionBar.r0 r0Var, RectF rectF) {
        float L = org.telegram.messenger.g0.L(6.0f);
        rectF.set(L, L, ((FrameLayout) this.b).getWidth() - r4, ((FrameLayout) this.b).getHeight() - r4);
        return true;
    }

    @Override // yb.a
    public ArrayList c(ub.a aVar) {
        Bitmap createBitmap;
        if (((a8.z0) this.e) == null) {
            zzb();
        }
        if (((a8.z0) this.e) == null) {
            throw new lb.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
        }
        int i7 = aVar.e;
        if (i7 != -1) {
            if (i7 == 17) {
                q6.m.h(null);
                throw null;
            }
            if (i7 == 35) {
                q6.m.h(null);
                throw null;
            }
            if (i7 != 842094169) {
                throw new lb.a("Unsupported image format", 13);
            }
            q6.m.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.a;
        q6.m.h(bitmap);
        int i10 = aVar.d;
        int i11 = aVar.b;
        int i12 = aVar.c;
        if (i10 == 0) {
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
        } else {
            Matrix matrix = new Matrix();
            matrix.postRotate(i10);
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
        }
        try {
            a8.z0 z0Var = (a8.z0) this.e;
            q6.m.h(z0Var);
            a7.b bVar = new a7.b(createBitmap);
            Parcel p12 = z0Var.p1();
            int i13 = a8.g0.a;
            p12.writeStrongBinder(bVar);
            p12.writeInt(1);
            int r10 = bc.r(p12, 20293);
            bc.q(p12, 2, 4);
            p12.writeInt(-1);
            bc.s(p12, r10);
            Parcel r12 = z0Var.r1(p12, 1);
            a8.y4[] y4VarArr = (a8.y4[]) r12.createTypedArray(a8.y4.CREATOR);
            r12.recycle();
            ArrayList arrayList = new ArrayList();
            for (a8.y4 y4Var : y4VarArr) {
                arrayList.add(new wb.a(y4Var.c, y4Var.d, y4Var.b, y4Var.a));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new lb.a("Failed to run legacy image labeler.", e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public fh.g g(org.telegram.ui.ActionBar.k5 k5Var) {
        g8 g8Var = (g8) this.e;
        fh.g c10 = g8Var.getBaseSimpleGlass().d.c(k5Var, null, false);
        c10.p(g8Var.N);
        n10.s(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = ((g8) this.e).N;
        return eVar.a(eVar.e);
    }

    @Override // org.telegram.ui.ActionBar.u4
    public gh.a getButtonsGlassColorProvider() {
        return ((g8) this.e).N;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* synthetic */ int getMenuAnchorTint() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* synthetic */ int getMenuDimAlpha() {
        return -1;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* synthetic */ int getMenuExtraBelow() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public gh.a getMenuGlassColorProvider() {
        return ((g8) this.e).N;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public View getMenuHostView() {
        return (FrameLayout) this.b;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* synthetic */ int getMenuMaxHeight() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public org.telegram.ui.ActionBar.i6 getMenuResourcesProvider() {
        org.telegram.ui.ActionBar.i6 i6Var;
        i6Var = ((org.telegram.ui.ActionBar.h2) ((g8) this.e)).resourceProvider;
        return i6Var;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public int getMenuRise() {
        return org.telegram.messenger.g0.L(8.0f);
    }

    @Override // org.telegram.ui.ActionBar.u4
    public View getMenuView() {
        return (l7) this.c;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public org.telegram.ui.ActionBar.k5 getOpenMenuOverlay() {
        if (this.a) {
            return (org.telegram.ui.ActionBar.k5) this.d;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public void h(org.telegram.ui.ActionBar.k5 k5Var, org.telegram.ui.ActionBar.r0 r0Var) {
        boolean z10 = k5Var != null;
        this.a = z10;
        ((FrameLayout) this.b).setVisibility(z10 ? 4 : 0);
    }

    @Override // org.telegram.ui.ActionBar.u4
    public void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = ((g8) this.e).getBaseSimpleGlass().e;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    @Override // yb.a
    public void zzb() {
        a8.x3 v1Var;
        String str = (String) this.d;
        Context context = (Context) this.b;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (((a8.z0) this.e) != null) {
            return;
        }
        try {
            IBinder b10 = b7.f.c(context, b7.f.b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
            int i7 = a8.w2.b;
            if (b10 == null) {
                v1Var = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                v1Var = queryLocalInterface instanceof a8.x3 ? (a8.x3) queryLocalInterface : new a8.v1(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 0);
            }
            a8.z0 x12 = ((a8.v1) v1Var).x1(new a7.b(context), (a8.y6) this.c);
            this.e = x12;
            if (x12 != null || this.a) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            pb.j.b(context);
            this.a = true;
        } catch (RemoteException e10) {
            throw new lb.a("Failed to create legacy image labeler.", e10);
        } catch (b7.b e11) {
            if (str.equals("com.google.android.gms.vision.dynamite")) {
                throw new lb.a("Failed to load deprecated vision dynamite module.", e11);
            }
            if (this.a) {
                return;
            }
            Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
            pb.j.b(context);
            this.a = true;
        }
    }

    @Override // yb.a
    public void zzc() {
        a8.z0 z0Var = (a8.z0) this.e;
        if (z0Var != null) {
            try {
                z0Var.t1(z0Var.p1(), 2);
            } catch (RemoteException e10) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e10);
            }
            this.e = null;
        }
    }
}
