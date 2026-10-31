package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public TextView a;
    public TextView b;
    public TextView c;
    public l0 d;
    public LinearLayout e;
    public LinearLayout f;
    public int h;
    public AnimatorSet n;
    public String r;

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        ?? r16;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = true;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131751133, null));
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 29));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, frameLayout, null);
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.f.setWeightSum(100.0f);
        frameLayout.addView(this.f, w7.b6.c(-1.0f, -1));
        ?? frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
        this.f.addView(frameLayout2, w7.b6.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, w7.b6.c(-1.0f, -1));
        l0 l0Var = new l0(this, context, 10);
        this.d = l0Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, l0Var, null);
        this.f.addView(this.d, w7.b6.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        this.d.addView(this.e, w7.b6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.b = textView;
        int i10 = org.telegram.ui.ActionBar.t6.B6;
        org.telegram.ui.ActionBar.a7.V(textView, i10, null);
        this.b.setGravity(17);
        this.b.setTypeface(Typeface.MONOSPACE);
        this.b.setTextSize(1, 16.0f);
        this.e.addView(this.b, w7.b6.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.a = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i10, null);
        org.telegram.ui.ActionBar.a7.H(this.a, org.telegram.ui.ActionBar.t6.J6, null);
        this.a.setTextSize(1, 16.0f);
        this.a.setLinksClickable(true);
        this.a.setClickable(true);
        this.a.setGravity(17);
        this.a.setMovementMethod(new org.telegram.messenger.e0(2));
        this.e.addView(this.a, w7.b6.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, i10, null);
        this.c.setGravity(17);
        this.c.setTextSize(1, 32.0f);
        this.d.addView(this.c, w7.b6.c(-2.0f, -2));
        TLRPC.EncryptedChat Z0 = org.telegram.messenger.vp.r1(this.currentAccount).Z0(Integer.valueOf(this.h));
        if (Z0 != null) {
            org.telegram.ui.Components.v30 v30Var = new org.telegram.ui.Components.v30();
            imageView.setImageDrawable(v30Var);
            byte[] bArr = Z0.key_hash;
            v30Var.a = bArr;
            if (bArr == null) {
                byte[] bArr2 = new byte[16];
                System.arraycopy(Utilities.n(Z0.auth_key), 0, bArr2, 0, 16);
                v30Var.a = bArr2;
                Z0.key_hash = bArr2;
            }
            v30Var.invalidateSelf();
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(Z0.user_id));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr3 = Z0.key_hash;
            if (bArr3.length > 16) {
                String f7 = Utilities.f(bArr3);
                int i11 = 0;
                while (i11 < 32) {
                    if (i11 != 0) {
                        if (i11 % 8 == 0) {
                            spannableStringBuilder.append('\n');
                        } else if (i11 % 4 == 0) {
                            spannableStringBuilder.append(' ');
                        }
                    }
                    int i12 = i11 * 2;
                    spannableStringBuilder.append((CharSequence) f7.substring(i12, i12 + 2));
                    spannableStringBuilder.append(' ');
                    i11++;
                    z10 = z10;
                }
                r16 = z10;
                spannableStringBuilder.append((CharSequence) "\n");
                for (int i13 = 0; i13 < 5; i13++) {
                    byte[] bArr4 = Z0.key_hash;
                    int i14 = i13 * 4;
                    int i15 = (bArr4[i14 + 19] & 255) | ((bArr4[i14 + 16] & Byte.MAX_VALUE) << 24) | ((bArr4[i14 + 17] & 255) << 16) | ((bArr4[i14 + 18] & 255) << 8);
                    if (i13 != 0) {
                        sb2.append(" ");
                    }
                    sb2.append(org.telegram.messenger.l6.c[i15 % org.telegram.messenger.zs.E5]);
                }
                this.r = sb2.toString();
            } else {
                r16 = 1;
            }
            this.b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            String str = Z1.first_name;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[r16] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("EncryptionKeyDescription", null, 2131751132, objArr)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.g51(org.telegram.messenger.cd.L0(2131751131, null), null), indexOf, indexOf + 12, 33);
            }
            this.a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        this.c.setAlpha(0.0f);
        this.b.setAlpha(1.0f);
        this.c.setScaleX(0.0f);
        this.c.setScaleY(0.0f);
        this.b.setScaleX(1.0f);
        this.b.setScaleY(1.0f);
        this.c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bf));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 != org.telegram.messenger.zs.i4 || (textView = this.c) == null) {
            return;
        }
        textView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new e7(this, 2));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        this.h = getArguments().getInt("chat_id");
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new e7(this, 2));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        String str;
        if (!z10 || z11 || (str = this.r) == null) {
            return;
        }
        TextView textView = this.c;
        textView.setText(org.telegram.messenger.k6.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0));
    }
}
