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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sl extends zi0 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final /* synthetic */ ChatAttachAlertPhotoLayout w;

    public sl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.w = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.zi0
    public final boolean E(tj0 tj0Var) {
        org.telegram.messenger.pe peVar;
        boolean isEmpty = ChatAttachAlertPhotoLayout.s1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        return !(isEmpty && ((peVar = chatAttachAlertPhotoLayout.U0) == null || peVar.e.isEmpty())) && chatAttachAlertPhotoLayout.b.J1 && b() > 30;
    }

    @Override // org.telegram.ui.Components.zi0
    public final String F(int i3) {
        ArrayList arrayList;
        org.telegram.messenger.ye M = M(i3);
        if (M == null) {
            int i10 = this.r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
            if (i3 <= i10) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.s1;
                if (arrayList2.isEmpty()) {
                    org.telegram.messenger.pe peVar = chatAttachAlertPhotoLayout.U0;
                    if (peVar != null && (arrayList = peVar.e) != null) {
                        M = (org.telegram.messenger.ye) arrayList.get(0);
                    }
                } else {
                    M = (org.telegram.messenger.ye) arrayList2.get(0);
                }
            } else if (!chatAttachAlertPhotoLayout.U0.e.isEmpty()) {
                M = (org.telegram.messenger.ye) k2.p1.h(1, chatAttachAlertPhotoLayout.U0.e);
            }
        }
        if (M == null) {
            return "";
        }
        long j10 = M.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return org.telegram.messenger.bd.e0(j10, true);
    }

    @Override // org.telegram.ui.Components.zi0
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = tj0Var.getChildAt(0).getMeasuredHeight();
        float b10 = b();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        float ceil = (((int) (Math.ceil(b10 / chatAttachAlertPhotoLayout.N0) * measuredHeight)) - (tj0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (ceil / f11)) * chatAttachAlertPhotoLayout.N0;
        int paddingTop = tj0Var.getPaddingTop() + ((int) (ceil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
            return;
        }
        iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
    }

    @Override // org.telegram.ui.Components.zi0
    public final float H(tj0 tj0Var) {
        int i3 = this.w.N0;
        int ceil = (int) Math.ceil(this.n / i3);
        if (tj0Var.getChildCount() != 0) {
            int measuredHeight = tj0Var.getChildAt(0).getMeasuredHeight();
            if (RecyclerView.R(tj0Var.getChildAt(0)) >= 0) {
                return Utilities.i((((r5 / i3) * measuredHeight) - r2.getTop()) / ((ceil * measuredHeight) - (tj0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.zi0
    public final void J(tj0 tj0Var) {
        this.s = false;
        int childCount = tj0Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            tj0Var.getChildAt(i3).invalidate();
        }
    }

    @Override // org.telegram.ui.Components.zi0
    public final void K() {
        this.s = true;
    }

    public final bj0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.H) {
            q5Var.setOutlineProvider(new gh.a(this, 3));
            q5Var.setClipToOutline(true);
        }
        q5Var.setFastScrollDelegate(new t(this, 22));
        q5Var.setDelegate(new org.telegram.ui.jo(18, this, q5Var));
        return new bj0(q5Var);
    }

    public final org.telegram.messenger.ye M(int i3) {
        boolean z10 = this.f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (z10 && i3 > chatAttachAlertPhotoLayout.N0) {
            i3--;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i3--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.r1;
        return chatAttachAlertPhotoLayout.e0(i3);
    }

    @Override // u4.h0
    public final int b() {
        int i3 = 0;
        this.e = false;
        this.f = false;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        sl slVar = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.w0) {
            return 1;
        }
        boolean z10 = chatAttachAlertPhotoLayout.Q0;
        if (z10 && this == slVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            this.e = true;
            i3 = 1;
        }
        if (chatAttachAlertPhotoLayout.h1) {
            i3++;
        }
        if (z10 && this == slVar) {
            i3++;
        }
        this.r = i3;
        if (!z10) {
            i3 += ChatAttachAlertPhotoLayout.s1.size();
            org.telegram.messenger.pe peVar = chatAttachAlertPhotoLayout.U0;
            if (peVar != null) {
                i3 += peVar.e.size();
            }
        }
        if (this.e && i3 > chatAttachAlertPhotoLayout.N0 && !chatAttachAlertPhotoLayout.P0) {
            this.f = true;
            i3++;
        }
        if (this == slVar) {
            i3++;
        }
        this.n = i3;
        return i3;
    }

    @Override // u4.h0
    public final int d(int i3) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        sl slVar = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.w0) {
            return 2;
        }
        boolean z10 = chatAttachAlertPhotoLayout.Q0;
        if (z10 && this == slVar) {
            return i3 == 0 ? 7 : 2;
        }
        boolean z11 = this.d;
        if (z11 && i3 == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            return chatAttachAlertPhotoLayout.P0 ? 8 : 1;
        }
        boolean z12 = this.f;
        if (z12 && i3 == chatAttachAlertPhotoLayout.N0) {
            return 5;
        }
        int i10 = (!z12 || i3 <= chatAttachAlertPhotoLayout.N0) ? i3 : i3 - 1;
        if (z11) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.h1 && i10 == 0) {
            return 4;
        }
        if (this == slVar && i3 == this.n - 1) {
            return 2;
        }
        return z10 ? 3 : 0;
    }

    @Override // u4.h0
    public final void f() {
        super.f();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (this == chatAttachAlertPhotoLayout.H) {
            chatAttachAlertPhotoLayout.I.setVisibility((!(b() == 1 && !chatAttachAlertPhotoLayout.Q0 && chatAttachAlertPhotoLayout.U0 == null) && chatAttachAlertPhotoLayout.w0) ? 4 : 0);
        }
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        bi biVar = chatAttachAlertPhotoLayout.b;
        int i10 = d1Var.f;
        View view = d1Var.a;
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
                ((s00) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.h1);
                return;
            } else {
                org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
                l5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
                l5Var.setType((z10 && chatAttachAlertPhotoLayout.P0 && i3 == 0) ? 0 : 1);
                return;
            }
        }
        if (this.f && i3 > chatAttachAlertPhotoLayout.N0) {
            i3--;
        }
        if (z10 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i3--;
        }
        if (chatAttachAlertPhotoLayout.h1) {
            i3--;
        }
        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
        if (this == chatAttachAlertPhotoLayout.H) {
            q5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
        } else {
            q5Var.setIsVertical(chatAttachAlertPhotoLayout.s.o == 1);
        }
        if (biVar.L2 != 0 || biVar.O2 || biVar.z1) {
            q5Var.getCheckBox().setVisibility(8);
        } else {
            q5Var.getCheckBox().setVisibility(0);
        }
        org.telegram.messenger.ye e02 = chatAttachAlertPhotoLayout.e0(i3);
        if (e02 == null) {
            return;
        }
        int i11 = e02.C;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        q5Var.d(e02, hashMap.size() > 1, z10 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0, i3 == b() - 1, biVar != null && biVar.a2);
        if ((biVar.X1 instanceof org.telegram.ui.wm) && biVar.O3) {
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
        q5Var.getImageView().setTag(Integer.valueOf(i3));
        q5Var.setTag(Integer.valueOf(i3));
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        bi biVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.e6 e6Var = chatAttachAlertPhotoLayout.a;
        if (i3 == 0) {
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                return L();
            }
            bj0 bj0Var = (bj0) arrayList.get(0);
            arrayList.remove(0);
            return bj0Var;
        }
        Context context = this.c;
        if (i3 == 1) {
            org.telegram.ui.Cells.k5 k5Var = new org.telegram.ui.Cells.k5(context);
            k5Var.setFocusable(true);
            k5Var.a = org.telegram.messenger.g0.L(0.0f);
            return new bj0(k5Var);
        }
        int i10 = 2;
        if (i3 == 2) {
            return new bj0(new ai.x2(15, context, this));
        }
        if (i3 == 4) {
            biVar.getClass();
            return new bj0(new rl(this, context));
        }
        int i11 = 5;
        if (i3 == 5) {
            return new bj0(new View(context));
        }
        int i12 = 17;
        if (i3 == 7) {
            s00 s00Var = new s00(context, biVar.E3);
            s00Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(400.0f)));
            s00Var.setGravity(17);
            s00Var.isClickable();
            s00Var.b.setOnClickListener(new f0(new al(chatAttachAlertPhotoLayout, i11), i12));
            s00Var.a.setOnClickListener(new f0(new al(chatAttachAlertPhotoLayout, 6), 18));
            s00Var.c.setOnClickListener(new q2(19, s00Var, new p2(this, i10)));
            return new bj0(s00Var);
        }
        if (i3 == 8) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
            gi.d dVar = new gi.d(context, e6Var, true);
            dVar.setUseWrapContent(true);
            dVar.f();
            dVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new wp(R.drawable.camera, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.bd.M0(2131750489, null));
            dVar.i(spannableStringBuilder, false, true);
            frameLayout.addView(dVar, b8.mf.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new bj0(frameLayout);
        }
        org.telegram.ui.Cells.l5 l5Var = new org.telegram.ui.Cells.l5(context);
        ImageView imageView = new ImageView(context);
        l5Var.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i13 = org.telegram.ui.ActionBar.k6.aa;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i13, e6Var, mode);
        l5Var.addView(imageView, b8.mf.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        ImageView imageView2 = new ImageView(context);
        l5Var.b = imageView2;
        imageView2.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.ba, e6Var, mode);
        l5Var.addView(imageView2, b8.mf.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        TextView textView = new TextView(context);
        l5Var.c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.ca, e6Var);
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        l5Var.addView(textView, b8.mf.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
        l5Var.d = org.telegram.messenger.g0.L(80.0f);
        return new bj0(l5Var);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        if (d1Var.a instanceof org.telegram.ui.Cells.k5) {
            this.w.R.i();
        }
    }
}
