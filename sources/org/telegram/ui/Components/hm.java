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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class hm extends tk0 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final /* synthetic */ ChatAttachAlertPhotoLayout v;

    public hm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean E(ll0 ll0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.r1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        return !(isEmpty && ((albumEntry = chatAttachAlertPhotoLayout.T0) == null || albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.b.R && h() > 30;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i10);
        if (M == null) {
            int i11 = this.r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.r1;
                if (arrayList2.isEmpty()) {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        M = arrayList.get(0);
                    }
                } else {
                    M = (MediaController.PhotoEntry) arrayList2.get(0);
                }
            } else if (!chatAttachAlertPhotoLayout.T0.photos.isEmpty()) {
                M = (MediaController.PhotoEntry) i2.g.h(1, chatAttachAlertPhotoLayout.T0.photos);
            }
        }
        if (M == null) {
            return "";
        }
        long j3 = M.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return LocaleController.formatYearMont(j3, true);
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
        float h = h();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h / chatAttachAlertPhotoLayout.M0) * measuredHeight)) - (ll0Var.getMeasuredHeight() - currentActionBarHeight)) * f7;
        float f10 = measuredHeight;
        iArr[0] = ((int) (ceil / f10)) * chatAttachAlertPhotoLayout.M0;
        int paddingTop = ll0Var.getPaddingTop() + ((int) (ceil % f10)) + ((int) ((1.0f - f7) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
            return;
        }
        iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
    }

    @Override // org.telegram.ui.Components.tk0
    public final float H(ll0 ll0Var) {
        int i10 = this.v.M0;
        int ceil = (int) Math.ceil(this.n / i10);
        if (ll0Var.getChildCount() != 0) {
            int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
            if (RecyclerView.R(ll0Var.getChildAt(0)) >= 0) {
                return Utilities.clamp((((r5 / i10) * measuredHeight) - r2.getTop()) / ((ceil * measuredHeight) - (ll0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void J(ll0 ll0Var) {
        this.s = false;
        int childCount = ll0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ll0Var.getChildAt(i10).invalidate();
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final void K() {
        this.s = true;
    }

    public final vk0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.G) {
            s5Var.setOutlineProvider(new fm(this));
            s5Var.setClipToOutline(true);
        }
        s5Var.setFastScrollDelegate(new t(this, 22));
        s5Var.setDelegate(new b3(5, this, s5Var));
        return new vk0(s5Var);
    }

    public final MediaController.PhotoEntry M(int i10) {
        boolean z10 = this.f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z10 && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.q1;
        return chatAttachAlertPhotoLayout.b0(i10);
    }

    @Override // s4.h0
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        hm hmVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.v0) {
            return 1;
        }
        int i10 = 0;
        this.e = false;
        this.f = false;
        boolean z10 = chatAttachAlertPhotoLayout.P0;
        if (z10 && this == hmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            this.e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.g1) {
            i10++;
        }
        if (z10 && this == hmVar) {
            i10++;
        }
        this.r = i10;
        if (!z10) {
            i10 += ChatAttachAlertPhotoLayout.r1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
            if (albumEntry != null) {
                i10 += albumEntry.photos.size();
            }
        }
        if (this.e && i10 > chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.O0) {
            this.f = true;
            i10++;
        }
        if (this == hmVar) {
            i10++;
        }
        this.n = i10;
        return i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        hm hmVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.v0) {
            return 2;
        }
        boolean z10 = chatAttachAlertPhotoLayout.P0;
        if (z10 && this == hmVar) {
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
        if (this == hmVar && i10 == this.n - 1) {
            return 2;
        }
        return z10 ? 3 : 0;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (this == chatAttachAlertPhotoLayout.G) {
            chatAttachAlertPhotoLayout.H.setVisibility((!(h() == 1 && !chatAttachAlertPhotoLayout.P0 && chatAttachAlertPhotoLayout.T0 == null) && chatAttachAlertPhotoLayout.v0) ? 4 : 0);
        }
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        vi viVar = chatAttachAlertPhotoLayout.b;
        int i11 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.l5) view).setItemSize(chatAttachAlertPhotoLayout.K0);
                return;
            }
            if (i11 != 3) {
                if (i11 != 7) {
                    return;
                }
                ((g20) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.g1);
                return;
            } else {
                org.telegram.ui.Cells.m5 m5Var = (org.telegram.ui.Cells.m5) view;
                m5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
                m5Var.setType((z10 && chatAttachAlertPhotoLayout.O0 && i10 == 0) ? 0 : 1);
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
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        if (this == chatAttachAlertPhotoLayout.G) {
            s5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
        } else {
            s5Var.setIsVertical(chatAttachAlertPhotoLayout.s.o == 1);
        }
        if (viVar.Q0 != 0 || viVar.T0 || viVar.H) {
            s5Var.getCheckBox().setVisibility(8);
        } else {
            s5Var.getCheckBox().setVisibility(0);
        }
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        s5Var.d(b02, hashMap.size() > 1, z10 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, i10 == h() - 1, viVar != null && viVar.i0);
        if ((viVar.f0 instanceof org.telegram.ui.co) && viVar.T1) {
            s5Var.b(ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(b02.imageId)), hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        } else {
            s5Var.b(-1, hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.w0 && b02.isVideo) {
            s5Var.setAlpha(0.3f);
        } else if (chatAttachAlertPhotoLayout.x0 || b02.isVideo) {
            s5Var.setAlpha(1.0f);
        } else {
            s5Var.setAlpha(0.3f);
        }
        s5Var.getImageView().setTag(Integer.valueOf(i10));
        s5Var.setTag(Integer.valueOf(i10));
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        vi viVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.f6 f6Var = chatAttachAlertPhotoLayout.a;
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
            org.telegram.ui.Cells.l5 l5Var = new org.telegram.ui.Cells.l5(context);
            l5Var.setFocusable(true);
            l5Var.a = AndroidUtilities.dp(0.0f);
            return new vk0(l5Var);
        }
        if (i10 == 2) {
            return new vk0(new di.eb(this, context, 13));
        }
        if (i10 == 4) {
            viVar.getClass();
            return new vk0(new gm(this, context));
        }
        if (i10 == 5) {
            return new vk0(new View(context));
        }
        if (i10 == 7) {
            g20 g20Var = new g20(context, viVar.J1);
            g20Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(400.0f)));
            g20Var.setGravity(17);
            g20Var.isClickable();
            g20Var.b.setOnClickListener(new g0(new ll(chatAttachAlertPhotoLayout, 5), 18));
            g20Var.a.setOnClickListener(new g0(new ll(chatAttachAlertPhotoLayout, 6), 19));
            g20Var.c.setOnClickListener(new ct(5, g20Var, new y2(this, 2)));
            return new vk0(g20Var);
        }
        if (i10 == 8) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
            di.d dVar = new di.d(context, f6Var, true);
            dVar.setUseWrapContent(true);
            dVar.e();
            dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new nq(R.drawable.camera, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
            dVar.g(spannableStringBuilder, false, true);
            frameLayout.addView(dVar, w7.x5.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new vk0(frameLayout);
        }
        org.telegram.ui.Cells.m5 m5Var = new org.telegram.ui.Cells.m5(context);
        ImageView imageView = new ImageView(context);
        m5Var.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.aa, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        m5Var.addView(imageView, w7.x5.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        ImageView imageView2 = new ImageView(context);
        m5Var.b = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ba, f6Var), mode));
        m5Var.addView(imageView2, w7.x5.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        TextView textView = new TextView(context);
        m5Var.c = textView;
        org.telegram.messenger.wl.n(org.telegram.ui.ActionBar.j6.ca, f6Var, textView, 1, 12.0f);
        textView.setGravity(17);
        m5Var.addView(textView, w7.x5.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
        m5Var.d = AndroidUtilities.dp(80.0f);
        return new vk0(m5Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        if (c1Var.a instanceof org.telegram.ui.Cells.l5) {
            this.v.Q.g();
        }
    }
}
