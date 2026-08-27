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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ul extends jk0 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final /* synthetic */ ChatAttachAlertPhotoLayout v;

    public ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.jk0
    public final boolean E(zk0 zk0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.n1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        return !(isEmpty && ((albumEntry = chatAttachAlertPhotoLayout.P0) == null || albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.b.N && h() > 30;
    }

    @Override // org.telegram.ui.Components.jk0
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
                M = (MediaController.PhotoEntry) i0.a.i(1, chatAttachAlertPhotoLayout.P0.photos);
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

    @Override // org.telegram.ui.Components.jk0
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = zk0Var.getChildAt(0).getMeasuredHeight();
        float h = h();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h / chatAttachAlertPhotoLayout.I0) * measuredHeight)) - (zk0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (ceil / f11)) * chatAttachAlertPhotoLayout.I0;
        int paddingTop = zk0Var.getPaddingTop() + ((int) (ceil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
            return;
        }
        iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
    }

    @Override // org.telegram.ui.Components.jk0
    public final float H(zk0 zk0Var) {
        int i10 = this.v.I0;
        int ceil = (int) Math.ceil(this.n / i10);
        if (zk0Var.getChildCount() != 0) {
            int measuredHeight = zk0Var.getChildAt(0).getMeasuredHeight();
            if (RecyclerView.R(zk0Var.getChildAt(0)) >= 0) {
                return Utilities.clamp((((r5 / i10) * measuredHeight) - r2.getTop()) / ((ceil * measuredHeight) - (zk0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.jk0
    public final void J(zk0 zk0Var) {
        this.s = false;
        int childCount = zk0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            zk0Var.getChildAt(i10).invalidate();
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public final void K() {
        this.s = true;
    }

    public final lk0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.C) {
            q5Var.setOutlineProvider(new sl(this));
            q5Var.setClipToOutline(true);
        }
        q5Var.setFastScrollDelegate(new s(this, 22));
        q5Var.setDelegate(new g1(14, this, q5Var));
        return new lk0(q5Var);
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

    @Override // f2.q0
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ul ulVar = chatAttachAlertPhotoLayout.C;
        if (!chatAttachAlertPhotoLayout.r0) {
            return 1;
        }
        int i10 = 0;
        this.e = false;
        this.f = false;
        boolean z10 = chatAttachAlertPhotoLayout.L0;
        if (z10 && this == ulVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            this.e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.c1) {
            i10++;
        }
        if (z10 && this == ulVar) {
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
        if (this == ulVar) {
            i10++;
        }
        this.n = i10;
        return i10;
    }

    @Override // f2.q0
    public final int j(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ul ulVar = chatAttachAlertPhotoLayout.C;
        if (!chatAttachAlertPhotoLayout.r0) {
            return 2;
        }
        boolean z10 = chatAttachAlertPhotoLayout.L0;
        if (z10 && this == ulVar) {
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
        if (this == ulVar && i10 == this.n - 1) {
            return 2;
        }
        return z10 ? 3 : 0;
    }

    @Override // f2.q0
    public final void l() {
        super.l();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (this == chatAttachAlertPhotoLayout.C) {
            chatAttachAlertPhotoLayout.D.setVisibility((!(h() == 1 && !chatAttachAlertPhotoLayout.L0 && chatAttachAlertPhotoLayout.P0 == null) && chatAttachAlertPhotoLayout.r0) ? 4 : 0);
        }
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        gi giVar = chatAttachAlertPhotoLayout.b;
        int i11 = o1Var.f;
        View view = o1Var.a;
        boolean z10 = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.j5) view).setItemSize(chatAttachAlertPhotoLayout.G0);
                return;
            }
            if (i11 != 3) {
                if (i11 != 7) {
                    return;
                }
                ((u10) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.c1);
                return;
            } else {
                org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) view;
                k5Var.setItemSize(chatAttachAlertPhotoLayout.G0);
                k5Var.setType((z10 && chatAttachAlertPhotoLayout.K0 && i10 == 0) ? 0 : 1);
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
        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
        if (this == chatAttachAlertPhotoLayout.C) {
            q5Var.setItemSize(chatAttachAlertPhotoLayout.G0);
        } else {
            q5Var.setIsVertical(chatAttachAlertPhotoLayout.s.o == 1);
        }
        if (giVar.M0 != 0 || giVar.P0 || giVar.D) {
            q5Var.getCheckBox().setVisibility(8);
        } else {
            q5Var.getCheckBox().setVisibility(0);
        }
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
        q5Var.d(b02, hashMap.size() > 1, z10 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0, i10 == h() - 1, giVar != null && giVar.e0);
        if ((giVar.b0 instanceof org.telegram.ui.rn) && giVar.P1) {
            q5Var.b(ChatAttachAlertPhotoLayout.p1.indexOf(Integer.valueOf(b02.imageId)), hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        } else {
            q5Var.b(-1, hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.s0 && b02.isVideo) {
            q5Var.setAlpha(0.3f);
        } else if (chatAttachAlertPhotoLayout.t0 || b02.isVideo) {
            q5Var.setAlpha(1.0f);
        } else {
            q5Var.setAlpha(0.3f);
        }
        q5Var.getImageView().setTag(Integer.valueOf(i10));
        q5Var.setTag(Integer.valueOf(i10));
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        gi giVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.c6 c6Var = chatAttachAlertPhotoLayout.a;
        if (i10 == 0) {
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                return L();
            }
            lk0 lk0Var = (lk0) arrayList.get(0);
            arrayList.remove(0);
            return lk0Var;
        }
        Context context = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.j5 j5Var = new org.telegram.ui.Cells.j5(context);
            j5Var.setFocusable(true);
            j5Var.a = AndroidUtilities.dp(0.0f);
            return new lk0(j5Var);
        }
        if (i10 == 2) {
            return new lk0(new ag.s0(this, context, 12));
        }
        if (i10 == 4) {
            giVar.getClass();
            return new lk0(new tl(this, context));
        }
        if (i10 == 5) {
            return new lk0(new View(context));
        }
        if (i10 == 7) {
            u10 u10Var = new u10(context, giVar.F1);
            u10Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(400.0f)));
            u10Var.setGravity(17);
            u10Var.isClickable();
            u10Var.b.setOnClickListener(new f0(new yk(chatAttachAlertPhotoLayout, 5), 18));
            u10Var.a.setOnClickListener(new f0(new yk(chatAttachAlertPhotoLayout, 6), 19));
            u10Var.c.setOnClickListener(new q2(23, u10Var, new v2(this, 2)));
            return new lk0(u10Var);
        }
        if (i10 == 8) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
            lh.d dVar = new lh.d(context, c6Var, true);
            dVar.setUseWrapContent(true);
            dVar.e();
            dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new cq(R.drawable.camera, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
            dVar.g(spannableStringBuilder, false, true);
            frameLayout.addView(dVar, h7.z5.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new lk0(frameLayout);
        }
        org.telegram.ui.Cells.k5 k5Var = new org.telegram.ui.Cells.k5(context);
        ImageView imageView = new ImageView(context);
        k5Var.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.aa, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        k5Var.addView(imageView, h7.z5.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        ImageView imageView2 = new ImageView(context);
        k5Var.b = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ba, c6Var), mode));
        k5Var.addView(imageView2, h7.z5.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        TextView textView = new TextView(context);
        k5Var.c = textView;
        org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.ca, c6Var, textView, 1, 12.0f);
        textView.setGravity(17);
        k5Var.addView(textView, h7.z5.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
        k5Var.d = AndroidUtilities.dp(80.0f);
        return new lk0(k5Var);
    }

    @Override // f2.q0
    public final void y(f2.o1 o1Var) {
        if (o1Var.a instanceof org.telegram.ui.Cells.j5) {
            this.v.M.f();
        }
    }
}
