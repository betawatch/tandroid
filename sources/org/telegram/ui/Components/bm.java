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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bm extends ak0 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final /* synthetic */ ChatAttachAlertPhotoLayout w;

    public bm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.w = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ak0
    public final boolean E(tk0 tk0Var) {
        org.telegram.messenger.we weVar;
        boolean isEmpty = ChatAttachAlertPhotoLayout.r1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        return !(isEmpty && ((weVar = chatAttachAlertPhotoLayout.T0) == null || weVar.e.isEmpty())) && chatAttachAlertPhotoLayout.b.I1 && b() > 30;
    }

    @Override // org.telegram.ui.Components.ak0
    public final String F(int i10) {
        ArrayList arrayList;
        org.telegram.messenger.ef M = M(i10);
        if (M == null) {
            int i11 = this.r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.r1;
                if (arrayList2.isEmpty()) {
                    org.telegram.messenger.we weVar = chatAttachAlertPhotoLayout.T0;
                    if (weVar != null && (arrayList = weVar.e) != null) {
                        M = (org.telegram.messenger.ef) arrayList.get(0);
                    }
                } else {
                    M = (org.telegram.messenger.ef) arrayList2.get(0);
                }
            } else if (!chatAttachAlertPhotoLayout.T0.e.isEmpty()) {
                M = (org.telegram.messenger.ef) i0.a.g(1, chatAttachAlertPhotoLayout.T0.e);
            }
        }
        if (M == null) {
            return "";
        }
        long j10 = M.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return org.telegram.messenger.cd.e0(j10, true);
    }

    @Override // org.telegram.ui.Components.ak0
    public final void G(tk0 tk0Var, float f7, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        int measuredHeight = tk0Var.getChildAt(0).getMeasuredHeight();
        float b10 = b();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        float ceil = (((int) (Math.ceil(b10 / chatAttachAlertPhotoLayout.M0) * measuredHeight)) - (tk0Var.getMeasuredHeight() - currentActionBarHeight)) * f7;
        float f10 = measuredHeight;
        iArr[0] = ((int) (ceil / f10)) * chatAttachAlertPhotoLayout.M0;
        int paddingTop = tk0Var.getPaddingTop() + ((int) (ceil % f10)) + ((int) ((1.0f - f7) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
            return;
        }
        iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
    }

    @Override // org.telegram.ui.Components.ak0
    public final float H(tk0 tk0Var) {
        int i10 = this.w.M0;
        int ceil = (int) Math.ceil(this.n / i10);
        if (tk0Var.getChildCount() != 0) {
            int measuredHeight = tk0Var.getChildAt(0).getMeasuredHeight();
            if (RecyclerView.R(tk0Var.getChildAt(0)) >= 0) {
                return Utilities.i((((r5 / i10) * measuredHeight) - r2.getTop()) / ((ceil * measuredHeight) - (tk0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.ak0
    public final void J(tk0 tk0Var) {
        this.s = false;
        int childCount = tk0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            tk0Var.getChildAt(i10).invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ak0
    public final void K() {
        this.s = true;
    }

    public final ck0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        org.telegram.ui.Cells.v5 v5Var = new org.telegram.ui.Cells.v5(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.G) {
            v5Var.setOutlineProvider(new org.telegram.ui.ol(this, 2));
            v5Var.setClipToOutline(true);
        }
        v5Var.setFastScrollDelegate(new t(this, 22));
        v5Var.setDelegate(new f2(9, this, v5Var));
        return new ck0(v5Var);
    }

    public final org.telegram.messenger.ef M(int i10) {
        boolean z10 = this.f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (z10 && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.q1;
        return chatAttachAlertPhotoLayout.c0(i10);
    }

    @Override // s4.g0
    public final int b() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        bm bmVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.v0) {
            return 1;
        }
        int i10 = 0;
        this.e = false;
        this.f = false;
        boolean z10 = chatAttachAlertPhotoLayout.P0;
        if (z10 && this == bmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            this.e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.g1) {
            i10++;
        }
        if (z10 && this == bmVar) {
            i10++;
        }
        this.r = i10;
        if (!z10) {
            i10 += ChatAttachAlertPhotoLayout.r1.size();
            org.telegram.messenger.we weVar = chatAttachAlertPhotoLayout.T0;
            if (weVar != null) {
                i10 += weVar.e.size();
            }
        }
        if (this.e && i10 > chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.O0) {
            this.f = true;
            i10++;
        }
        if (this == bmVar) {
            i10++;
        }
        this.n = i10;
        return i10;
    }

    @Override // s4.g0
    public final int d(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        bm bmVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.v0) {
            return 2;
        }
        boolean z10 = chatAttachAlertPhotoLayout.P0;
        if (z10 && this == bmVar) {
            return i10 == 0 ? 7 : 2;
        }
        boolean z11 = this.d;
        if (z11 && i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            return chatAttachAlertPhotoLayout.O0 ? 8 : 1;
        }
        boolean z12 = this.f;
        if (z12 && i10 == chatAttachAlertPhotoLayout.M0) {
            return 5;
        }
        int i11 = (!z12 || i10 <= chatAttachAlertPhotoLayout.M0) ? i10 : i10 - 1;
        if (z11) {
            i11--;
        }
        if (chatAttachAlertPhotoLayout.g1 && i11 == 0) {
            return 4;
        }
        if (this == bmVar && i10 == this.n - 1) {
            return 2;
        }
        return z10 ? 3 : 0;
    }

    @Override // s4.g0
    public final void f() {
        super.f();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (this == chatAttachAlertPhotoLayout.G) {
            chatAttachAlertPhotoLayout.H.setVisibility((!(b() == 1 && !chatAttachAlertPhotoLayout.P0 && chatAttachAlertPhotoLayout.T0 == null) && chatAttachAlertPhotoLayout.v0) ? 4 : 0);
        }
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        bi biVar = chatAttachAlertPhotoLayout.b;
        int i11 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.p5) view).setItemSize(chatAttachAlertPhotoLayout.K0);
                return;
            }
            if (i11 != 3) {
                if (i11 != 7) {
                    return;
                }
                ((m10) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.g1);
                return;
            } else {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                q5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
                q5Var.setType((z10 && chatAttachAlertPhotoLayout.O0 && i10 == 0) ? 0 : 1);
                return;
            }
        }
        if (this.f && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (z10 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.g1) {
            i10--;
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        if (this == chatAttachAlertPhotoLayout.G) {
            v5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
        } else {
            v5Var.setIsVertical(chatAttachAlertPhotoLayout.s.o == 1);
        }
        if (biVar.K2 != 0 || biVar.N2 || biVar.y1) {
            v5Var.getCheckBox().setVisibility(8);
        } else {
            v5Var.getCheckBox().setVisibility(0);
        }
        org.telegram.messenger.ef c02 = chatAttachAlertPhotoLayout.c0(i10);
        if (c02 == null) {
            return;
        }
        int i12 = c02.C;
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        v5Var.d(c02, hashMap.size() > 1, z10 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, i10 == b() - 1, biVar != null && biVar.Z1);
        if ((biVar.W1 instanceof org.telegram.ui.un) && biVar.N3) {
            v5Var.b(ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(i12)), hashMap.containsKey(Integer.valueOf(i12)), false);
        } else {
            v5Var.b(-1, hashMap.containsKey(Integer.valueOf(i12)), false);
        }
        if (!chatAttachAlertPhotoLayout.w0 && c02.b) {
            v5Var.setAlpha(0.3f);
        } else if (chatAttachAlertPhotoLayout.x0 || c02.b) {
            v5Var.setAlpha(1.0f);
        } else {
            v5Var.setAlpha(0.3f);
        }
        v5Var.getImageView().setTag(Integer.valueOf(i10));
        v5Var.setTag(Integer.valueOf(i10));
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        bi biVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.p6 p6Var = chatAttachAlertPhotoLayout.a;
        if (i10 == 0) {
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                return L();
            }
            ck0 ck0Var = (ck0) arrayList.get(0);
            arrayList.remove(0);
            return ck0Var;
        }
        Context context = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.p5 p5Var = new org.telegram.ui.Cells.p5(context);
            p5Var.setFocusable(true);
            p5Var.a = org.telegram.messenger.i0.L(0.0f);
            return new ck0(p5Var);
        }
        int i11 = 2;
        if (i10 == 2) {
            return new ck0(new bi.t0(this, context, 9));
        }
        if (i10 == 4) {
            biVar.getClass();
            return new ck0(new am(this, context));
        }
        int i12 = 5;
        if (i10 == 5) {
            return new ck0(new View(context));
        }
        int i13 = 17;
        if (i10 == 7) {
            m10 m10Var = new m10(context, biVar.D3);
            m10Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(400.0f)));
            m10Var.setGravity(17);
            m10Var.isClickable();
            m10Var.b.setOnClickListener(new h0(new hl(chatAttachAlertPhotoLayout, i12), 16));
            int i14 = 6;
            m10Var.a.setOnClickListener(new h0(new hl(chatAttachAlertPhotoLayout, i14), i13));
            m10Var.c.setOnClickListener(new sr(i14, m10Var, new r2(this, i11)));
            return new ck0(m10Var);
        }
        if (i10 == 8) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
            vh.d dVar = new vh.d(context, p6Var, true);
            dVar.setUseWrapContent(true);
            dVar.f();
            dVar.setPadding(org.telegram.messenger.i0.L(28.0f), 0, org.telegram.messenger.i0.L(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new dq(R.drawable.camera, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.cd.L0(2131750490, null));
            dVar.i(spannableStringBuilder, false, true);
            frameLayout.addView(dVar, w7.b6.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new ck0(frameLayout);
        }
        org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(context);
        ImageView imageView = new ImageView(context);
        q5Var.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.t6.aa;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i15, p6Var, mode);
        q5Var.addView(imageView, w7.b6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        ImageView imageView2 = new ImageView(context);
        q5Var.b = imageView2;
        imageView2.setScaleType(scaleType);
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.ba, p6Var, mode);
        q5Var.addView(imageView2, w7.b6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        TextView textView = new TextView(context);
        q5Var.c = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.ca, p6Var);
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        q5Var.addView(textView, w7.b6.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
        q5Var.d = org.telegram.messenger.i0.L(80.0f);
        return new ck0(q5Var);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        if (c1Var.a instanceof org.telegram.ui.Cells.p5) {
            this.w.Q.i();
        }
    }
}
