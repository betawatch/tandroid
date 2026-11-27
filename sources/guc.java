// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class guc implements to6, ws4, ww6 {
    public static final int[] f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public final Object e;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public guc(Context context, fj8 fj8Var, final a70 a70Var, boolean z, int i, vnb vnbVar) {
        int i2;
        final byte b = 1;
        final byte b2 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z ? R.drawable.popup_fixed_alert : 0, 0, vnbVar, context);
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.d = a70Var;
        if (fj8Var != null) {
            s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, ob6.M0(2131753749, null), false, vnbVar).setOnClickListener(new y60(fj8Var, (byte) 0));
        }
        s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, ob6.M0(2131753874, null), false, vnbVar).setOnClickListener(new View.OnClickListener(this) { // from class: z60
            public final /* synthetic */ guc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                a70 a70Var2 = a70Var;
                guc gucVar = this.b;
                switch (b3) {
                    case 0:
                        gucVar.o();
                        a70Var2.H(86400, 70);
                        break;
                    case 1:
                        gucVar.o();
                        a70Var2.H(604800, 70);
                        break;
                    case 2:
                        gucVar.o();
                        a70Var2.H(2678400, 70);
                        break;
                    default:
                        gucVar.o();
                        a70Var2.H(0, 71);
                        break;
                }
            }
        });
        s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, ob6.M0(2131753871, null), false, vnbVar).setOnClickListener(new View.OnClickListener(this) { // from class: z60
            public final /* synthetic */ guc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                a70 a70Var2 = a70Var;
                guc gucVar = this.b;
                switch (b3) {
                    case 0:
                        gucVar.o();
                        a70Var2.H(86400, 70);
                        break;
                    case 1:
                        gucVar.o();
                        a70Var2.H(604800, 70);
                        break;
                    case 2:
                        gucVar.o();
                        a70Var2.H(2678400, 70);
                        break;
                    default:
                        gucVar.o();
                        a70Var2.H(0, 71);
                        break;
                }
            }
        });
        final byte b3 = 2;
        s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, ob6.M0(2131753873, null), false, vnbVar).setOnClickListener(new View.OnClickListener(this) { // from class: z60
            public final /* synthetic */ guc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                a70 a70Var2 = a70Var;
                guc gucVar = this.b;
                switch (b32) {
                    case 0:
                        gucVar.o();
                        a70Var2.H(86400, 70);
                        break;
                    case 1:
                        gucVar.o();
                        a70Var2.H(604800, 70);
                        break;
                    case 2:
                        gucVar.o();
                        a70Var2.H(2678400, 70);
                        break;
                    default:
                        gucVar.o();
                        a70Var2.H(0, 71);
                        break;
                }
            }
        });
        s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i == 1 ? ob6.M0(2131753856, null) : ob6.M0(2131753857, null), false, vnbVar).setOnClickListener(new cg(this, context, i, vnbVar, a70Var));
        b8 c = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, ob6.M0(2131753855, null), false, vnbVar);
        this.c = c;
        final byte b4 = 3;
        c.setOnClickListener(new View.OnClickListener(this) { // from class: z60
            public final /* synthetic */ guc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b4;
                a70 a70Var2 = a70Var;
                guc gucVar = this.b;
                switch (b32) {
                    case 0:
                        gucVar.o();
                        a70Var2.H(86400, 70);
                        break;
                    case 1:
                        gucVar.o();
                        a70Var2.H(604800, 70);
                        break;
                    case 2:
                        gucVar.o();
                        a70Var2.H(2678400, 70);
                        break;
                    default:
                        gucVar.o();
                        a70Var2.H(0, 71);
                        break;
                }
            }
        });
        byte b5 = 8;
        if (i != 1) {
            if (vnbVar != null) {
                int i3 = aob.q7;
                xz xzVar = new xz(b5);
                xz xzVar2 = new xz((byte) 9);
                int P = yob.P(i3, -1, 0, 0.0f, null);
                xzVar2.e(P, c);
                sob w = yob.w(100, c);
                w.c(i3, -1, 0, 0.0f, null);
                w.n = xzVar;
                w.o = xzVar2;
                w.m = false;
                w.g = P;
                i2 = 1;
                if (i == i2) {
                    k8 k8Var = new k8(context, vnbVar);
                    yob.h(aob.H8, vnbVar, k8Var);
                    k8Var.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(k8Var, tre.o(-1, 8));
                    p66 p66Var = new p66(context, null);
                    this.e = p66Var;
                    p66Var.setTag(R.id.fit_width_tag, 1);
                    p66Var.setPadding(hl.L(13.0f), 0, hl.L(13.0f), hl.L(8.0f));
                    p66Var.setTextSize(1, 13.0f);
                    yob.X(p66Var, aob.E8, null);
                    p66Var.setMovementMethod(LinkMovementMethod.getInstance());
                    yob.G(p66Var, aob.J6, null);
                    p66Var.setText(ob6.M0(2131753841, null));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(p66Var, tre.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    return;
                }
                return;
            }
            int i4 = aob.q7;
            c.c(i4, i4);
        }
        i2 = 1;
        if (i == i2) {
        }
    }

    public final void A(float f2, float f3) {
        float f4 = hl.p;
        j(f2, f3, y(0.0f, 6.2831855f), y(0.0f, 28.0f) * f4, y(1.5f, 3.5f) * f4, y(0.35f, 0.6f), 2.0f);
    }

    public final void B(int i) {
        if (System.currentTimeMillis() - this.a < 200) {
            hl.c3(new zd((Object) this, i, (byte) 7));
            return;
        }
        b8 b8Var = (b8) this.c;
        if (i == 0) {
            b8Var.setVisibility(8);
        } else {
            b8Var.setVisibility(0);
        }
    }

    public final void C() {
        long j;
        Uri uri;
        nt6 nt6Var;
        Uri uri2;
        qy6 qy6Var = (qy6) this.e;
        yx6 yx6Var = qy6Var.j;
        yx6Var.t();
        og8 og8Var = yx6Var.t;
        ft6 S0 = og8Var.S0();
        nt6 U0 = og8Var.U0();
        long j2 = -9223372036854775807L;
        if ((!og8Var.m0(16) || !og8Var.P0()) && og8Var.m0(16)) {
            j2 = og8Var.getDuration();
        }
        String str = S0 != null ? S0.a : "";
        Bitmap bitmap = null;
        Uri uri3 = (S0 == null || (uri2 = S0.f.a) == null) ? null : uri2;
        if (Objects.equals((nt6) this.b, U0) && Objects.equals((String) this.c, str) && Objects.equals((Uri) this.d, uri3) && this.a == j2) {
            return;
        }
        this.c = str;
        this.d = uri3;
        this.b = U0;
        this.a = j2;
        x76 X = yx6Var.m.X(U0);
        if (X != null) {
            qy6Var.u = null;
            if (!X.isDone()) {
                j = j2;
                uri = uri3;
                nt6Var = U0;
                guc gucVar = new guc(this, nt6Var, str, uri, j);
                str = str;
                qy6Var.u = gucVar;
                Handler handler = yx6Var.l;
                Objects.requireNonNull(handler);
                X.b(new xs4((Object) X, (Object) gucVar, (byte) 0), new i40(handler, (byte) 1));
                qy6Var.p.M(n26.b(nt6Var, str, uri, j, bitmap));
            }
            try {
                bitmap = (Bitmap) fne.a(X);
            } catch (CancellationException | ExecutionException e) {
                efd.f("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
            }
        }
        j = j2;
        uri = uri3;
        nt6Var = U0;
        qy6Var.p.M(n26.b(nt6Var, str, uri, j, bitmap));
    }

    public final void D(asb asbVar) {
        qy6 qy6Var = (qy6) this.e;
        yx6 yx6Var = qy6Var.j;
        if (!qy6Var.l0() || asbVar.p()) {
            qy6Var.p.P(null);
            return;
        }
        int i = n26.a;
        ArrayList arrayList = new ArrayList();
        zrb zrbVar = new zrb();
        for (int i2 = 0; i2 < asbVar.o(); i2++) {
            arrayList.add(asbVar.m(i2, zrbVar, 0L).b);
        }
        ArrayList arrayList2 = new ArrayList();
        oy6 oy6Var = new oy6(this, new AtomicInteger(0), arrayList, arrayList2, (byte) 0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr = ((ft6) arrayList.get(i3)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                oy6Var.run();
            } else {
                x76 b0 = yx6Var.m.b0(bArr);
                arrayList2.add(b0);
                Handler handler = yx6Var.l;
                Objects.requireNonNull(handler);
                b0.b(oy6Var, new i40(handler, (byte) 1));
            }
        }
    }

    @Override // ww6
    public final void a(int i, h9a h9aVar) {
        Bundle bundle = Bundle.EMPTY;
        boolean isEmpty = bundle.isEmpty();
        Bundle bundle2 = h9aVar.c;
        if (isEmpty) {
            bundle = bundle2;
        } else if (!bundle2.isEmpty()) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        qx6 qx6Var = ((qy6) this.e).p;
        String str = h9aVar.b;
        qx6Var.getClass();
        if (TextUtils.isEmpty(str)) {
            lq5.j("event cannot be null or empty");
        } else {
            ((gx6) qx6Var.b).a.sendSessionEvent(str, bundle);
        }
    }

    @Override // ww6
    public final void f(int i, zf8 zf8Var) {
        qy6 qy6Var = (qy6) this.e;
        yx6 yx6Var = qy6Var.j;
        yx6Var.t();
        og8 og8Var = yx6Var.t;
        byte b = og8Var.m0(20) ? (byte) 4 : (byte) 0;
        if (qy6Var.v != b) {
            qy6Var.v = b;
            ((gx6) qy6Var.p.b).a.setFlags(b | 3);
        }
        qy6Var.q0(og8Var);
    }

    @Override // ww6
    public final void i(int i, daa daaVar, boolean z, boolean z2, int i2) {
        qy6 qy6Var = (qy6) this.e;
        yx6 yx6Var = qy6Var.j;
        yx6Var.t();
        qy6Var.q0(yx6Var.t);
    }

    public final fuc j(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            this.a = SystemClock.uptimeMillis();
        }
        fuc fucVar = new fuc();
        fucVar.l = 1.0f;
        fucVar.a = f2;
        fucVar.b = f3;
        double d = f4;
        fucVar.c = ((float) Math.cos(d)) * f5;
        fucVar.d = ((float) Math.sin(d)) * f5;
        fucVar.e = f6;
        fucVar.f = f7;
        fucVar.g = f8;
        fucVar.k = f[((Random) this.c).nextInt(6)];
        fucVar.h = y(0.0f, 90.0f);
        fucVar.i = y(-180.0f, 180.0f);
        arrayList.add(fucVar);
        return fucVar;
    }

    @Override // ws4
    public final void k(Throwable th) {
        if (this != ((qy6) ((guc) this.e).e).u) {
            return;
        }
        efd.f("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
    }

    public final void l(float f2, float f3) {
        float f4 = hl.p;
        for (int i = 0; i < 28; i++) {
            j(f2, f3, y(0.0f, 6.2831855f), y(60.0f, 300.0f) * f4, y(2.5f, 6.0f) * f4, y(0.5f, 0.9f), 3.0f);
        }
    }

    public final boolean m() {
        return ((oec) this.b).V;
    }

    public final void n(long j, float f2) {
        File file = (File) this.c;
        oec oecVar = (oec) this.b;
        if (oecVar.V) {
            return;
        }
        long length = j < 0 ? file.length() : j;
        if (oecVar.X || this.a != length) {
            this.a = length;
            MediaController mediaController = (MediaController) this.e;
            so6 so6Var = (so6) this.d;
            String[] strArr = MediaController.W1;
            oec oecVar2 = so6Var.b;
            boolean z = oecVar2.W;
            if (z) {
                oecVar2.W = false;
            }
            hl.c3(new nn6(mediaController, false, false, so6Var, file, f2, 0L, z, length));
        }
    }

    public final void o() {
        ((a70) this.d).dismiss();
        this.a = System.currentTimeMillis();
    }

    @Override // ws4
    public final void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        qy6 qy6Var = (qy6) ((guc) this.e).e;
        if (this != qy6Var.u) {
            return;
        }
        qy6Var.p.M(n26.b((nt6) this.b, (String) this.c, (Uri) this.d, this.a, bitmap));
        yx6 yx6Var = qy6Var.j;
        gcc.X(yx6Var.o, new sx6(yx6Var, (byte) 0));
    }

    public final void p(Canvas canvas) {
        Paint paint = (Paint) this.d;
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, (uptimeMillis - this.a) / 1000.0f);
        this.a = uptimeMillis;
        ArrayList arrayList = (ArrayList) this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            fuc fucVar = (fuc) arrayList.get(size);
            float f2 = fucVar.j + min;
            fucVar.j = f2;
            if (f2 >= 0.0f) {
                if (f2 >= fucVar.f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-fucVar.g) * min);
                    float f3 = fucVar.c * exp;
                    fucVar.c = f3;
                    float f4 = fucVar.d * exp;
                    fucVar.d = f4;
                    fucVar.a = (f3 * min) + fucVar.a;
                    fucVar.b = (f4 * min) + fucVar.b;
                    fucVar.h = (fucVar.i * min) + fucVar.h;
                    float f5 = fucVar.j / fucVar.f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f5 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f5) * fucVar.l;
                    float B = xnb.B(f5, 0.5f, 1.0f, fucVar.e);
                    int save = canvas.save();
                    canvas.translate(fucVar.a, fucVar.b);
                    canvas.rotate(fucVar.h);
                    canvas.scale(B, B);
                    paint.setColor(fucVar.k);
                    paint.setAlpha(Math.round(20.4f * min2));
                    canvas.drawCircle(0.0f, 0.0f, 1.4f, paint);
                    paint.setAlpha(Math.round(min2 * 255.0f));
                    canvas.drawPath((Path) this.e, paint);
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    public final boolean q() {
        return !((ArrayList) this.b).isEmpty();
    }

    public final void r() {
        qy6 qy6Var = (qy6) this.e;
        yx6 yx6Var = qy6Var.j;
        yx6Var.t();
        og8 og8Var = yx6Var.t;
        og8Var.H().getClass();
        ((gx6) qy6Var.p.b).a.setPlaybackToLocal((og8Var.m0(21) ? og8Var.F() : oz.i).b());
    }

    public final void s(ft6 ft6Var) {
        C();
        qy6 qy6Var = (qy6) this.e;
        qx6 qx6Var = qy6Var.p;
        if (ft6Var == null) {
            ((gx6) qx6Var.b).a.setRatingType(0);
        } else {
            ((gx6) qx6Var.b).a.setRatingType(n26.e(ft6Var.d.i));
        }
        yx6 yx6Var = qy6Var.j;
        yx6Var.t();
        qy6Var.q0(yx6Var.t);
    }

    public final void t(int i, og8 og8Var) {
        qy6 qy6Var = (qy6) this.e;
        x(og8Var.T0());
        u(og8Var.m0(18) ? og8Var.g0() : nt6.M);
        og8Var.U0();
        C();
        w(og8Var.F0());
        v(og8Var.x0());
        og8Var.H();
        r();
        byte b = og8Var.m0(20) ? (byte) 4 : (byte) 0;
        if (qy6Var.v != b) {
            qy6Var.v = b;
            ((gx6) qy6Var.p.b).a.setFlags(b | 3);
        }
        s(og8Var.S0());
    }

    public final void u(nt6 nt6Var) {
        qy6 qy6Var = (qy6) this.e;
        qx6 qx6Var = qy6Var.p;
        CharSequence queueTitle = ((xo6) ((kj4) qx6Var.c).b).a.getQueueTitle();
        CharSequence charSequence = nt6Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        if (!qy6Var.l0()) {
            charSequence = null;
        }
        ((gx6) qx6Var.b).a.setQueueTitle(charSequence);
    }

    public final void v(int i) {
        qx6 qx6Var = ((qy6) this.e).p;
        int i2 = n26.a;
        byte b = 0;
        if (i != 0) {
            if (i == 1) {
                b = 1;
            } else if (i != 2) {
                efd.f("LegacyConversions", "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
            } else {
                b = 2;
            }
        }
        gx6 gx6Var = (gx6) qx6Var.b;
        if (gx6Var.j != b) {
            gx6Var.j = b;
            synchronized (gx6Var.d) {
                int beginBroadcast = gx6Var.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = gx6Var.f;
                    if (beginBroadcast >= 0) {
                        try {
                            ((jk5) remoteCallbackList.getBroadcastItem(beginBroadcast)).g(b);
                        } catch (RemoteException | SecurityException e) {
                            efd.d("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                        }
                        beginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    public final void w(boolean z) {
        qx6 qx6Var = ((qy6) this.e).p;
        int i = n26.a;
        gx6 gx6Var = (gx6) qx6Var.b;
        if (gx6Var.k != z) {
            gx6Var.k = z ? 1 : 0;
            synchronized (gx6Var.d) {
                int beginBroadcast = gx6Var.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = gx6Var.f;
                    if (beginBroadcast >= 0) {
                        try {
                            ((jk5) remoteCallbackList.getBroadcastItem(beginBroadcast)).i(z ? 1 : 0);
                        } catch (RemoteException | SecurityException e) {
                            efd.d("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                        }
                        beginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    public final void x(asb asbVar) {
        D(asbVar);
        C();
    }

    public final float y(float f2, float f3) {
        return qd4.A(f3, f2, ((Random) this.c).nextFloat(), f2);
    }

    public final void z() {
        ((ArrayList) this.b).clear();
        float f2 = hl.p;
        for (int i = 0; i < 48; i++) {
            int i2 = -1;
            while (i2 <= 1) {
                guc gucVar = this;
                fuc j = gucVar.j(0.0f, (this.y(-3.0f, 3.0f) * f2) + 0.0f, this.y(-0.6f, 0.6f) + (i2 < 0 ? 3.1415927f : 0.0f), this.y(150.0f, 310.0f) * f2, this.y(1.3f, 3.2f) * f2, this.y(0.65f, 1.05f), 1.8f);
                j.k = -6562049;
                j.l = gucVar.y(0.3f, 1.0f);
                j.j = (-i) * 0.006f;
                i2 += 2;
                this = gucVar;
            }
        }
    }

    @Override // ww6
    public final void e() {
    }

    @Override // ww6
    public final void b(int i) {
    }

    @Override // ww6
    public final void d(int i, u26 u26Var) {
    }

    @Override // ww6
    public final void g(int i, gaa gaaVar) {
    }

    @Override // ww6
    public final void c(int i, int i2, int i3) {
    }

    @Override // ww6
    public final void h(int i, kg8 kg8Var, zf8 zf8Var, boolean z, boolean z2) {
    }

    public guc() {
        this.b = new ArrayList();
        this.c = new Random();
        this.d = new Paint(1);
        Path path = new Path();
        this.e = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public guc(qy6 qy6Var) {
        this.e = qy6Var;
        this.b = nt6.M;
        this.c = "";
        this.a = -9223372036854775807L;
    }

    public guc(guc gucVar, nt6 nt6Var, String str, Uri uri, long j) {
        this.e = gucVar;
        this.b = nt6Var;
        this.c = str;
        this.d = uri;
        this.a = j;
    }

    public guc(MediaController mediaController, oec oecVar, File file, so6 so6Var) {
        this.e = mediaController;
        this.b = oecVar;
        this.c = file;
        this.d = so6Var;
        this.a = 0L;
    }
}
