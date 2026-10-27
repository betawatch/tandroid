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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tm extends ul0 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final /* synthetic */ ChatAttachAlertPhotoLayout v;

    public tm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean E(nm0 nm0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.r1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        return !(isEmpty && ((albumEntry = chatAttachAlertPhotoLayout.T0) == null || albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.b.R && h() > 30;
    }

    @Override // org.telegram.ui.Components.ul0
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
                M = (MediaController.PhotoEntry) ic.a.g(1, chatAttachAlertPhotoLayout.T0.photos);
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

    @Override // org.telegram.ui.Components.ul0
    public final void G(nm0 nm0Var, float f7, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = nm0Var.getChildAt(0).getMeasuredHeight();
        float h = h();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h / chatAttachAlertPhotoLayout.M0) * measuredHeight)) - (nm0Var.getMeasuredHeight() - currentActionBarHeight)) * f7;
        float f10 = measuredHeight;
        iArr[0] = ((int) (ceil / f10)) * chatAttachAlertPhotoLayout.M0;
        int paddingTop = nm0Var.getPaddingTop() + ((int) (ceil % f10)) + ((int) ((1.0f - f7) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
            return;
        }
        iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
    }

    @Override // org.telegram.ui.Components.ul0
    public final float H(nm0 nm0Var) {
        int i10 = this.v.M0;
        int ceil = (int) Math.ceil(this.n / i10);
        if (nm0Var.getChildCount() != 0) {
            int measuredHeight = nm0Var.getChildAt(0).getMeasuredHeight();
            if (RecyclerView.R(nm0Var.getChildAt(0)) >= 0) {
                return Utilities.clamp((((r5 / i10) * measuredHeight) - r2.getTop()) / ((ceil * measuredHeight) - (nm0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void J(nm0 nm0Var) {
        this.s = false;
        int childCount = nm0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            nm0Var.getChildAt(i10).invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ul0
    public final void K() {
        this.s = true;
    }

    public final wl0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.G) {
            x5Var.setOutlineProvider(new rm(this));
            x5Var.setClipToOutline(true);
        }
        x5Var.setFastScrollDelegate(new s(this, 22));
        x5Var.setDelegate(new p1(14, this, x5Var));
        return new wl0(x5Var);
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
        return chatAttachAlertPhotoLayout.c0(i10);
    }

    @Override // s4.h0
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        tm tmVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.v0) {
            return 1;
        }
        int i10 = 0;
        this.e = false;
        this.f = false;
        boolean z10 = chatAttachAlertPhotoLayout.P0;
        if (z10 && this == tmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            this.e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.g1) {
            i10++;
        }
        if (z10 && this == tmVar) {
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
        if (this == tmVar) {
            i10++;
        }
        this.n = i10;
        return i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        tm tmVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.v0) {
            return 2;
        }
        boolean z10 = chatAttachAlertPhotoLayout.P0;
        if (z10 && this == tmVar) {
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
        if (this == tmVar && i10 == this.n - 1) {
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
    public final void v(s4.e1 e1Var, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        int i11 = e1Var.f;
        View view = e1Var.a;
        boolean z10 = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.q5) view).setItemSize(chatAttachAlertPhotoLayout.K0);
                return;
            }
            if (i11 != 3) {
                if (i11 != 7) {
                    return;
                }
                ((r20) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.g1);
                return;
            } else {
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                r5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
                r5Var.setType((z10 && chatAttachAlertPhotoLayout.O0 && i10 == 0) ? 0 : 1);
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
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
        if (this == chatAttachAlertPhotoLayout.G) {
            x5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
        } else {
            x5Var.setIsVertical(chatAttachAlertPhotoLayout.s.o == 1);
        }
        if (tiVar.T0 != 0 || tiVar.W0 || tiVar.H) {
            x5Var.getCheckBox().setVisibility(8);
        } else {
            x5Var.getCheckBox().setVisibility(0);
        }
        MediaController.PhotoEntry c02 = chatAttachAlertPhotoLayout.c0(i10);
        if (c02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        x5Var.d(c02, hashMap.size() > 1, z10 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, i10 == h() - 1, tiVar != null && tiVar.i0);
        if ((tiVar.f0 instanceof org.telegram.ui.wn) && tiVar.W1) {
            x5Var.b(ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(c02.imageId)), hashMap.containsKey(Integer.valueOf(c02.imageId)), false);
        } else {
            x5Var.b(-1, hashMap.containsKey(Integer.valueOf(c02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.w0 && c02.isVideo) {
            x5Var.setAlpha(0.3f);
        } else if (chatAttachAlertPhotoLayout.x0 || c02.isVideo) {
            x5Var.setAlpha(1.0f);
        } else {
            x5Var.setAlpha(0.3f);
        }
        x5Var.getImageView().setTag(Integer.valueOf(i10));
        x5Var.setTag(Integer.valueOf(i10));
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.u6 u6Var = chatAttachAlertPhotoLayout.a;
        if (i10 == 0) {
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                return L();
            }
            wl0 wl0Var = (wl0) arrayList.get(0);
            arrayList.remove(0);
            return wl0Var;
        }
        Context context = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(context);
            q5Var.setFocusable(true);
            q5Var.a = AndroidUtilities.dp(0.0f);
            return new wl0(q5Var);
        }
        if (i10 == 2) {
            return new wl0(new bi.cc(this, context, 13));
        }
        if (i10 == 4) {
            tiVar.getClass();
            return new wl0(new sm(this, context));
        }
        if (i10 == 5) {
            return new wl0(new View(context));
        }
        if (i10 == 7) {
            r20 r20Var = new r20(context, tiVar.M1);
            r20Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(400.0f)));
            r20Var.setGravity(17);
            r20Var.isClickable();
            r20Var.b.setOnClickListener(new f0(new xl(chatAttachAlertPhotoLayout, 5), 17));
            r20Var.a.setOnClickListener(new f0(new xl(chatAttachAlertPhotoLayout, 6), 18));
            r20Var.c.setOnClickListener(new ga(17, r20Var, new b3(this, 2)));
            return new wl0(r20Var);
        }
        if (i10 == 8) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
            fi.d dVar = new fi.d(context, u6Var, true);
            dVar.setUseWrapContent(true);
            dVar.f();
            dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new zq(R.drawable.camera, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
            dVar.i(spannableStringBuilder, false, true);
            frameLayout.addView(dVar, kb1.h(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new wl0(frameLayout);
        }
        org.telegram.ui.Cells.r5 r5Var = new org.telegram.ui.Cells.r5(context);
        ImageView imageView = new ImageView(context);
        r5Var.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i11 = org.telegram.ui.ActionBar.y6.aa;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, mode);
        r5Var.addView(imageView, kb1.h(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        ImageView imageView2 = new ImageView(context);
        r5Var.b = imageView2;
        imageView2.setScaleType(scaleType);
        org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.ba, u6Var, mode);
        r5Var.addView(imageView2, kb1.h(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        TextView textView = new TextView(context);
        r5Var.c = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.ca, u6Var);
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        r5Var.addView(textView, kb1.h(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
        r5Var.d = AndroidUtilities.dp(80.0f);
        return new wl0(r5Var);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        if (e1Var.a instanceof org.telegram.ui.Cells.q5) {
            this.v.Q.i();
        }
    }
}
