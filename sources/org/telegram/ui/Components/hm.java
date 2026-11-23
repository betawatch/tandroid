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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hm extends kj0 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final /* synthetic */ ChatAttachAlertPhotoLayout w;

    public hm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.w = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.kj0
    public final boolean E(ek0 ek0Var) {
        org.telegram.messenger.ue ueVar;
        boolean isEmpty = ChatAttachAlertPhotoLayout.s1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        return !(isEmpty && ((ueVar = chatAttachAlertPhotoLayout.U0) == null || ueVar.e.isEmpty())) && chatAttachAlertPhotoLayout.b.M1 && b() > 30;
    }

    @Override // org.telegram.ui.Components.kj0
    public final String F(int i7) {
        ArrayList arrayList;
        org.telegram.messenger.ef M = M(i7);
        if (M == null) {
            int i10 = this.r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
            if (i7 <= i10) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.s1;
                if (arrayList2.isEmpty()) {
                    org.telegram.messenger.ue ueVar = chatAttachAlertPhotoLayout.U0;
                    if (ueVar != null && (arrayList = ueVar.e) != null) {
                        M = (org.telegram.messenger.ef) arrayList.get(0);
                    }
                } else {
                    M = (org.telegram.messenger.ef) arrayList2.get(0);
                }
            } else if (!chatAttachAlertPhotoLayout.U0.e.isEmpty()) {
                M = (org.telegram.messenger.ef) i5.c.h(1, chatAttachAlertPhotoLayout.U0.e);
            }
        }
        if (M == null) {
            return "";
        }
        long j3 = M.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return org.telegram.messenger.gd.e0(j3, true);
    }

    @Override // org.telegram.ui.Components.kj0
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
        float b10 = b();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        float ceil = (((int) (Math.ceil(b10 / chatAttachAlertPhotoLayout.N0) * measuredHeight)) - (ek0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (ceil / f11)) * chatAttachAlertPhotoLayout.N0;
        int paddingTop = ek0Var.getPaddingTop() + ((int) (ceil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
            return;
        }
        iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
    }

    @Override // org.telegram.ui.Components.kj0
    public final float H(ek0 ek0Var) {
        int i7 = this.w.N0;
        int ceil = (int) Math.ceil(this.n / i7);
        if (ek0Var.getChildCount() != 0) {
            int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
            if (RecyclerView.R(ek0Var.getChildAt(0)) >= 0) {
                return Utilities.i((((r5 / i7) * measuredHeight) - r2.getTop()) / ((ceil * measuredHeight) - (ek0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void J(ek0 ek0Var) {
        this.s = false;
        int childCount = ek0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ek0Var.getChildAt(i7).invalidate();
        }
    }

    @Override // org.telegram.ui.Components.kj0
    public final void K() {
        this.s = true;
    }

    public final mj0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        org.telegram.ui.Cells.r5 r5Var = new org.telegram.ui.Cells.r5(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.H) {
            r5Var.setOutlineProvider(new fh.a(this, 3));
            r5Var.setClipToOutline(true);
        }
        r5Var.setFastScrollDelegate(new b0(this, 21));
        r5Var.setDelegate(new g2(11, this, r5Var));
        return new mj0(r5Var);
    }

    public final org.telegram.messenger.ef M(int i7) {
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

    @Override // v4.i0
    public final int b() {
        int i7 = 0;
        this.e = false;
        this.f = false;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        hm hmVar = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.w0) {
            return 1;
        }
        boolean z10 = chatAttachAlertPhotoLayout.Q0;
        if (z10 && this == hmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            this.e = true;
            i7 = 1;
        }
        if (chatAttachAlertPhotoLayout.h1) {
            i7++;
        }
        if (z10 && this == hmVar) {
            i7++;
        }
        this.r = i7;
        if (!z10) {
            i7 += ChatAttachAlertPhotoLayout.s1.size();
            org.telegram.messenger.ue ueVar = chatAttachAlertPhotoLayout.U0;
            if (ueVar != null) {
                i7 += ueVar.e.size();
            }
        }
        if (this.e && i7 > chatAttachAlertPhotoLayout.N0 && !chatAttachAlertPhotoLayout.P0) {
            this.f = true;
            i7++;
        }
        if (this == hmVar) {
            i7++;
        }
        this.n = i7;
        return i7;
    }

    @Override // v4.i0
    public final int d(int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        hm hmVar = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.w0) {
            return 2;
        }
        boolean z10 = chatAttachAlertPhotoLayout.Q0;
        if (z10 && this == hmVar) {
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
        if (this == hmVar && i7 == this.n - 1) {
            return 2;
        }
        return z10 ? 3 : 0;
    }

    @Override // v4.i0
    public final void f() {
        super.f();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (this == chatAttachAlertPhotoLayout.H) {
            chatAttachAlertPhotoLayout.I.setVisibility((!(b() == 1 && !chatAttachAlertPhotoLayout.Q0 && chatAttachAlertPhotoLayout.U0 == null) && chatAttachAlertPhotoLayout.w0) ? 4 : 0);
        }
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        int i10 = f1Var.f;
        View view = f1Var.a;
        boolean z10 = this.d;
        if (i10 != 0) {
            if (i10 == 1) {
                ((org.telegram.ui.Cells.l5) view).setItemSize(chatAttachAlertPhotoLayout.L0);
                return;
            }
            if (i10 != 3) {
                if (i10 != 7) {
                    return;
                }
                ((i10) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.h1);
                return;
            } else {
                org.telegram.ui.Cells.m5 m5Var = (org.telegram.ui.Cells.m5) view;
                m5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
                m5Var.setType((z10 && chatAttachAlertPhotoLayout.P0 && i7 == 0) ? 0 : 1);
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
        org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
        if (this == chatAttachAlertPhotoLayout.H) {
            r5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
        } else {
            r5Var.setIsVertical(chatAttachAlertPhotoLayout.s.o == 1);
        }
        if (tiVar.O2 != 0 || tiVar.R2 || tiVar.C1) {
            r5Var.getCheckBox().setVisibility(8);
        } else {
            r5Var.getCheckBox().setVisibility(0);
        }
        org.telegram.messenger.ef e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 == null) {
            return;
        }
        int i11 = e02.C;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        r5Var.d(e02, hashMap.size() > 1, z10 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0, i7 == b() - 1, tiVar != null && tiVar.d2);
        if ((tiVar.a2 instanceof org.telegram.ui.bn) && tiVar.R3) {
            r5Var.b(ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(i11)), hashMap.containsKey(Integer.valueOf(i11)), false);
        } else {
            r5Var.b(-1, hashMap.containsKey(Integer.valueOf(i11)), false);
        }
        if (!chatAttachAlertPhotoLayout.x0 && e02.b) {
            r5Var.setAlpha(0.3f);
        } else if (chatAttachAlertPhotoLayout.y0 || e02.b) {
            r5Var.setAlpha(1.0f);
        } else {
            r5Var.setAlpha(0.3f);
        }
        r5Var.getImageView().setTag(Integer.valueOf(i7));
        r5Var.setTag(Integer.valueOf(i7));
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.i6 i6Var = chatAttachAlertPhotoLayout.a;
        if (i7 == 0) {
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                return L();
            }
            mj0 mj0Var = (mj0) arrayList.get(0);
            arrayList.remove(0);
            return mj0Var;
        }
        Context context = this.c;
        if (i7 == 1) {
            org.telegram.ui.Cells.l5 l5Var = new org.telegram.ui.Cells.l5(context);
            l5Var.setFocusable(true);
            l5Var.a = org.telegram.messenger.g0.L(0.0f);
            return new mj0(l5Var);
        }
        int i10 = 15;
        if (i7 == 2) {
            return new mj0(new bi.o3(15, context, this));
        }
        int i11 = 4;
        if (i7 == 4) {
            tiVar.getClass();
            return new mj0(new gm(this, context));
        }
        int i12 = 5;
        if (i7 == 5) {
            return new mj0(new View(context));
        }
        if (i7 == 7) {
            i10 i10Var = new i10(context, tiVar.H3);
            i10Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(400.0f)));
            i10Var.setGravity(17);
            i10Var.isClickable();
            i10Var.b.setOnClickListener(new n0(new ql(chatAttachAlertPhotoLayout, i12), 19));
            i10Var.a.setOnClickListener(new n0(new ql(chatAttachAlertPhotoLayout, 6), 20));
            i10Var.c.setOnClickListener(new l8(i10, i10Var, new y2(this, i11)));
            return new mj0(i10Var);
        }
        if (i7 == 8) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
            hi.e eVar = new hi.e(context, i6Var, true);
            eVar.setUseWrapContent(true);
            eVar.f();
            eVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new kq(R.drawable.camera, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.gd.N0(2131750464, null));
            eVar.i(spannableStringBuilder, false, true);
            frameLayout.addView(eVar, c8.na.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new mj0(frameLayout);
        }
        org.telegram.ui.Cells.m5 m5Var = new org.telegram.ui.Cells.m5(context);
        ImageView imageView = new ImageView(context);
        m5Var.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i13 = org.telegram.ui.ActionBar.n6.aa;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i13, i6Var, mode);
        m5Var.addView(imageView, c8.na.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        ImageView imageView2 = new ImageView(context);
        m5Var.b = imageView2;
        imageView2.setScaleType(scaleType);
        org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.ba, i6Var, mode);
        m5Var.addView(imageView2, c8.na.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        TextView textView = new TextView(context);
        m5Var.c = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.ca, i6Var);
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        m5Var.addView(textView, c8.na.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
        m5Var.d = org.telegram.messenger.g0.L(80.0f);
        return new mj0(m5Var);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        if (f1Var.a instanceof org.telegram.ui.Cells.l5) {
            this.w.R.i();
        }
    }
}
