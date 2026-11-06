package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class tl extends vi0 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final /* synthetic */ ChatAttachAlertPhotoLayout w;

    public tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z9) {
        this.w = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z9;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.vi0
    public final boolean E(pj0 pj0Var) {
        org.telegram.messenger.we weVar;
        boolean isEmpty = ChatAttachAlertPhotoLayout.r1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        return !(isEmpty && ((weVar = chatAttachAlertPhotoLayout.T0) == null || weVar.e.isEmpty())) && chatAttachAlertPhotoLayout.b.I1 && b() > 30;
    }

    @Override // org.telegram.ui.Components.vi0
    public final String F(int i7) {
        ArrayList arrayList;
        org.telegram.messenger.gf M = M(i7);
        if (M == null) {
            int i10 = this.r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
            if (i7 <= i10) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.r1;
                if (arrayList2.isEmpty()) {
                    org.telegram.messenger.we weVar = chatAttachAlertPhotoLayout.T0;
                    if (weVar != null && (arrayList = weVar.e) != null) {
                        M = (org.telegram.messenger.gf) arrayList.get(0);
                    }
                } else {
                    M = (org.telegram.messenger.gf) arrayList2.get(0);
                }
            } else if (!chatAttachAlertPhotoLayout.T0.e.isEmpty()) {
                M = (org.telegram.messenger.gf) jg.g.i(1, chatAttachAlertPhotoLayout.T0.e);
            }
        }
        if (M == null) {
            return "";
        }
        long j3 = M.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return org.telegram.messenger.hd.e0(j3, true);
    }

    @Override // org.telegram.ui.Components.vi0
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = pj0Var.getChildAt(0).getMeasuredHeight();
        float b10 = b();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        float ceil = (((int) (Math.ceil(b10 / chatAttachAlertPhotoLayout.M0) * measuredHeight)) - (pj0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (ceil / f11)) * chatAttachAlertPhotoLayout.M0;
        int paddingTop = pj0Var.getPaddingTop() + ((int) (ceil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
            return;
        }
        iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
    }

    @Override // org.telegram.ui.Components.vi0
    public final float H(pj0 pj0Var) {
        int i7 = this.w.M0;
        int ceil = (int) Math.ceil(this.n / i7);
        if (pj0Var.getChildCount() != 0) {
            int measuredHeight = pj0Var.getChildAt(0).getMeasuredHeight();
            if (RecyclerView.R(pj0Var.getChildAt(0)) >= 0) {
                return Utilities.i((((r5 / i7) * measuredHeight) - r2.getTop()) / ((ceil * measuredHeight) - (pj0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.vi0
    public final void J(pj0 pj0Var) {
        this.s = false;
        int childCount = pj0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            pj0Var.getChildAt(i7).invalidate();
        }
    }

    @Override // org.telegram.ui.Components.vi0
    public final void K() {
        this.s = true;
    }

    public final xi0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.G) {
            q5Var.setOutlineProvider(new fh.a(this, 3));
            q5Var.setClipToOutline(true);
        }
        q5Var.setFastScrollDelegate(new u(this, 22));
        q5Var.setDelegate(new f2(8, this, q5Var));
        return new xi0(q5Var);
    }

    public final org.telegram.messenger.gf M(int i7) {
        boolean z9 = this.f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (z9 && i7 > chatAttachAlertPhotoLayout.M0) {
            i7--;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i7--;
        }
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        return chatAttachAlertPhotoLayout.e0(i7);
    }

    @Override // v4.g0
    public final int b() {
        int i7 = 0;
        this.e = false;
        this.f = false;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        tl tlVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.v0) {
            return 1;
        }
        boolean z9 = chatAttachAlertPhotoLayout.P0;
        if (z9 && this == tlVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            this.e = true;
            i7 = 1;
        }
        if (chatAttachAlertPhotoLayout.g1) {
            i7++;
        }
        if (z9 && this == tlVar) {
            i7++;
        }
        this.r = i7;
        if (!z9) {
            i7 += ChatAttachAlertPhotoLayout.r1.size();
            org.telegram.messenger.we weVar = chatAttachAlertPhotoLayout.T0;
            if (weVar != null) {
                i7 += weVar.e.size();
            }
        }
        if (this.e && i7 > chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.O0) {
            this.f = true;
            i7++;
        }
        if (this == tlVar) {
            i7++;
        }
        this.n = i7;
        return i7;
    }

    @Override // v4.g0
    public final int d(int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        tl tlVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.v0) {
            return 2;
        }
        boolean z9 = chatAttachAlertPhotoLayout.P0;
        if (z9 && this == tlVar) {
            return i7 == 0 ? 7 : 2;
        }
        boolean z10 = this.d;
        if (z10 && i7 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            return chatAttachAlertPhotoLayout.O0 ? 8 : 1;
        }
        boolean z11 = this.f;
        if (z11 && i7 == chatAttachAlertPhotoLayout.M0) {
            return 5;
        }
        int i10 = (!z11 || i7 <= chatAttachAlertPhotoLayout.M0) ? i7 : i7 - 1;
        if (z10) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.g1 && i10 == 0) {
            return 4;
        }
        if (this == tlVar && i7 == this.n - 1) {
            return 2;
        }
        return z9 ? 3 : 0;
    }

    @Override // v4.g0
    public final void f() {
        super.f();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (this == chatAttachAlertPhotoLayout.G) {
            chatAttachAlertPhotoLayout.H.setVisibility((!(b() == 1 && !chatAttachAlertPhotoLayout.P0 && chatAttachAlertPhotoLayout.T0 == null) && chatAttachAlertPhotoLayout.v0) ? 4 : 0);
        }
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        di diVar = chatAttachAlertPhotoLayout.b;
        int i10 = d1Var.f;
        View view = d1Var.a;
        boolean z9 = this.d;
        if (i10 != 0) {
            if (i10 == 1) {
                ((org.telegram.ui.Cells.k5) view).setItemSize(chatAttachAlertPhotoLayout.K0);
                return;
            }
            if (i10 != 3) {
                if (i10 != 7) {
                    return;
                }
                ((w00) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.g1);
                return;
            } else {
                org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
                l5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
                l5Var.setType((z9 && chatAttachAlertPhotoLayout.O0 && i7 == 0) ? 0 : 1);
                return;
            }
        }
        if (this.f && i7 > chatAttachAlertPhotoLayout.M0) {
            i7--;
        }
        if (z9 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i7--;
        }
        if (chatAttachAlertPhotoLayout.g1) {
            i7--;
        }
        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
        if (this == chatAttachAlertPhotoLayout.G) {
            q5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
        } else {
            q5Var.setIsVertical(chatAttachAlertPhotoLayout.s.o == 1);
        }
        if (diVar.K2 != 0 || diVar.N2 || diVar.y1) {
            q5Var.getCheckBox().setVisibility(8);
        } else {
            q5Var.getCheckBox().setVisibility(0);
        }
        org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 == null) {
            return;
        }
        int i11 = e02.C;
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        q5Var.d(e02, hashMap.size() > 1, z9 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, i7 == b() - 1, diVar != null && diVar.Z1);
        if ((diVar.W1 instanceof org.telegram.ui.an) && diVar.N3) {
            q5Var.b(ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(i11)), hashMap.containsKey(Integer.valueOf(i11)), false);
        } else {
            q5Var.b(-1, hashMap.containsKey(Integer.valueOf(i11)), false);
        }
        if (!chatAttachAlertPhotoLayout.w0 && e02.b) {
            q5Var.setAlpha(0.3f);
        } else if (chatAttachAlertPhotoLayout.x0 || e02.b) {
            q5Var.setAlpha(1.0f);
        } else {
            q5Var.setAlpha(0.3f);
        }
        q5Var.getImageView().setTag(Integer.valueOf(i7));
        q5Var.setTag(Integer.valueOf(i7));
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        di diVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.f6 f6Var = chatAttachAlertPhotoLayout.a;
        if (i7 == 0) {
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                return L();
            }
            xi0 xi0Var = (xi0) arrayList.get(0);
            arrayList.remove(0);
            return xi0Var;
        }
        Context context = this.c;
        if (i7 == 1) {
            org.telegram.ui.Cells.k5 k5Var = new org.telegram.ui.Cells.k5(context);
            k5Var.setFocusable(true);
            k5Var.a = org.telegram.messenger.g0.L(0.0f);
            return new xi0(k5Var);
        }
        int i10 = 2;
        if (i7 == 2) {
            return new xi0(new bi.ec(14, context, this));
        }
        if (i7 == 4) {
            diVar.getClass();
            return new xi0(new sl(this, context));
        }
        int i11 = 5;
        if (i7 == 5) {
            return new xi0(new View(context));
        }
        int i12 = 17;
        if (i7 == 7) {
            w00 w00Var = new w00(context, diVar.D3);
            w00Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(400.0f)));
            w00Var.setGravity(17);
            w00Var.isClickable();
            w00Var.b.setOnClickListener(new h0(new cl(chatAttachAlertPhotoLayout, i11), i12));
            w00Var.a.setOnClickListener(new h0(new cl(chatAttachAlertPhotoLayout, 6), 18));
            w00Var.c.setOnClickListener(new lk(13, w00Var, new s2(this, i10)));
            return new xi0(w00Var);
        }
        if (i7 == 8) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
            fi.d dVar = new fi.d(context, f6Var, true);
            dVar.setUseWrapContent(true);
            dVar.f();
            dVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new wp(R.drawable.camera, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.M0(2131750480, null));
            dVar.i(spannableStringBuilder, false, true);
            frameLayout.addView(dVar, c8.ha.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new xi0(frameLayout);
        }
        org.telegram.ui.Cells.l5 l5Var = new org.telegram.ui.Cells.l5(context);
        ImageView imageView = new ImageView(context);
        l5Var.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i13 = org.telegram.ui.ActionBar.k6.aa;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i13, f6Var, mode);
        l5Var.addView(imageView, c8.ha.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        ImageView imageView2 = new ImageView(context);
        l5Var.b = imageView2;
        imageView2.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.ba, f6Var, mode);
        l5Var.addView(imageView2, c8.ha.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        TextView textView = new TextView(context);
        l5Var.c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.ca, f6Var);
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        l5Var.addView(textView, c8.ha.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
        l5Var.d = org.telegram.messenger.g0.L(80.0f);
        return new xi0(l5Var);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        if (d1Var.a instanceof org.telegram.ui.Cells.k5) {
            this.w.Q.i();
        }
    }
}
