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
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.e20;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.e51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ha extends h41 implements cs {
    public static void d0(ha haVar, TL_wallet.tonConnectSession tonconnectsession, u10 u10Var) {
        c2 c2Var = k0.x(haVar.currentAccount).g;
        c2Var.getClass();
        org.telegram.messenger.g0.h3(new g(c2Var, tonconnectsession, u10Var, 4));
    }

    @Override // org.telegram.ui.Components.h41
    public final void Z(ArrayList arrayList, f41 f41Var) {
        c2 c2Var = k0.x(this.currentAccount).g;
        if (!c2Var.d.isEmpty()) {
            arrayList.add(r31.u(bd.M0(2131743216, null)));
        }
        ArrayList arrayList2 = c2Var.d;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            int i10 = fa.b;
            r31 K = r31.K(fa.class);
            K.G = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        arrayList.add(r31.C(bd.M0(2131743165, null)));
    }

    @Override // org.telegram.ui.Components.h41
    public final CharSequence a0() {
        return bd.M0(2131743166, null);
    }

    @Override // org.telegram.ui.Components.h41
    public final void b0(r31 r31Var, View view) {
        TLRPC.WebDocument webDocument;
        Object obj = r31Var.G;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
            e51 e51Var = new e51(15, this, tonconnectsession);
            LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(R.drawable.ic_ab_close);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i3 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i3, resourceProvider), 1, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.t(imageView, i10, resourceProvider, PorterDuff.Mode.SRC_IN);
            pf.a(imageView);
            frameLayout.addView(imageView, mf.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                k9Var.p(ac.p(e20.c(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(k9Var, mf.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            e10.addView(frameLayout, mf.o(-1, -2));
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
            textView.setText(tonconnectmanifest2 != null ? tonconnectmanifest2.name : bd.M0(2131743168, null));
            org.telegram.ui.ActionBar.r6.V(textView, i10, resourceProvider);
            e10.addView(textView, mf.t(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            String K0 = org.telegram.messenger.g0.K0(tonconnectmanifest3 != null ? tonconnectmanifest3.url : null, false);
            if (!TextUtils.isEmpty(K0)) {
                TextView textView2 = new TextView(parentActivity);
                org.telegram.messenger.camera.q.m(textView2, 1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Ci, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) K0);
                textView2.setText(spannableStringBuilder);
                e10.addView(textView2, mf.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(bd.M0(2131743167, null));
            org.telegram.ui.ActionBar.r6.V(textView3, i10, resourceProvider);
            e10.addView(textView3, mf.t(-2, -2, 49, 36, 16, 36, 28));
            gi.d dVar = new gi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(bd.M0(2131743140, null));
            int i11 = org.telegram.ui.ActionBar.k6.q7;
            dVar.setColor(org.telegram.ui.ActionBar.k6.w0(i11, resourceProvider));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(dVar, background, N2, null, resourceProvider);
            }
            e10.addView(dVar, mf.t(-1, 44, 1, 16, 0, 16, 16));
            y2 y2Var = new y2(parentActivity, e10, resourceProvider);
            y2Var.show();
            imageView.setOnClickListener(new p1(y2Var, 1));
            dVar.setOnClickListener(new h8(dVar, e51Var, y2Var, resourceProvider, 3));
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean c0(r31 r31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.h41, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.r1();
        this.a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ai.h4 h4Var;
        if (i3 != hs.a4 || (h4Var = this.a) == null) {
            return;
        }
        h4Var.g3.O(true);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.a4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.a4);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
    }
}
