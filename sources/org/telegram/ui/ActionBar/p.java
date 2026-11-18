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
import c8.dd;
import com.google.android.gms.tasks.OnSuccessListener;
import fi.f7;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.jc;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.of;
import org.telegram.ui.hn0;
import org.telegram.ui.vp0;
import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements r0.m, f1, r1, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.e1, jc, d5.a, c0.j, p4.c0, p4.c1, h2.j, p4.a1, g9.k, ri.m, sg.y, te.b, t0.e, sg.j1, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
        int i10 = this.a;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        switch (this.a) {
            case 23:
                sh.c.a((sh.c) this.b);
                break;
            default:
                ((Switch) this.b).invalidate();
                break;
        }
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.w1;
                i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
                i0.b I02 = org.telegram.messenger.g0.I0(l1Var, true);
                actionBarLayout.u1 = I0;
                actionBarLayout.v1 = I02;
                actionBarLayout.t1 = l1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i10 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i10), l1Var);
                    i10++;
                }
                break;
            case 4:
                n3 n3Var = (n3) obj;
                n3Var.s = l1Var.a.f(2).d;
                n3Var.invalidate();
                break;
            default:
                p3 p3Var = (p3) obj;
                p3Var.e = l1Var;
                i0.b I03 = org.telegram.messenger.g0.I0(l1Var, false);
                i0.b I04 = org.telegram.messenger.g0.I0(l1Var, true);
                if (!p3Var.f.equals(I03) || !p3Var.h.equals(I04)) {
                    org.telegram.messenger.g0.m = I03.b;
                    org.telegram.messenger.g0.n = I03.d;
                    p3Var.f = I03;
                    p3Var.h = I04;
                    p3Var.requestLayout();
                }
                int childCount2 = p3Var.getChildCount();
                while (i10 < childCount2) {
                    View childAt = p3Var.getChildAt(i10);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, l1Var);
                    }
                    i10++;
                }
                p3Var.invalidate();
                break;
        }
        return r0.l1.b;
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
            case 14:
                ((p4.i1) obj).e((e2.w0) this.b);
                break;
            default:
                ((q2.j) obj).a((nb.a) this.b);
                break;
        }
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 17:
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
                return bg.o0.e(Bitmap.createScaledBitmap(bitmap, width, height, true));
            default:
                b3.j jVar2 = (b3.j) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i7 = jVar2.b;
                if (width2 > i7 || bitmap2.getHeight() > i7) {
                    float f10 = i7;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f10 / width3, f10 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return bg.o0.e(bitmap2);
        }
    }

    @Override // p4.c0
    public void b(p4.u uVar, int i7) {
        uVar.e(i7, (e2.y0) this.b);
    }

    @Override // p4.a1
    public void c(p4.i1 i1Var, p4.v vVar) {
        ((h2.j) this.b).accept(i1Var);
    }

    @Override // t0.e
    public boolean d(of ofVar, int i7, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) ofVar.b).e();
                Parcelable parcelable = (Parcelable) ((t0.h) ofVar.b).g();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        t0.h hVar = (t0.h) ofVar.b;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i10 >= 31) {
            dVar = new m2.h(clipData, 2);
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

    @Override // c0.j
    public Object e(c0.i iVar) {
        p4.d0 d0Var = (p4.d0) this.b;
        d0Var.o.post(new org.telegram.ui.Wallet.c5(28, d0Var, iVar));
        return "onPlayRequested";
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(u1 u1Var, int i7) {
        switch (this.a) {
            case 2:
                u1 u1Var2 = (u1) this.b;
                DialogInterface.OnCancelListener onCancelListener = u1Var2.K;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(u1Var2);
                }
                u1Var2.dismiss();
                break;
            case 10:
                ((org.telegram.ui.web.x) this.b).run();
                break;
            case 27:
                ((hn0) this.b).run();
                break;
            default:
                ((tg.a0) this.b).a.P1.r();
                break;
        }
    }

    @Override // d5.a
    public void i(WebView webView, xa xaVar, Uri uri, boolean z10, e5.f fVar) {
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
        f7 f10 = v0Var.f();
        try {
            xaVar.f(0);
            String str = (String) xaVar.c;
            if (str != null && str.length() <= 1048576) {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("eventType");
                if (!string.isEmpty() && string.length() <= 128) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.web.x(v0Var, webView, f10, string, jSONObject.optString("eventData", null), 2));
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

    @Override // org.telegram.ui.ActionBar.f1
    public void j(KeyEvent keyEvent) {
        h1 h1Var;
        r0 r0Var = (r0) this.b;
        r0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h1Var = r0Var.d) != null && h1Var.isShowing()) {
            r0Var.d.d(true);
        }
    }

    @Override // p4.c1
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 13:
                return d0Var.l(vVar, (h9.i0) obj);
            default:
                p4.a1 a1Var = (p4.a1) obj;
                m9.w wVar = m9.w.b;
                if (!d0Var.j()) {
                    a1Var.c(d0Var.t, vVar);
                    p4.e1.r1(d0Var, vVar, i7, new p4.o1(0));
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
            if (dd.a(i7, 4) || dd.a(i7, 2)) {
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

    @Override // org.telegram.messenger.jc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
        if (!z10 || z11) {
            return;
        }
        h1Var.a();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        tg.n1 n1Var = (tg.n1) this.b;
        n1Var.D0 = true;
        n1Var.C0 = false;
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public void run(Bitmap bitmap, int i7) {
        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / ks.K2));
        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.hn0(25, yVar, bitmap));
    }

    @Override // sg.j1
    public void u() {
        vp0 vp0Var = (vp0) this.b;
        TextView textView = vp0Var.i1;
        boolean a10 = vp0Var.p0.a();
        ImageView imageView = vp0Var.g1;
        imageView.animate().cancel();
        imageView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a10);
        textView.animate().cancel();
        textView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a10);
    }

    public /* synthetic */ p(qe.h hVar, s4.r0 r0Var) {
        this.a = 21;
        this.b = hVar;
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void f(float f10, int i7) {
    }

    private final /* synthetic */ void g(float f10, int i7) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }
}
