package org.telegram.ui.ActionBar;

import a8.xa;
import android.content.ClipData;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import c8.zc;
import com.google.android.gms.tasks.OnSuccessListener;
import fi.i7;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.kc;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ff;
import org.telegram.ui.en0;
import org.telegram.ui.tp0;
import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements e1, q1, r0.m, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.f1, kc, d5.a, c0.j, p4.c0, p4.a1, h2.j, p4.y0, g9.k, ri.m, sg.y, te.b, t0.e, sg.j1, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // sg.j1
    public void C() {
        tp0 tp0Var = (tp0) this.b;
        TextView textView = tp0Var.i1;
        boolean a10 = tp0Var.p0.a();
        ImageView imageView = tp0Var.g1;
        imageView.animate().cancel();
        imageView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a10);
        textView.animate().cancel();
        textView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a10);
    }

    @Override // te.b
    public /* synthetic */ void E(float f10, int i7) {
        int i10 = this.a;
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        switch (this.a) {
            case 22:
                sh.b.a((sh.b) this.b);
                break;
            default:
                ((Switch) this.b).invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.kc
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.b;
        if (!z10 || z11) {
            return;
        }
        i1Var.a();
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        switch (this.a) {
            case 3:
                j3 j3Var = (j3) this.b;
                j3Var.s = k1Var.a.f(2).d;
                j3Var.invalidate();
                break;
            default:
                l3 l3Var = (l3) this.b;
                l3Var.e = k1Var;
                i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
                i0.c I02 = org.telegram.messenger.g0.I0(k1Var, true);
                if (!l3Var.f.equals(I0) || !l3Var.h.equals(I02)) {
                    org.telegram.messenger.g0.m = I0.b;
                    org.telegram.messenger.g0.n = I0.d;
                    l3Var.f = I0;
                    l3Var.h = I02;
                    l3Var.requestLayout();
                }
                int childCount = l3Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = l3Var.getChildAt(i7);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, k1Var);
                    }
                }
                l3Var.invalidate();
                break;
        }
        return r0.k1.b;
    }

    @Override // sg.y
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.b).getFile());
        return createFromFile;
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 13:
                ((p4.g1) obj).e((e2.w0) this.b);
                break;
            default:
                ((q2.k) obj).a((nb.a) this.b);
                break;
        }
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 16:
                ji.j jVar = (ji.j) this.b;
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                l9.a aVar = (l9.a) jVar.c;
                if (!aVar.a(Math.max(height, width))) {
                    return bitmap;
                }
                if (aVar.a(height)) {
                    height--;
                }
                if (aVar.a(width)) {
                    width--;
                }
                return bg.n0.e(Bitmap.createScaledBitmap(bitmap, width, height, true));
            default:
                f5.v vVar = (f5.v) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i7 = vVar.b;
                if (width2 > i7 || bitmap2.getHeight() > i7) {
                    float f10 = i7;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f10 / width3, f10 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return bg.n0.e(bitmap2);
        }
    }

    @Override // p4.c0
    public void b(p4.u uVar, int i7) {
        uVar.e(i7, (e2.y0) this.b);
    }

    @Override // p4.y0
    public void c(p4.g1 g1Var, p4.v vVar) {
        ((h2.j) this.b).accept(g1Var);
    }

    @Override // c0.j
    public Object d(c0.i iVar) {
        p4.d0 d0Var = (p4.d0) this.b;
        d0Var.o.post(new org.telegram.ui.web.e1(6, d0Var, iVar));
        return "onPlayRequested";
    }

    @Override // d5.a
    public void e(WebView webView, xa xaVar, Uri uri, boolean z10, e5.f fVar) {
        org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) this.b;
        org.telegram.ui.web.v0 v0Var = s0Var.R;
        if (webView != s0Var || v0Var == null) {
            return;
        }
        if (webView != v0Var.a || xaVar.b != 0) {
            v0Var.g("onBotWebMessage ignored: invalid source or payload");
            return;
        }
        String k10 = org.telegram.ui.web.v0.k(uri == null ? null : uri.toString());
        if (v0Var.u0 && (TextUtils.isEmpty(v0Var.H0) || !TextUtils.equals(v0Var.H0, k10) || !TextUtils.equals(v0Var.H0, v0Var.getOriginHost()))) {
            v0Var.g("onBotWebMessage ignored: untrusted origin");
            return;
        }
        i7 f10 = v0Var.f();
        try {
            xaVar.e(0);
            String str = (String) xaVar.c;
            if (str != null && str.length() <= 1048576) {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("eventType");
                if (!string.isEmpty() && string.length() <= 128) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.web.x(v0Var, webView, f10, string, jSONObject.optString("eventData", null), 2));
                    return;
                }
                v0Var.g("onBotWebMessage ignored: invalid event type");
                return;
            }
            v0Var.g("onBotWebMessage ignored: invalid payload length");
        } catch (JSONException e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                t1 t1Var2 = (t1) this.b;
                DialogInterface.OnCancelListener onCancelListener = t1Var2.K;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(t1Var2);
                }
                t1Var2.dismiss();
                break;
            case 9:
                ((org.telegram.ui.web.x) this.b).run();
                break;
            case 26:
                ((en0) this.b).run();
                break;
            default:
                ((tg.a0) this.b).a.P1.r();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        g1 g1Var;
        q0 q0Var = (q0) this.b;
        q0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = q0Var.d) != null && g1Var.isShowing()) {
            q0Var.d.d(true);
        }
    }

    @Override // p4.a1
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 12:
                return d0Var.l(vVar, (h9.i0) obj);
            default:
                p4.y0 y0Var = (p4.y0) obj;
                m9.w wVar = m9.w.b;
                if (!d0Var.j()) {
                    y0Var.c(d0Var.t, vVar);
                    p4.c1.r1(d0Var, vVar, i7, new p4.m1(0));
                }
                return m9.w.b;
        }
    }

    @Override // ri.m
    public void l(int i7) {
        ri.a aVar = (ri.a) this.b;
        ri.q qVar = aVar.a;
        ri.d dVar = aVar.g;
        if (Build.VERSION.SDK_INT < 31 || dVar == null) {
            return;
        }
        ArrayList arrayList = dVar.a;
        if (aVar.l || ri.q.f().a) {
            if (zc.a(i7, 4) || zc.a(i7, 2)) {
                ti.a e10 = qVar.e();
                ViewGroup viewGroup = aVar.n;
                if (viewGroup != null) {
                    e10.b(viewGroup.getY(), aVar.m.getWidth(), aVar.n.getY() + aVar.n.getHeight());
                }
                dVar.b = e10.b;
                while (dVar.b > arrayList.size()) {
                    arrayList.add(new ri.b(arrayList.size()));
                }
                for (int i10 = 0; i10 < dVar.b; i10++) {
                    ri.b bVar = (ri.b) arrayList.get(i10);
                    bVar.a.set(e10.c(i10));
                    bVar.b(dVar.m, dVar.n, dVar.o);
                    bVar.c(dVar.k);
                    int i11 = dVar.p;
                    int i12 = dVar.q;
                    int i13 = dVar.r;
                    int i14 = dVar.s;
                    bVar.u = i11;
                    bVar.v = i12;
                    bVar.w = i13;
                    bVar.x = i14;
                }
            }
            dVar.c = aVar.o;
            dVar.d = aVar.m;
            boolean z10 = qVar.j > 0;
            boolean z11 = !z10;
            if (dVar.l != z11) {
                dVar.l = z11;
                int i15 = !z10 ? 5 : 1;
                dVar.m = i15;
                int i16 = z10 ? 1 : 10;
                dVar.n = i16;
                dVar.o = Math.max(i15, i16);
                for (int i17 = 0; i17 < dVar.b; i17++) {
                    ((ri.b) arrayList.get(i17)).b(dVar.m, dVar.n, dVar.o);
                }
                dVar.f();
            }
            int i18 = qVar.k;
            int i19 = qVar.l;
            dVar.t = i18;
            dVar.u = i19;
            dVar.f();
            dVar.e();
            Runnable runnable = aVar.j;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // t0.e
    public boolean o(ff ffVar, int i7, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) ffVar.b).e();
                Parcelable parcelable = (Parcelable) ((t0.h) ffVar.b).h();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        t0.h hVar = (t0.h) ffVar.b;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i10 >= 31) {
            dVar = new m2.i(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.b = clipData;
            eVar.c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.f());
        dVar.setExtras(bundle);
        return r0.i0.h(sVar, dVar.build()) == null;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 28:
                tg.n1 n1Var = (tg.n1) this.b;
                n1Var.D0 = true;
                n1Var.C0 = false;
                break;
            default:
                bi.w2 w2Var = (bi.w2) this.b;
                zb.b bVar = (zb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < bVar.a.size(); i7++) {
                    zb.a aVar = (zb.a) bVar.a.get(i7);
                    tg.d2 d2Var = new tg.d2();
                    d2Var.a = aVar.a;
                    d2Var.b = aVar.d;
                    d2Var.c = aVar.e;
                    d2Var.d = aVar.b;
                    d2Var.e = aVar.c;
                    arrayList.add(d2Var);
                }
                w2Var.a(arrayList);
                break;
        }
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public void run(Bitmap bitmap, int i7) {
        org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / ns.K2));
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.u(0, zVar, bitmap));
    }

    public /* synthetic */ z(qe.h hVar, s4.r0 r0Var) {
        this.a = 20;
        this.b = hVar;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void A(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void f(float f10, int i7) {
    }

    private final /* synthetic */ void g(float f10, int i7) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
    }
}
