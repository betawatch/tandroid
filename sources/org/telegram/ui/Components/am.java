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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class am extends aj0 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final /* synthetic */ ChatAttachAlertPhotoLayout w;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.w = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.aj0
    public final boolean E(uj0 uj0Var) {
        org.telegram.messenger.ve veVar;
        boolean isEmpty = ChatAttachAlertPhotoLayout.s1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        return !(isEmpty && ((veVar = chatAttachAlertPhotoLayout.U0) == null || veVar.e.isEmpty())) && chatAttachAlertPhotoLayout.b.M1 && b() > 30;
    }

    @Override // org.telegram.ui.Components.aj0
    public final String F(int i7) {
        ArrayList arrayList;
        org.telegram.messenger.ff M = M(i7);
        if (M == null) {
            int i10 = this.r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
            if (i7 <= i10) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.s1;
                if (arrayList2.isEmpty()) {
                    org.telegram.messenger.ve veVar = chatAttachAlertPhotoLayout.U0;
                    if (veVar != null && (arrayList = veVar.e) != null) {
                        M = (org.telegram.messenger.ff) arrayList.get(0);
                    }
                } else {
                    M = (org.telegram.messenger.ff) arrayList2.get(0);
                }
            } else if (!chatAttachAlertPhotoLayout.U0.e.isEmpty()) {
                M = (org.telegram.messenger.ff) i5.c.h(1, chatAttachAlertPhotoLayout.U0.e);
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

    @Override // org.telegram.ui.Components.aj0
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = uj0Var.getChildAt(0).getMeasuredHeight();
        float b10 = b();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        float ceil = (((int) (Math.ceil(b10 / chatAttachAlertPhotoLayout.N0) * measuredHeight)) - (uj0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (ceil / f11)) * chatAttachAlertPhotoLayout.N0;
        int paddingTop = uj0Var.getPaddingTop() + ((int) (ceil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
            return;
        }
        iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
    }

    @Override // org.telegram.ui.Components.aj0
    public final float H(uj0 uj0Var) {
        int i7 = this.w.N0;
        int ceil = (int) Math.ceil(this.n / i7);
        if (uj0Var.getChildCount() != 0) {
            int measuredHeight = uj0Var.getChildAt(0).getMeasuredHeight();
            if (RecyclerView.R(uj0Var.getChildAt(0)) >= 0) {
                return Utilities.i((((r5 / i7) * measuredHeight) - r2.getTop()) / ((ceil * measuredHeight) - (uj0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.aj0
    public final void J(uj0 uj0Var) {
        this.s = false;
        int childCount = uj0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            uj0Var.getChildAt(i7).invalidate();
        }
    }

    @Override // org.telegram.ui.Components.aj0
    public final void K() {
        this.s = true;
    }

    public final cj0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.H) {
            q5Var.setOutlineProvider(new fh.a(this, 3));
            q5Var.setClipToOutline(true);
        }
        q5Var.setFastScrollDelegate(new s(this, 22));
        q5Var.setDelegate(new f1(12, this, q5Var));
        return new cj0(q5Var);
    }

    public final org.telegram.messenger.ff M(int i7) {
        boolean z10 = this.f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (z10 && i7 > chatAttachAlertPhotoLayout.N0) {
            i7--;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i7--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.r1;
        return chatAttachAlertPhotoLayout.e0(i7);
    }

    @Override // v4.h0
    public final int b() {
        int i7 = 0;
        this.e = false;
        this.f = false;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        am amVar = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.w0) {
            return 1;
        }
        boolean z10 = chatAttachAlertPhotoLayout.Q0;
        if (z10 && this == amVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            this.e = true;
            i7 = 1;
        }
        if (chatAttachAlertPhotoLayout.h1) {
            i7++;
        }
        if (z10 && this == amVar) {
            i7++;
        }
        this.r = i7;
        if (!z10) {
            i7 += ChatAttachAlertPhotoLayout.s1.size();
            org.telegram.messenger.ve veVar = chatAttachAlertPhotoLayout.U0;
            if (veVar != null) {
                i7 += veVar.e.size();
            }
        }
        if (this.e && i7 > chatAttachAlertPhotoLayout.N0 && !chatAttachAlertPhotoLayout.P0) {
            this.f = true;
            i7++;
        }
        if (this == amVar) {
            i7++;
        }
        this.n = i7;
        return i7;
    }

    @Override // v4.h0
    public final int d(int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        am amVar = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.w0) {
            return 2;
        }
        boolean z10 = chatAttachAlertPhotoLayout.Q0;
        if (z10 && this == amVar) {
            return i7 == 0 ? 7 : 2;
        }
        boolean z11 = this.d;
        if (z11 && i7 == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            return chatAttachAlertPhotoLayout.P0 ? 8 : 1;
        }
        boolean z12 = this.f;
        if (z12 && i7 == chatAttachAlertPhotoLayout.N0) {
            return 5;
        }
        int i10 = (!z12 || i7 <= chatAttachAlertPhotoLayout.N0) ? i7 : i7 - 1;
        if (z11) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.h1 && i10 == 0) {
            return 4;
        }
        if (this == amVar && i7 == this.n - 1) {
            return 2;
        }
        return z10 ? 3 : 0;
    }

    @Override // v4.h0
    public final void f() {
        super.f();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (this == chatAttachAlertPhotoLayout.H) {
            chatAttachAlertPhotoLayout.I.setVisibility((!(b() == 1 && !chatAttachAlertPhotoLayout.Q0 && chatAttachAlertPhotoLayout.U0 == null) && chatAttachAlertPhotoLayout.w0) ? 4 : 0);
        }
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        int i10 = e1Var.f;
        View view = e1Var.a;
        boolean z10 = this.d;
        if (i10 != 0) {
            if (i10 == 1) {
                ((org.telegram.ui.Cells.k5) view).setItemSize(chatAttachAlertPhotoLayout.L0);
                return;
            }
            if (i10 != 3) {
                if (i10 != 7) {
                    return;
                }
                ((a10) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.h1);
                return;
            } else {
                org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
                l5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
                l5Var.setType((z10 && chatAttachAlertPhotoLayout.P0 && i7 == 0) ? 0 : 1);
                return;
            }
        }
        if (this.f && i7 > chatAttachAlertPhotoLayout.N0) {
            i7--;
        }
        if (z10 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i7--;
        }
        if (chatAttachAlertPhotoLayout.h1) {
            i7--;
        }
        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
        if (this == chatAttachAlertPhotoLayout.H) {
            q5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
        } else {
            q5Var.setIsVertical(chatAttachAlertPhotoLayout.s.o == 1);
        }
        if (kiVar.O2 != 0 || kiVar.R2 || kiVar.C1) {
            q5Var.getCheckBox().setVisibility(8);
        } else {
            q5Var.getCheckBox().setVisibility(0);
        }
        org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 == null) {
            return;
        }
        int i11 = e02.C;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        q5Var.d(e02, hashMap.size() > 1, z10 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0, i7 == b() - 1, kiVar != null && kiVar.d2);
        if ((kiVar.a2 instanceof org.telegram.ui.an) && kiVar.R3) {
            q5Var.b(ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(i11)), hashMap.containsKey(Integer.valueOf(i11)), false);
        } else {
            q5Var.b(-1, hashMap.containsKey(Integer.valueOf(i11)), false);
        }
        if (!chatAttachAlertPhotoLayout.x0 && e02.b) {
            q5Var.setAlpha(0.3f);
        } else if (chatAttachAlertPhotoLayout.y0 || e02.b) {
            q5Var.setAlpha(1.0f);
        } else {
            q5Var.setAlpha(0.3f);
        }
        q5Var.getImageView().setTag(Integer.valueOf(i7));
        q5Var.setTag(Integer.valueOf(i7));
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.e6 e6Var = chatAttachAlertPhotoLayout.a;
        if (i7 == 0) {
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                return L();
            }
            cj0 cj0Var = (cj0) arrayList.get(0);
            arrayList.remove(0);
            return cj0Var;
        }
        Context context = this.c;
        if (i7 == 1) {
            org.telegram.ui.Cells.k5 k5Var = new org.telegram.ui.Cells.k5(context);
            k5Var.setFocusable(true);
            k5Var.a = org.telegram.messenger.g0.L(0.0f);
            return new cj0(k5Var);
        }
        if (i7 == 2) {
            return new cj0(new bi.o2(15, context, this));
        }
        int i10 = 4;
        if (i7 == 4) {
            kiVar.getClass();
            return new cj0(new zl(this, context));
        }
        int i11 = 5;
        if (i7 == 5) {
            return new cj0(new View(context));
        }
        if (i7 == 7) {
            a10 a10Var = new a10(context, kiVar.H3);
            a10Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(400.0f)));
            a10Var.setGravity(17);
            a10Var.isClickable();
            a10Var.b.setOnClickListener(new e0(new jl(chatAttachAlertPhotoLayout, i11), 18));
            a10Var.a.setOnClickListener(new e0(new jl(chatAttachAlertPhotoLayout, 6), 19));
            a10Var.c.setOnClickListener(new n2(20, a10Var, new q2(this, i10)));
            return new cj0(a10Var);
        }
        if (i7 == 8) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
            hi.d dVar = new hi.d(context, e6Var, true);
            dVar.setUseWrapContent(true);
            dVar.f();
            dVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new eq(R.drawable.camera, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.M0(2131750481, null));
            dVar.i(spannableStringBuilder, false, true);
            frameLayout.addView(dVar, c8.ja.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new cj0(frameLayout);
        }
        org.telegram.ui.Cells.l5 l5Var = new org.telegram.ui.Cells.l5(context);
        ImageView imageView = new ImageView(context);
        l5Var.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i12 = org.telegram.ui.ActionBar.j6.aa;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView, i12, e6Var, mode);
        l5Var.addView(imageView, c8.ja.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        ImageView imageView2 = new ImageView(context);
        l5Var.b = imageView2;
        imageView2.setScaleType(scaleType);
        org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.ba, e6Var, mode);
        l5Var.addView(imageView2, c8.ja.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        TextView textView = new TextView(context);
        l5Var.c = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.ca, e6Var);
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        l5Var.addView(textView, c8.ja.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
        l5Var.d = org.telegram.messenger.g0.L(80.0f);
        return new cj0(l5Var);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        if (e1Var.a instanceof org.telegram.ui.Cells.k5) {
            this.w.R.i();
        }
    }
}
