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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yl extends gk0 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final /* synthetic */ ChatAttachAlertPhotoLayout v;

    public yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.gk0
    public final boolean E(wk0 wk0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.n1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        return !(isEmpty && ((albumEntry = chatAttachAlertPhotoLayout.P0) == null || albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.b.N && h() > 30;
    }

    @Override // org.telegram.ui.Components.gk0
    public final String F(int i9) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i9);
        if (M == null) {
            int i10 = this.r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i9 <= i10) {
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
                M = (MediaController.PhotoEntry) j3.r0.j(1, chatAttachAlertPhotoLayout.P0.photos);
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

    @Override // org.telegram.ui.Components.gk0
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = wk0Var.getChildAt(0).getMeasuredHeight();
        float h = h();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h / chatAttachAlertPhotoLayout.I0) * measuredHeight)) - (wk0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (ceil / f11)) * chatAttachAlertPhotoLayout.I0;
        int paddingTop = wk0Var.getPaddingTop() + ((int) (ceil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
            return;
        }
        iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
    }

    @Override // org.telegram.ui.Components.gk0
    public final float H(wk0 wk0Var) {
        int i9 = this.v.I0;
        int ceil = (int) Math.ceil(this.n / i9);
        if (wk0Var.getChildCount() != 0) {
            int measuredHeight = wk0Var.getChildAt(0).getMeasuredHeight();
            if (RecyclerView.R(wk0Var.getChildAt(0)) >= 0) {
                return Utilities.clamp((((r5 / i9) * measuredHeight) - r2.getTop()) / ((ceil * measuredHeight) - (wk0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void J(wk0 wk0Var) {
        this.s = false;
        int childCount = wk0Var.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            wk0Var.getChildAt(i9).invalidate();
        }
    }

    @Override // org.telegram.ui.Components.gk0
    public final void K() {
        this.s = true;
    }

    public final ik0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.C) {
            t5Var.setOutlineProvider(new wl(this));
            t5Var.setClipToOutline(true);
        }
        t5Var.setFastScrollDelegate(new s(this, 22));
        t5Var.setDelegate(new g1(14, this, t5Var));
        return new ik0(t5Var);
    }

    public final MediaController.PhotoEntry M(int i9) {
        boolean z10 = this.f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z10 && i9 > chatAttachAlertPhotoLayout.I0) {
            i9--;
        }
        if (this.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            i9--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.m1;
        return chatAttachAlertPhotoLayout.a0(i9);
    }

    @Override // f2.r0
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        yl ylVar = chatAttachAlertPhotoLayout.C;
        if (!chatAttachAlertPhotoLayout.r0) {
            return 1;
        }
        int i9 = 0;
        this.e = false;
        this.f = false;
        boolean z10 = chatAttachAlertPhotoLayout.L0;
        if (z10 && this == ylVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            this.e = true;
            i9 = 1;
        }
        if (chatAttachAlertPhotoLayout.c1) {
            i9++;
        }
        if (z10 && this == ylVar) {
            i9++;
        }
        this.r = i9;
        if (!z10) {
            i9 += ChatAttachAlertPhotoLayout.n1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.P0;
            if (albumEntry != null) {
                i9 += albumEntry.photos.size();
            }
        }
        if (this.e && i9 > chatAttachAlertPhotoLayout.I0 && !chatAttachAlertPhotoLayout.K0) {
            this.f = true;
            i9++;
        }
        if (this == ylVar) {
            i9++;
        }
        this.n = i9;
        return i9;
    }

    @Override // f2.r0
    public final int j(int i9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        yl ylVar = chatAttachAlertPhotoLayout.C;
        if (!chatAttachAlertPhotoLayout.r0) {
            return 2;
        }
        boolean z10 = chatAttachAlertPhotoLayout.L0;
        if (z10 && this == ylVar) {
            return i9 == 0 ? 7 : 2;
        }
        boolean z11 = this.d;
        if (z11 && i9 == 0 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            return chatAttachAlertPhotoLayout.K0 ? 8 : 1;
        }
        boolean z12 = this.f;
        if (z12 && i9 == chatAttachAlertPhotoLayout.I0) {
            return 5;
        }
        int i10 = (!z12 || i9 <= chatAttachAlertPhotoLayout.I0) ? i9 : i9 - 1;
        if (z11) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.c1 && i10 == 0) {
            return 4;
        }
        if (this == ylVar && i9 == this.n - 1) {
            return 2;
        }
        return z10 ? 3 : 0;
    }

    @Override // f2.r0
    public final void l() {
        super.l();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (this == chatAttachAlertPhotoLayout.C) {
            chatAttachAlertPhotoLayout.D.setVisibility((!(h() == 1 && !chatAttachAlertPhotoLayout.L0 && chatAttachAlertPhotoLayout.P0 == null) && chatAttachAlertPhotoLayout.r0) ? 4 : 0);
        }
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        int i10 = q1Var.f;
        View view = q1Var.a;
        boolean z10 = this.d;
        if (i10 != 0) {
            if (i10 == 1) {
                ((org.telegram.ui.Cells.m5) view).setItemSize(chatAttachAlertPhotoLayout.G0);
                return;
            }
            if (i10 != 3) {
                if (i10 != 7) {
                    return;
                }
                ((r10) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.c1);
                return;
            } else {
                org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                n5Var.setItemSize(chatAttachAlertPhotoLayout.G0);
                n5Var.setType((z10 && chatAttachAlertPhotoLayout.K0 && i9 == 0) ? 0 : 1);
                return;
            }
        }
        if (this.f && i9 > chatAttachAlertPhotoLayout.I0) {
            i9--;
        }
        if (z10 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            i9--;
        }
        if (chatAttachAlertPhotoLayout.c1) {
            i9--;
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        if (this == chatAttachAlertPhotoLayout.C) {
            t5Var.setItemSize(chatAttachAlertPhotoLayout.G0);
        } else {
            t5Var.setIsVertical(chatAttachAlertPhotoLayout.s.o == 1);
        }
        if (kiVar.M0 != 0 || kiVar.P0 || kiVar.D) {
            t5Var.getCheckBox().setVisibility(8);
        } else {
            t5Var.getCheckBox().setVisibility(0);
        }
        MediaController.PhotoEntry a02 = chatAttachAlertPhotoLayout.a0(i9);
        if (a02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
        t5Var.d(a02, hashMap.size() > 1, z10 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0, i9 == h() - 1, kiVar != null && kiVar.e0);
        if ((kiVar.b0 instanceof org.telegram.ui.qn) && kiVar.P1) {
            t5Var.b(ChatAttachAlertPhotoLayout.p1.indexOf(Integer.valueOf(a02.imageId)), hashMap.containsKey(Integer.valueOf(a02.imageId)), false);
        } else {
            t5Var.b(-1, hashMap.containsKey(Integer.valueOf(a02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.s0 && a02.isVideo) {
            t5Var.setAlpha(0.3f);
        } else if (chatAttachAlertPhotoLayout.t0 || a02.isVideo) {
            t5Var.setAlpha(1.0f);
        } else {
            t5Var.setAlpha(0.3f);
        }
        t5Var.getImageView().setTag(Integer.valueOf(i9));
        t5Var.setTag(Integer.valueOf(i9));
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.b6 b6Var = chatAttachAlertPhotoLayout.a;
        if (i9 == 0) {
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                return L();
            }
            ik0 ik0Var = (ik0) arrayList.get(0);
            arrayList.remove(0);
            return ik0Var;
        }
        Context context = this.c;
        if (i9 == 1) {
            org.telegram.ui.Cells.m5 m5Var = new org.telegram.ui.Cells.m5(context);
            m5Var.setFocusable(true);
            m5Var.a = AndroidUtilities.dp(0.0f);
            return new ik0(m5Var);
        }
        if (i9 == 2) {
            return new ik0(new fh.l2(this, context, 12));
        }
        if (i9 == 4) {
            kiVar.getClass();
            return new ik0(new xl(this, context));
        }
        if (i9 == 5) {
            return new ik0(new View(context));
        }
        if (i9 == 7) {
            r10 r10Var = new r10(context, kiVar.F1);
            r10Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(400.0f)));
            r10Var.setGravity(17);
            r10Var.isClickable();
            r10Var.b.setOnClickListener(new f0(new cl(chatAttachAlertPhotoLayout, 5), 18));
            r10Var.a.setOnClickListener(new f0(new cl(chatAttachAlertPhotoLayout, 6), 19));
            r10Var.c.setOnClickListener(new s2(22, r10Var, new v2(this, 2)));
            return new ik0(r10Var);
        }
        if (i9 == 8) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
            kh.d dVar = new kh.d(context, b6Var, true);
            dVar.setUseWrapContent(true);
            dVar.e();
            dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new eq(R.drawable.camera, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
            dVar.g(spannableStringBuilder, false, true);
            frameLayout.addView(dVar, g7.e6.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new ik0(frameLayout);
        }
        org.telegram.ui.Cells.n5 n5Var = new org.telegram.ui.Cells.n5(context);
        ImageView imageView = new ImageView(context);
        n5Var.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.aa, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        n5Var.addView(imageView, g7.e6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        ImageView imageView2 = new ImageView(context);
        n5Var.b = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ba, b6Var), mode));
        n5Var.addView(imageView2, g7.e6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        TextView textView = new TextView(context);
        n5Var.c = textView;
        org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.ca, b6Var, textView, 1, 12.0f);
        textView.setGravity(17);
        n5Var.addView(textView, g7.e6.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
        n5Var.d = AndroidUtilities.dp(80.0f);
        return new ik0(n5Var);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        if (q1Var.a instanceof org.telegram.ui.Cells.m5) {
            this.v.M.f();
        }
    }
}
