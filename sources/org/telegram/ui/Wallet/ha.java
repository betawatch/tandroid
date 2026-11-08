package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.m20;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class ha extends n41 implements ls {
    public static void d0(ha haVar, TL_wallet.tonConnectSession tonconnectsession, c20 c20Var) {
        e2 e2Var = m0.x(haVar.currentAccount).g;
        e2Var.getClass();
        org.telegram.messenger.g0.h3(new g(e2Var, tonconnectsession, c20Var, 4));
    }

    @Override // org.telegram.ui.Components.n41
    public final void Z(ArrayList arrayList, l41 l41Var) {
        e2 e2Var = m0.x(this.currentAccount).g;
        if (!e2Var.d.isEmpty()) {
            arrayList.add(x31.u(id.M0(2131743209, null)));
        }
        ArrayList arrayList2 = e2Var.d;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            int i10 = fa.b;
            x31 K = x31.K(fa.class);
            K.G = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        arrayList.add(x31.C(id.M0(2131743158, null)));
    }

    @Override // org.telegram.ui.Components.n41
    public final CharSequence a0() {
        return id.M0(2131743159, null);
    }

    @Override // org.telegram.ui.Components.n41
    public final void b0(x31 x31Var, View view) {
        TLRPC.WebDocument webDocument;
        Object obj = x31Var.G;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
            t tVar = new t(12, this, tonconnectsession);
            LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(R.drawable.ic_ab_close);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i7 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i7, resourceProvider), 1, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.t(imageView, i10, resourceProvider, PorterDuff.Mode.SRC_IN);
            c8.ka.a(imageView);
            frameLayout.addView(imageView, c8.ha.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(parentActivity);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                l9Var.p(hc.p(m20.c(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(l9Var, c8.ha.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            e10.addView(frameLayout, c8.ha.o(-1, -2));
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
            textView.setText(tonconnectmanifest2 != null ? tonconnectmanifest2.name : id.M0(2131743161, null));
            org.telegram.ui.ActionBar.r6.V(textView, i10, resourceProvider);
            e10.addView(textView, c8.ha.t(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            String K0 = org.telegram.messenger.g0.K0(tonconnectmanifest3 != null ? tonconnectmanifest3.url : null, false);
            if (!TextUtils.isEmpty(K0)) {
                TextView textView2 = new TextView(parentActivity);
                org.telegram.messenger.camera.q.m(textView2, 1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Ci, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) K0);
                textView2.setText(spannableStringBuilder);
                e10.addView(textView2, c8.ha.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(id.M0(2131743160, null));
            org.telegram.ui.ActionBar.r6.V(textView3, i10, resourceProvider);
            e10.addView(textView3, c8.ha.t(-2, -2, 49, 36, 16, 36, 28));
            fi.d dVar = new fi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(id.M0(2131743133, null));
            int i11 = org.telegram.ui.ActionBar.k6.q7;
            dVar.setColor(org.telegram.ui.ActionBar.k6.w0(i11, resourceProvider));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(dVar, background, N2, null, resourceProvider);
            }
            e10.addView(dVar, c8.ha.t(-1, 44, 1, 16, 0, 16, 16));
            z2 z2Var = new z2(parentActivity, e10, resourceProvider);
            z2Var.show();
            imageView.setOnClickListener(new r1(z2Var, 1));
            dVar.setOnClickListener(new h8(dVar, tVar, z2Var, resourceProvider, 3));
        }
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c0(x31 x31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.n41, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.r1();
        this.a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.w3 w3Var;
        if (i7 != qs.a4 || (w3Var = this.a) == null) {
            return;
        }
        w3Var.f3.O(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.a4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.a4);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
    }
}
