package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cm extends tk0 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final /* synthetic */ ChatAttachAlertPhotoLayout v;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean E(jl0 jl0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.n1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        return !(isEmpty && ((albumEntry = chatAttachAlertPhotoLayout.P0) == null || albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.b.N && h() > 30;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i10);
        if (M == null) {
            int i11 = this.r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.n1;
                if (arrayList2.isEmpty()) {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.P0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        M = arrayList.get(0);
                    }
                } else {
                    M = (MediaController.PhotoEntry) arrayList2.get(0);
                }
            } else if (!chatAttachAlertPhotoLayout.P0.photos.isEmpty()) {
                M = (MediaController.PhotoEntry) j7.l1.i(1, chatAttachAlertPhotoLayout.P0.photos);
            }
        }
        if (M == null) {
            return "";
        }
        long j10 = M.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        int measuredHeight = jl0Var.getChildAt(0).getMeasuredHeight();
        float h = h();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h / chatAttachAlertPhotoLayout.I0) * measuredHeight)) - (jl0Var.getMeasuredHeight() - currentActionBarHeight)) * f9;
        float f10 = measuredHeight;
        iArr[0] = ((int) (ceil / f10)) * chatAttachAlertPhotoLayout.I0;
        int paddingTop = jl0Var.getPaddingTop() + ((int) (ceil % f10)) + ((int) ((1.0f - f9) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
            return;
        }
        iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
    }

    @Override // org.telegram.ui.Components.tk0
    public final float H(jl0 jl0Var) {
        int i10 = this.v.I0;
        int ceil = (int) Math.ceil(this.n / i10);
        if (jl0Var.getChildCount() != 0) {
            int measuredHeight = jl0Var.getChildAt(0).getMeasuredHeight();
            if (RecyclerView.R(jl0Var.getChildAt(0)) >= 0) {
                return Utilities.clamp((((r5 / i10) * measuredHeight) - r2.getTop()) / ((ceil * measuredHeight) - (jl0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void J(jl0 jl0Var) {
        this.s = false;
        int childCount = jl0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            jl0Var.getChildAt(i10).invalidate();
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final void K() {
        this.s = true;
    }

    public final vk0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.r5 r5Var = new org.telegram.ui.Cells.r5(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.C) {
            r5Var.setOutlineProvider(new am(this));
            r5Var.setClipToOutline(true);
        }
        r5Var.setFastScrollDelegate(new u(this, 22));
        r5Var.setDelegate(new j1(14, this, r5Var));
        return new vk0(r5Var);
    }

    public final MediaController.PhotoEntry M(int i10) {
        boolean z10 = this.f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z10 && i10 > chatAttachAlertPhotoLayout.I0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            i10--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.m1;
        return chatAttachAlertPhotoLayout.b0(i10);
    }

    @Override // f2.p0
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        cm cmVar = chatAttachAlertPhotoLayout.C;
        if (!chatAttachAlertPhotoLayout.r0) {
            return 1;
        }
        int i10 = 0;
        this.e = false;
        this.f = false;
        boolean z10 = chatAttachAlertPhotoLayout.L0;
        if (z10 && this == cmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            this.e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.c1) {
            i10++;
        }
        if (z10 && this == cmVar) {
            i10++;
        }
        this.r = i10;
        if (!z10) {
            i10 += ChatAttachAlertPhotoLayout.n1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.P0;
            if (albumEntry != null) {
                i10 += albumEntry.photos.size();
            }
        }
        if (this.e && i10 > chatAttachAlertPhotoLayout.I0 && !chatAttachAlertPhotoLayout.K0) {
            this.f = true;
            i10++;
        }
        if (this == cmVar) {
            i10++;
        }
        this.n = i10;
        return i10;
    }

    @Override // f2.p0
    public final int j(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        cm cmVar = chatAttachAlertPhotoLayout.C;
        if (!chatAttachAlertPhotoLayout.r0) {
            return 2;
        }
        boolean z10 = chatAttachAlertPhotoLayout.L0;
        if (z10 && this == cmVar) {
            return i10 == 0 ? 7 : 2;
        }
        boolean z11 = this.d;
        if (z11 && i10 == 0 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            return chatAttachAlertPhotoLayout.K0 ? 8 : 1;
        }
        boolean z12 = this.f;
        if (z12 && i10 == chatAttachAlertPhotoLayout.I0) {
            return 5;
        }
        int i11 = (!z12 || i10 <= chatAttachAlertPhotoLayout.I0) ? i10 : i10 - 1;
        if (z11) {
            i11--;
        }
        if (chatAttachAlertPhotoLayout.c1 && i11 == 0) {
            return 4;
        }
        if (this == cmVar && i10 == this.n - 1) {
            return 2;
        }
        return z10 ? 3 : 0;
    }

    @Override // f2.p0
    public final void l() {
        super.l();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (this == chatAttachAlertPhotoLayout.C) {
            chatAttachAlertPhotoLayout.D.setVisibility((!(h() == 1 && !chatAttachAlertPhotoLayout.L0 && chatAttachAlertPhotoLayout.P0 == null) && chatAttachAlertPhotoLayout.r0) ? 4 : 0);
        }
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ni niVar = chatAttachAlertPhotoLayout.b;
        int i11 = n1Var.f;
        View view = n1Var.a;
        boolean z10 = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.k5) view).setItemSize(chatAttachAlertPhotoLayout.G0);
                return;
            }
            if (i11 != 3) {
                if (i11 != 7) {
                    return;
                }
                ((c20) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.c1);
                return;
            } else {
                org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
                l5Var.setItemSize(chatAttachAlertPhotoLayout.G0);
                l5Var.setType((z10 && chatAttachAlertPhotoLayout.K0 && i10 == 0) ? 0 : 1);
                return;
            }
        }
        if (this.f && i10 > chatAttachAlertPhotoLayout.I0) {
            i10--;
        }
        if (z10 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.c1) {
            i10--;
        }
        org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
        if (this == chatAttachAlertPhotoLayout.C) {
            r5Var.setItemSize(chatAttachAlertPhotoLayout.G0);
        } else {
            r5Var.setIsVertical(chatAttachAlertPhotoLayout.s.o == 1);
        }
        if (niVar.M0 != 0 || niVar.P0 || niVar.D) {
            r5Var.getCheckBox().setVisibility(8);
        } else {
            r5Var.getCheckBox().setVisibility(0);
        }
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
        r5Var.d(b02, hashMap.size() > 1, z10 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0, i10 == h() - 1, niVar != null && niVar.e0);
        if ((niVar.b0 instanceof org.telegram.ui.tn) && niVar.P1) {
            r5Var.b(ChatAttachAlertPhotoLayout.p1.indexOf(Integer.valueOf(b02.imageId)), hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        } else {
            r5Var.b(-1, hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.s0 && b02.isVideo) {
            r5Var.setAlpha(0.3f);
        } else if (chatAttachAlertPhotoLayout.t0 || b02.isVideo) {
            r5Var.setAlpha(1.0f);
        } else {
            r5Var.setAlpha(0.3f);
        }
        r5Var.getImageView().setTag(Integer.valueOf(i10));
        r5Var.setTag(Integer.valueOf(i10));
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ni niVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.c6 c6Var = chatAttachAlertPhotoLayout.a;
        if (i10 == 0) {
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                return L();
            }
            vk0 vk0Var = (vk0) arrayList.get(0);
            arrayList.remove(0);
            return vk0Var;
        }
        Context context = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.k5 k5Var = new org.telegram.ui.Cells.k5(context);
            k5Var.setFocusable(true);
            k5Var.a = AndroidUtilities.dp(0.0f);
            return new vk0(k5Var);
        }
        if (i10 == 2) {
            return new vk0(new cg.h0(this, context, 10));
        }
        if (i10 == 4) {
            niVar.getClass();
            return new vk0(new bm(this, context));
        }
        if (i10 == 5) {
            return new vk0(new View(context));
        }
        if (i10 == 7) {
            c20 c20Var = new c20(context, niVar.F1);
            c20Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(400.0f)));
            c20Var.setGravity(17);
            c20Var.isClickable();
            c20Var.b.setOnClickListener(new h0(new gl(chatAttachAlertPhotoLayout, 5), 18));
            c20Var.a.setOnClickListener(new h0(new gl(chatAttachAlertPhotoLayout, 6), 19));
            c20Var.c.setOnClickListener(new t2(23, c20Var, new y2(this, 2)));
            return new vk0(c20Var);
        }
        if (i10 == 8) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
            nh.d dVar = new nh.d(context, c6Var, true);
            dVar.setUseWrapContent(true);
            dVar.e();
            dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new iq(R.drawable.camera, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
            dVar.g(spannableStringBuilder, false, true);
            frameLayout.addView(dVar, i7.f6.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new vk0(frameLayout);
        }
        org.telegram.ui.Cells.l5 l5Var = new org.telegram.ui.Cells.l5(context);
        ImageView imageView = new ImageView(context);
        l5Var.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.aa, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        l5Var.addView(imageView, i7.f6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        ImageView imageView2 = new ImageView(context);
        l5Var.b = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ba, c6Var), mode));
        l5Var.addView(imageView2, i7.f6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        TextView textView = new TextView(context);
        l5Var.c = textView;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.ca, c6Var, textView, 1, 12.0f);
        textView.setGravity(17);
        l5Var.addView(textView, i7.f6.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
        l5Var.d = AndroidUtilities.dp(80.0f);
        return new vk0(l5Var);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        if (n1Var.a instanceof org.telegram.ui.Cells.k5) {
            this.v.M.f();
        }
    }
}
