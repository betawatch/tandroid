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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fm extends dl0 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final /* synthetic */ ChatAttachAlertPhotoLayout v;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z4) {
        this.v = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z4;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.dl0
    public final boolean E(tl0 tl0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.o1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        return !(isEmpty && ((albumEntry = chatAttachAlertPhotoLayout.Q0) == null || albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.b.O && h() > 30;
    }

    @Override // org.telegram.ui.Components.dl0
    public final String F(int i10) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i10);
        if (M == null) {
            int i11 = this.r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.o1;
                if (arrayList2.isEmpty()) {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.Q0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        M = arrayList.get(0);
                    }
                } else {
                    M = (MediaController.PhotoEntry) arrayList2.get(0);
                }
            } else if (!chatAttachAlertPhotoLayout.Q0.photos.isEmpty()) {
                M = (MediaController.PhotoEntry) l.d.i(1, chatAttachAlertPhotoLayout.Q0.photos);
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

    @Override // org.telegram.ui.Components.dl0
    public final void G(tl0 tl0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = tl0Var.getChildAt(0).getMeasuredHeight();
        float h = h();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h / chatAttachAlertPhotoLayout.J0) * measuredHeight)) - (tl0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (ceil / f11)) * chatAttachAlertPhotoLayout.J0;
        int paddingTop = tl0Var.getPaddingTop() + ((int) (ceil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
            return;
        }
        iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
    }

    @Override // org.telegram.ui.Components.dl0
    public final float H(tl0 tl0Var) {
        int i10 = this.v.J0;
        int ceil = (int) Math.ceil(this.n / i10);
        if (tl0Var.getChildCount() != 0) {
            int measuredHeight = tl0Var.getChildAt(0).getMeasuredHeight();
            if (RecyclerView.R(tl0Var.getChildAt(0)) >= 0) {
                return Utilities.clamp((((r5 / i10) * measuredHeight) - r2.getTop()) / ((ceil * measuredHeight) - (tl0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void J(tl0 tl0Var) {
        this.s = false;
        int childCount = tl0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            tl0Var.getChildAt(i10).invalidate();
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public final void K() {
        this.s = true;
    }

    public final fl0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.D) {
            t5Var.setOutlineProvider(new dm(this));
            t5Var.setClipToOutline(true);
        }
        t5Var.setFastScrollDelegate(new t(this, 22));
        t5Var.setDelegate(new o1(13, this, t5Var));
        return new fl0(t5Var);
    }

    public final MediaController.PhotoEntry M(int i10) {
        boolean z4 = this.f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z4 && i10 > chatAttachAlertPhotoLayout.J0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
            i10--;
        }
        boolean z10 = ChatAttachAlertPhotoLayout.n1;
        return chatAttachAlertPhotoLayout.b0(i10);
    }

    @Override // f2.p0
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        fm fmVar = chatAttachAlertPhotoLayout.D;
        if (!chatAttachAlertPhotoLayout.s0) {
            return 1;
        }
        int i10 = 0;
        this.e = false;
        this.f = false;
        boolean z4 = chatAttachAlertPhotoLayout.M0;
        if (z4 && this == fmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
            this.e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.d1) {
            i10++;
        }
        if (z4 && this == fmVar) {
            i10++;
        }
        this.r = i10;
        if (!z4) {
            i10 += ChatAttachAlertPhotoLayout.o1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.Q0;
            if (albumEntry != null) {
                i10 += albumEntry.photos.size();
            }
        }
        if (this.e && i10 > chatAttachAlertPhotoLayout.J0 && !chatAttachAlertPhotoLayout.L0) {
            this.f = true;
            i10++;
        }
        if (this == fmVar) {
            i10++;
        }
        this.n = i10;
        return i10;
    }

    @Override // f2.p0
    public final int j(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        fm fmVar = chatAttachAlertPhotoLayout.D;
        if (!chatAttachAlertPhotoLayout.s0) {
            return 2;
        }
        boolean z4 = chatAttachAlertPhotoLayout.M0;
        if (z4 && this == fmVar) {
            return i10 == 0 ? 7 : 2;
        }
        boolean z10 = this.d;
        if (z10 && i10 == 0 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
            return chatAttachAlertPhotoLayout.L0 ? 8 : 1;
        }
        boolean z11 = this.f;
        if (z11 && i10 == chatAttachAlertPhotoLayout.J0) {
            return 5;
        }
        int i11 = (!z11 || i10 <= chatAttachAlertPhotoLayout.J0) ? i10 : i10 - 1;
        if (z10) {
            i11--;
        }
        if (chatAttachAlertPhotoLayout.d1 && i11 == 0) {
            return 4;
        }
        if (this == fmVar && i10 == this.n - 1) {
            return 2;
        }
        return z4 ? 3 : 0;
    }

    @Override // f2.p0
    public final void l() {
        super.l();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (this == chatAttachAlertPhotoLayout.D) {
            chatAttachAlertPhotoLayout.E.setVisibility((!(h() == 1 && !chatAttachAlertPhotoLayout.M0 && chatAttachAlertPhotoLayout.Q0 == null) && chatAttachAlertPhotoLayout.s0) ? 4 : 0);
        }
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        mi miVar = chatAttachAlertPhotoLayout.b;
        int i11 = m1Var.f;
        View view = m1Var.a;
        boolean z4 = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.m5) view).setItemSize(chatAttachAlertPhotoLayout.H0);
                return;
            }
            if (i11 != 3) {
                if (i11 != 7) {
                    return;
                }
                ((i20) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.d1);
                return;
            } else {
                org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                n5Var.setItemSize(chatAttachAlertPhotoLayout.H0);
                n5Var.setType((z4 && chatAttachAlertPhotoLayout.L0 && i10 == 0) ? 0 : 1);
                return;
            }
        }
        if (this.f && i10 > chatAttachAlertPhotoLayout.J0) {
            i10--;
        }
        if (z4 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.d1) {
            i10--;
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        if (this == chatAttachAlertPhotoLayout.D) {
            t5Var.setItemSize(chatAttachAlertPhotoLayout.H0);
        } else {
            t5Var.setIsVertical(chatAttachAlertPhotoLayout.s.o == 1);
        }
        if (miVar.N0 != 0 || miVar.Q0 || miVar.E) {
            t5Var.getCheckBox().setVisibility(8);
        } else {
            t5Var.getCheckBox().setVisibility(0);
        }
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.p1;
        t5Var.d(b02, hashMap.size() > 1, z4 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0, i10 == h() - 1, miVar != null && miVar.f0);
        if ((miVar.c0 instanceof org.telegram.ui.xn) && miVar.Q1) {
            t5Var.b(ChatAttachAlertPhotoLayout.q1.indexOf(Integer.valueOf(b02.imageId)), hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        } else {
            t5Var.b(-1, hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.t0 && b02.isVideo) {
            t5Var.setAlpha(0.3f);
        } else if (chatAttachAlertPhotoLayout.u0 || b02.isVideo) {
            t5Var.setAlpha(1.0f);
        } else {
            t5Var.setAlpha(0.3f);
        }
        t5Var.getImageView().setTag(Integer.valueOf(i10));
        t5Var.setTag(Integer.valueOf(i10));
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        mi miVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.g6 g6Var = chatAttachAlertPhotoLayout.a;
        if (i10 == 0) {
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                return L();
            }
            fl0 fl0Var = (fl0) arrayList.get(0);
            arrayList.remove(0);
            return fl0Var;
        }
        Context context = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.m5 m5Var = new org.telegram.ui.Cells.m5(context);
            m5Var.setFocusable(true);
            m5Var.a = AndroidUtilities.dp(0.0f);
            return new fl0(m5Var);
        }
        if (i10 == 2) {
            return new fl0(new fg.h0(this, context, 8));
        }
        if (i10 == 4) {
            miVar.getClass();
            return new fl0(new em(this, context));
        }
        if (i10 == 5) {
            return new fl0(new View(context));
        }
        if (i10 == 7) {
            i20 i20Var = new i20(context, miVar.G1);
            i20Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(400.0f)));
            i20Var.setGravity(17);
            i20Var.isClickable();
            i20Var.b.setOnClickListener(new g0(new hl(chatAttachAlertPhotoLayout, 5), 18));
            i20Var.a.setOnClickListener(new g0(new hl(chatAttachAlertPhotoLayout, 6), 19));
            i20Var.c.setOnClickListener(new w2(20, i20Var, new v2(this, 2)));
            return new fl0(i20Var);
        }
        if (i10 == 8) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
            qh.d dVar = new qh.d(context, g6Var, true);
            dVar.setUseWrapContent(true);
            dVar.e();
            dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new oq(R.drawable.camera, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
            dVar.g(spannableStringBuilder, false, true);
            frameLayout.addView(dVar, k7.c6.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new fl0(frameLayout);
        }
        org.telegram.ui.Cells.n5 n5Var = new org.telegram.ui.Cells.n5(context);
        ImageView imageView = new ImageView(context);
        n5Var.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.aa, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        n5Var.addView(imageView, k7.c6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        ImageView imageView2 = new ImageView(context);
        n5Var.b = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ba, g6Var), mode));
        n5Var.addView(imageView2, k7.c6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        TextView textView = new TextView(context);
        n5Var.c = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.ca, g6Var, textView, 1, 12.0f);
        textView.setGravity(17);
        n5Var.addView(textView, k7.c6.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
        n5Var.d = AndroidUtilities.dp(80.0f);
        return new fl0(n5Var);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        if (m1Var.a instanceof org.telegram.ui.Cells.m5) {
            this.v.N.f();
        }
    }
}
