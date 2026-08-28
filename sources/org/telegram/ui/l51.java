package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l51 extends org.telegram.ui.Components.vk0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ b61 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public l51(b61 b61Var) {
        this.s = b61Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 3 || i9 == 4;
    }

    public final void E(boolean z10) {
        b61 b61Var = this.s;
        int i9 = b61Var.S;
        boolean z11 = b61Var.E;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = b61Var.w1;
        int i10 = 1;
        if (arrayList2 != null) {
            if (i9 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.n;
                this.n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i12 = 0; i12 < b61Var.w1.size(); i12++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, b61Var.w1.get(i12))));
            }
        }
        if (i9 == 14) {
            ArrayList arrayList3 = b61Var.x1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.n;
                this.n = i13 + 1;
                this.f = i13;
                arrayList.add(2);
                this.c = this.n;
                for (int i14 = 0; i14 < b61Var.x1.size(); i14++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, b61Var.x1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = b61Var.y1;
            if (arrayList4 != null) {
                if (i9 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.n;
                    this.n = i15 + 1;
                    this.f = i15;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i16 = 0; i16 < b61Var.y1.size(); i16++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, b61Var.y1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = b61Var.z1;
        if (arrayList5 != null) {
            int i17 = this.n;
            this.h = i17;
            this.n = arrayList5.size() + i17;
        }
        l();
        if (b61Var.u1 && this.n == 0) {
            z12 = true;
        }
        if (b61Var.C1 == z12) {
            return;
        }
        b61Var.C1 = z12;
        ValueAnimator valueAnimator = b61Var.D1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        b61Var.D1 = ofFloat;
        ofFloat.addUpdateListener(new i41(b61Var, z12, i10));
        b61Var.D1.addListener(new u41(b61Var, z12, i10));
        b61Var.D1.setInterpolator(org.telegram.ui.Components.gr.h);
        b61Var.D1.setDuration(100L);
        b61Var.D1.start();
        if (z12) {
            b61.D(b61Var.R, b61Var.h0);
        }
    }

    @Override // f2.r0
    public final int h() {
        return this.n;
    }

    @Override // f2.r0
    public final int j(int i9) {
        int i10;
        if (i9 == this.e || i9 == this.f) {
            return 6;
        }
        b61 b61Var = this.s;
        if (b61Var.S == 14) {
            ArrayList arrayList = b61Var.x1;
            if (arrayList != null && i9 >= (i10 = this.c) && i9 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i9 > this.c && (i9 - r2) - 1 < b61Var.y1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = b61Var.w1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i9 > this.d && (i9 - r5) - 1 < arrayList2.size() && (b61Var.S == 13 || ((hg.r0) b61Var.w1.get((i9 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i11 = this.h;
        if (i9 - i11 < 0 || i9 - i11 >= b61Var.z1.size()) {
            return 4;
        }
        return b61Var.z1.get(i9 - this.h) instanceof y51 ? 6 : 3;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.Document document;
        Long l10;
        int i10;
        boolean contains;
        int cacheType;
        int i11;
        hg.r0 r0Var;
        int cacheType2;
        int i12;
        int indexOf;
        b61 b61Var = this.s;
        HashSet hashSet = b61Var.G;
        int i13 = b61Var.S;
        int i14 = b61Var.R;
        o41 o41Var = b61Var.e0;
        int i15 = q1Var.f;
        View view = q1Var.a;
        if (i15 == 6) {
            g51 g51Var = (g51) view;
            ArrayList arrayList = b61Var.z1;
            if (arrayList != null && (i12 = i9 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) b61Var.z1.get(i9 - this.h);
                if (document2 instanceof y51) {
                    CharSequence charSequence = ((y51) document2).a;
                    String str = b61Var.v1;
                    g51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ue, g51Var.f.V0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    g51Var.a.setText(charSequence);
                    g51Var.b(false);
                }
            } else if (i9 == this.e) {
                g51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i13 == 14) {
                g51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                g51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            g51Var.c.setVisibility(8);
            return;
        }
        if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) b61Var.y1.get((i9 - this.c) - 1);
            k51 k51Var = (k51) view;
            k51Var.a(o41Var);
            k51Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.f6.m6, 0.2f), 0L, "tgs", document3, 0);
            k51Var.M = true;
            k51Var.d = document3;
            k51Var.e = null;
            return;
        }
        if (i15 != 4) {
            if (i15 == 3) {
                k51 k51Var2 = (k51) view;
                k51Var2.a = false;
                k51Var2.c = i9;
                k51Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                k51Var2.setDrawable(null);
                ArrayList arrayList2 = b61Var.w1;
                if (arrayList2 == null || i9 < 0 || i9 >= arrayList2.size()) {
                    ArrayList arrayList3 = b61Var.z1;
                    if (arrayList3 != null && (i10 = i9 - this.h) >= 0 && i10 < arrayList3.size()) {
                        document = (TLRPC.Document) b61Var.z1.get(i9 - this.h);
                        if (!(document instanceof y51)) {
                            l10 = null;
                        }
                    }
                    document = null;
                    l10 = null;
                } else {
                    hg.r0 r0Var2 = (hg.r0) b61Var.w1.get(i9);
                    k51Var2.x = r0Var2;
                    long j10 = r0Var2.g;
                    if (j10 == 0) {
                        boolean contains2 = b61Var.F.contains(r0Var2);
                        k51Var2.y = true;
                        k51Var2.setDrawable(Emoji.getEmojiDrawable(r0Var2.f));
                        k51Var2.d(contains2, false);
                        return;
                    }
                    l10 = Long.valueOf(j10);
                    if (i13 == 14 && !UserConfig.getInstance(i14).isPremium() && r0Var2.b && r0Var2.d) {
                        k51Var2.b();
                        k51Var2.F.setVisibility(0);
                    } else {
                        j51 j51Var = k51Var2.F;
                        if (j51Var != null) {
                            j51Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l10 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        k51Var2.e = new org.telegram.ui.Components.t5(document, (Paint.FontMetricsInt) null);
                        k51Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(l10.longValue(), (Paint.FontMetricsInt) null);
                        k51Var2.e = t5Var;
                        k51Var2.d = t5Var.document;
                        contains = hashSet.contains(l10);
                    }
                    org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) o41Var.Z2.get(k51Var2.e.getDocumentId());
                    if (k5Var == null) {
                        cacheType = b61Var.getCacheType();
                        k5Var = org.telegram.ui.Components.k5.n(i14, k51Var2.e.getDocumentId(), null, cacheType);
                        o41Var.Z2.put(k51Var2.e.getDocumentId(), k5Var);
                    }
                    k51Var2.setDrawable(k5Var);
                }
                k51Var2.d(contains, false);
                return;
            }
            return;
        }
        k51 k51Var3 = (k51) view;
        k51Var3.c = i9;
        ImageReceiver imageReceiver = k51Var3.n;
        ArrayList arrayList4 = b61Var.w1;
        if (arrayList4 == null || i9 < 0 || i9 >= arrayList4.size()) {
            ArrayList arrayList5 = b61Var.x1;
            if (arrayList5 == null || i9 < (i11 = this.c) || i9 - i11 >= arrayList5.size()) {
                return;
            } else {
                r0Var = (hg.r0) b61Var.x1.get(i9 - this.c);
            }
        } else {
            r0Var = (hg.r0) b61Var.w1.get(i9);
        }
        if (k51Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(k51Var3);
            k51Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            k51Var3.h.onAttachedToWindow();
        }
        k51Var3.h.setParentView(o41Var);
        k51Var3.x = r0Var;
        k51Var3.y = false;
        k51Var3.d(b61Var.F.contains(r0Var), false);
        k51Var3.b = false;
        k51Var3.invalidate();
        if (i13 == 13) {
            k51Var3.setDrawable(Emoji.getEmojiDrawable(r0Var.f));
        } else if (r0Var.b || r0Var.f == null) {
            k51Var3.s = false;
            k51Var3.e = new org.telegram.ui.Components.t5(r0Var.g, (Paint.FontMetricsInt) null);
            k51Var3.d = null;
            k51Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.k5 k5Var2 = (org.telegram.ui.Components.k5) o41Var.Z2.get(k51Var3.e.getDocumentId());
            if (k5Var2 == null) {
                cacheType2 = b61Var.getCacheType();
                k5Var2 = org.telegram.ui.Components.k5.n(i14, k51Var3.e.getDocumentId(), null, cacheType2);
                o41Var.Z2.put(k51Var3.e.getDocumentId(), k5Var2);
            }
            k51Var3.setDrawable(k5Var2);
        } else {
            k51Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i14).getReactionsMap().get(r0Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.f6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    hg.r0 r0Var3 = r0Var;
                    k51Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", r0Var3, 0);
                    r0Var = r0Var3;
                } else {
                    k51Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", r0Var, 0);
                }
                MediaDataController.getInstance(i14).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), hg.n0.a());
            } else {
                k51Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            k51Var3.e = null;
            k51Var3.d = null;
            k51Var3.setDrawable(null);
            j51 j51Var2 = k51Var3.F;
            if (j51Var2 != null) {
                j51Var2.setVisibility(8);
                k51Var3.F.setImageReceiver(null);
            }
            if (tL_availableReaction == null && r0Var.b) {
                k51Var3.setDrawable(Emoji.getEmojiDrawable(r0Var.f));
            }
        }
        if (!UserConfig.getInstance(i14).isPremium() && i13 == 14 && r0Var.b && r0Var.d) {
            k51Var3.b();
            k51Var3.F.setVisibility(0);
            k51Var3.setEmojicon(null);
            return;
        }
        if (r0Var.e) {
            k51Var3.setEmojicon(r0Var.f);
        } else {
            k51Var3.setEmojicon(null);
        }
        j51 j51Var3 = k51Var3.F;
        if (j51Var3 != null) {
            j51Var3.setVisibility(4);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View k51Var;
        b61 b61Var = this.s;
        if (i9 == 6) {
            k51Var = new g51(b61Var, b61Var.getContext(), b61Var.S == 6);
        } else if (i9 == 7) {
            k51Var = new org.telegram.ui.Components.an(b61Var.getContext(), 26);
            k51Var.setTag("searchbox");
        } else {
            k51Var = new k51(b61Var, b61Var.getContext());
        }
        if (b61.c(b61Var)) {
            k51Var.setScaleX(0.0f);
            k51Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.ik0(k51Var);
    }
}
