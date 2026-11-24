// default package

import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.app.RemoteAction;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.provider.Settings;
import android.util.Rational;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class efb {
    public final yc3 a;
    public LaunchActivity b;
    public hfb c;
    public a26 d;
    public ad8 e;
    public ad8 f;
    public bd8 g;
    public View h;
    public boolean i;
    public boolean j;
    public uw6 k;
    public String n;
    public boolean o;
    public boolean q;
    public String r;
    public boolean u;
    public final RectF l = new RectF();
    public final int[] m = new int[2];
    public final Rect p = new Rect();
    public final StringBuilder s = new StringBuilder();
    public final ArrayList t = new ArrayList();
    public final zk v = new zk(this, 13);

    public efb(yc3 yc3Var) {
        this.a = yc3Var;
    }

    public final void a(ad8 ad8Var) {
        PictureInPictureParams b = b(ad8Var);
        String str = this.r;
        if (str == null || !str.equals(this.n)) {
            this.n = this.r;
            gm.q3(this.b, b);
        }
    }

    public final PictureInPictureParams b(ad8 ad8Var) {
        PictureInPictureParams.Builder c = fl.c();
        StringBuilder sb = this.s;
        boolean z = false;
        sb.setLength(0);
        int S = ad8Var.a.S();
        vc8 vc8Var = ad8Var.a;
        int o0 = vc8Var.o0();
        if (S > 0 && o0 > 0) {
            float f = S / o0;
            Rational rational = f < 0.45f ? new Rational(45, 100) : f > 2.35f ? new Rational(235, 100) : new Rational(S, o0);
            c.setAspectRatio(rational);
            sb.append(rational);
        }
        byte b = ad8Var.c;
        Rect rect = this.p;
        if (b != 2) {
            this.q = e(ad8Var, rect);
        }
        if (this.q) {
            c.setSourceRectHint(rect);
            sb.append('|');
            sb.append(rect.toShortString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.t;
        arrayList2.clear();
        vc8Var.q0(this.b.getMaxNumPictureInPictureActions(), arrayList2);
        for (int i = 0; i < arrayList2.size(); i++) {
            uc8 uc8Var = (uc8) arrayList2.get(i);
            Intent intent = new Intent("org.telegram.utils.pip.ACTION");
            intent.setPackage(this.b.getPackageName());
            intent.putExtra("action_id", (int) uc8Var.a);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.b, uc8Var.a, intent, 201326592);
            Icon createWithResource = Icon.createWithResource(this.b, uc8Var.b);
            String str = uc8Var.c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, str, str, broadcast);
            remoteAction.setEnabled(uc8Var.d);
            arrayList.add(remoteAction);
        }
        arrayList2.clear();
        if (!arrayList.isEmpty() && !this.u) {
            this.u = true;
            IntentFilter intentFilter = new IntentFilter("org.telegram.utils.pip.ACTION");
            int i2 = Build.VERSION.SDK_INT;
            LaunchActivity launchActivity = this.b;
            zk zkVar = this.v;
            if (i2 >= 33) {
                launchActivity.registerReceiver(zkVar, intentFilter, 4);
            } else {
                launchActivity.registerReceiver(zkVar, intentFilter);
            }
        }
        c.setActions(arrayList);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            RemoteAction remoteAction2 = (RemoteAction) arrayList.get(i3);
            sb.append('|');
            sb.append(remoteAction2.getTitle());
            sb.append(remoteAction2.isEnabled());
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            if (i4 >= 31 && ad8Var.c != 2) {
                z = true;
            }
            c.setAutoEnterEnabled(z);
            sb.append('|');
            sb.append(z);
        }
        this.r = sb.toString();
        return c.build();
    }

    public final void c() {
        LaunchActivity launchActivity;
        h();
        if (this.u && (launchActivity = this.b) != null) {
            this.u = false;
            try {
                launchActivity.unregisterReceiver(this.v);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        hfb hfbVar = this.c;
        if (hfbVar != null) {
            gm.B2(hfbVar);
            this.c = null;
        }
        a26 a26Var = this.d;
        if (a26Var != null) {
            a26Var.a();
            this.d = null;
        }
        this.b = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        Bitmap bitmap;
        a26 a26Var;
        hfb hfbVar;
        tl4 tl4Var;
        ad8 ad8Var = this.f;
        bd8 bd8Var = this.g;
        View view = this.h;
        yc3.e("system: exit to app");
        if (ad8Var != null && view == null && bd8Var != null && ad8Var.d != 1 && bd8Var.isAvailable()) {
            try {
                bitmap = bd8Var.getBitmap();
            } catch (Throwable th) {
                fc4.g(th, true);
            }
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = false;
            this.o = false;
            a26Var = this.d;
            if (a26Var != null) {
                a26Var.b(false);
            }
            hfbVar = this.c;
            if (hfbVar != null) {
                hfbVar.a(null, null);
            }
            yc3 yc3Var = this.a;
            if (ad8Var != null) {
                vc8 vc8Var = ad8Var.a;
                if (view != null) {
                    ad8Var.c = ad8Var.d;
                    vc8Var.l(view);
                    vc8Var.K(view);
                    yc3Var.d();
                    return;
                }
                if (bd8Var != null) {
                    if (ad8Var.d != 1 || (tl4Var = ad8Var.e) == null) {
                        ad8Var.c = (byte) 0;
                        SurfaceTexture surfaceTexture = bd8Var.a;
                        bd8Var.a = null;
                        if (surfaceTexture == null && Build.VERSION.SDK_INT >= 26) {
                            surfaceTexture = fl.d();
                        }
                        if (surfaceTexture != null) {
                            vc8Var.r(surfaceTexture, bitmap);
                        }
                    } else {
                        ad8Var.c = (byte) 1;
                        tl4Var.j = bd8Var;
                        gm.B2(bd8Var);
                        tl4Var.i.addView(bd8Var, 0, qoe.c(-1.0f, -1));
                        tl4Var.a();
                        tl4Var.k();
                    }
                    yc3Var.d();
                    return;
                }
            }
            yc3Var.d();
        }
        bitmap = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = false;
        this.o = false;
        a26Var = this.d;
        if (a26Var != null) {
        }
        hfbVar = this.c;
        if (hfbVar != null) {
        }
        yc3 yc3Var2 = this.a;
        if (ad8Var != null) {
        }
        yc3Var2.d();
    }

    public final boolean e(ad8 ad8Var, Rect rect) {
        if (this.b != null) {
            if (ad8Var.f()) {
                tl4 tl4Var = ad8Var.e;
                RectF rectF = this.l;
                tl4Var.g(rectF);
                rectF.round(rect);
            } else {
                ad8Var.a.I(rect);
            }
            if (!rect.isEmpty()) {
                View decorView = this.b.getWindow().getDecorView();
                int[] iArr = this.m;
                decorView.getLocationOnScreen(iArr);
                rect.offset(-iArr[0], -iArr[1]);
                float width = rect.width() / rect.height();
                if (rect.intersect(0, 0, decorView.getWidth(), decorView.getHeight()) && Math.abs(((rect.width() / rect.height()) / width) - 1.0f) < 0.02f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(Object obj) {
        ad8 ad8Var;
        if (Build.VERSION.SDK_INT >= 35 && wi8.A(obj) && ((PictureInPictureUiState) obj).isTransitioningToPip() && this.f == null && (ad8Var = this.e) != null) {
            i(ad8Var);
        }
    }

    public final void g() {
        int i;
        if (this.b == null || (i = Build.VERSION.SDK_INT) < 26 || i >= 31 || this.f != null) {
            return;
        }
        j();
        ad8 ad8Var = this.e;
        if (ad8Var != null) {
            PictureInPictureParams b = b(ad8Var);
            i(this.e);
            try {
                if (this.b.enterPictureInPictureMode(b)) {
                    return;
                }
                d();
            } catch (Exception e) {
                fc4.g(e, true);
                d();
            }
        }
    }

    public final void h() {
        uw6 uw6Var = this.k;
        if (uw6Var != null) {
            try {
                synchronized (uw6.c) {
                    uw6.d.remove(uw6Var.a.i);
                }
                uw6Var.a.p();
            } catch (Exception unused) {
            }
            this.k = null;
        }
    }

    public final void i(ad8 ad8Var) {
        tl4 tl4Var;
        if (this.c == null || this.b == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("system: start enter, from state ");
        byte b = ad8Var.c;
        vc8 vc8Var = ad8Var.a;
        sb.append((int) b);
        yc3.e(sb.toString());
        Rect rect = new Rect();
        if (!e(ad8Var, rect)) {
            rect.setEmpty();
        }
        this.f = ad8Var;
        bd8 bd8Var = null;
        this.e = null;
        this.o = true;
        ad8Var.d = ad8Var.c;
        View J = ad8Var.e == null ? vc8Var.J(this.b) : null;
        boolean z = J != null && rect.isEmpty();
        a26 a26Var = this.d;
        if (a26Var != null && !z) {
            a26Var.b(true);
        }
        if (J != null) {
            if (z) {
                J.setVisibility(4);
            }
            this.c.a(J, rect);
            vc8Var.m0(J);
        } else if (ad8Var.c != 1 || (tl4Var = ad8Var.e) == null) {
            bd8Var = new bd8(this.b);
            this.c.a(bd8Var, rect);
            vc8Var.Q(bd8Var);
        } else {
            bd8 bd8Var2 = tl4Var.j;
            tl4Var.j = null;
            tl4Var.d();
            tl4Var.l();
            if (bd8Var2 != null) {
                gm.B2(bd8Var2);
            }
            this.c.a(bd8Var2, rect);
            bd8Var = bd8Var2;
        }
        this.c.bringToFront();
        this.g = bd8Var;
        this.h = J;
        ad8Var.c = (byte) 2;
        k(ad8Var);
    }

    public final void j() {
        ad8 ad8Var;
        tl4 tl4Var;
        LaunchActivity launchActivity = this.b;
        if (launchActivity == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        ad8 ad8Var2 = this.f;
        if (ad8Var2 != null) {
            if (!this.o) {
                a(ad8Var2);
            }
            k(this.f);
            return;
        }
        if (!zse.a(launchActivity) || Settings.canDrawOverlays(this.b)) {
            ad8Var = null;
        } else {
            ArrayList arrayList = (ArrayList) this.a.c;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    ad8Var = (ad8) arrayList.get(size);
                    byte b = ad8Var.c;
                    vc8 vc8Var = ad8Var.a;
                    if (b == 0 && vc8Var.O() == null && vc8Var.P() && vc8Var.V()) {
                        break;
                    } else {
                        size--;
                    }
                } else {
                    ad8Var = null;
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        ad8 ad8Var3 = (ad8) arrayList.get(size2);
                        byte b2 = ad8Var3.c;
                        vc8 vc8Var2 = ad8Var3.a;
                        if (b2 == 1 && vc8Var2.V() && ((tl4Var = ad8Var3.e) == null ? !(!ad8Var3.f || ad8Var3.g) : !(tl4Var.f || tl4Var.k != null)) && (ad8Var == null || vc8Var2.p() > ad8Var.a.p())) {
                            ad8Var = ad8Var3;
                        }
                    }
                    if (ad8Var == null) {
                        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                            ad8 ad8Var4 = (ad8) arrayList.get(size3);
                            byte b3 = ad8Var4.c;
                            vc8 vc8Var3 = ad8Var4.a;
                            if (b3 == 0 && vc8Var3.a0() && vc8Var3.V() && (ad8Var == null || vc8Var3.p() > ad8Var.a.p())) {
                                ad8Var = ad8Var4;
                            }
                        }
                    }
                }
            }
        }
        this.e = ad8Var;
        if (ad8Var != null) {
            this.j = true;
            a(ad8Var);
        } else if (this.j) {
            this.j = false;
            this.n = null;
            gm.X2(this.b);
        }
        h();
    }

    public final void k(ad8 ad8Var) {
        re8 Y = ad8Var != null ? ad8Var.a.Y() : null;
        if (Y == null) {
            h();
            return;
        }
        uw6 uw6Var = this.k;
        if (uw6Var != null) {
            tx6 tx6Var = uw6Var.a;
            tx6Var.t();
            if (tx6Var.t.a == Y) {
                return;
            }
        }
        h();
        try {
            ow6 ow6Var = new ow6(this.b, Y);
            ow6Var.c = "utils-pip-media-session";
            this.k = ow6Var.a();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
