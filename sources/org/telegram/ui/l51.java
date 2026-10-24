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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class l51 extends org.telegram.ui.Components.lm0 {
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

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z10) {
        b61 b61Var = this.s;
        int i10 = b61Var.W;
        boolean z11 = b61Var.I;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = b61Var.B1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < b61Var.B1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, b61Var.B1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = b61Var.C1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < b61Var.C1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, b61Var.C1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = b61Var.D1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < b61Var.D1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, b61Var.D1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = b61Var.E1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        l();
        if (b61Var.z1 && this.n == 0) {
            z12 = true;
        }
        if (b61Var.H1 == z12) {
            return;
        }
        b61Var.H1 = z12;
        ValueAnimator valueAnimator = b61Var.I1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        b61Var.I1 = ofFloat;
        ofFloat.addUpdateListener(new g41(b61Var, z12, i11));
        b61Var.I1.addListener(new u41(b61Var, z12, i11));
        b61Var.I1.setInterpolator(org.telegram.ui.Components.bs.h);
        b61Var.I1.setDuration(100L);
        b61Var.I1.start();
        if (z12) {
            b61.D(b61Var.V, b61Var.l0);
        }
    }

    @Override // s4.g0
    public final int h() {
        return this.n;
    }

    @Override // s4.g0
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f) {
            return 6;
        }
        b61 b61Var = this.s;
        if (b61Var.W == 14) {
            ArrayList arrayList = b61Var.C1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < b61Var.D1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = b61Var.B1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (b61Var.W == 13 || ((ah.i1) b61Var.B1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= b61Var.E1.size()) {
            return 4;
        }
        return b61Var.E1.get(i10 - this.h) instanceof y51 ? 6 : 3;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        ah.i1 i1Var;
        int cacheType2;
        int i13;
        int indexOf;
        b61 b61Var = this.s;
        HashSet hashSet = b61Var.K;
        int i14 = b61Var.W;
        int i15 = b61Var.V;
        o41 o41Var = b61Var.i0;
        int i16 = b1Var.f;
        View view = b1Var.a;
        if (i16 == 6) {
            g51 g51Var = (g51) view;
            ArrayList arrayList = b61Var.E1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) b61Var.E1.get(i10 - this.h);
                if (document2 instanceof y51) {
                    CharSequence charSequence = ((y51) document2).a;
                    String str = b61Var.A1;
                    g51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ue, g51Var.f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    g51Var.a.setText(charSequence);
                    g51Var.b(false);
                }
            } else if (i10 == this.e) {
                g51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                g51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                g51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            g51Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) b61Var.D1.get((i10 - this.c) - 1);
            k51 k51Var = (k51) view;
            k51Var.a(o41Var);
            k51Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.k6.m6, 0.2f), 0L, "tgs", document3, 0);
            k51Var.Q = true;
            k51Var.d = document3;
            k51Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                k51 k51Var2 = (k51) view;
                k51Var2.a = false;
                k51Var2.c = i10;
                k51Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                k51Var2.setDrawable(null);
                ArrayList arrayList2 = b61Var.B1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = b61Var.E1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) b61Var.E1.get(i10 - this.h);
                        if (!(document instanceof y51)) {
                            l4 = null;
                        }
                    }
                    document = null;
                    l4 = null;
                } else {
                    ah.i1 i1Var2 = (ah.i1) b61Var.B1.get(i10);
                    k51Var2.x = i1Var2;
                    long j10 = i1Var2.g;
                    if (j10 == 0) {
                        boolean contains2 = b61Var.J.contains(i1Var2);
                        k51Var2.y = true;
                        k51Var2.setDrawable(Emoji.getEmojiDrawable(i1Var2.f));
                        k51Var2.d(contains2, false);
                        return;
                    }
                    l4 = Long.valueOf(j10);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && i1Var2.b && i1Var2.d) {
                        k51Var2.b();
                        k51Var2.J.setVisibility(0);
                    } else {
                        j51 j51Var = k51Var2.J;
                        if (j51Var != null) {
                            j51Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l4 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        k51Var2.e = new org.telegram.ui.Components.a6(document, (Paint.FontMetricsInt) null);
                        k51Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(l4.longValue(), (Paint.FontMetricsInt) null);
                        k51Var2.e = a6Var;
                        k51Var2.d = a6Var.document;
                        contains = hashSet.contains(l4);
                    }
                    org.telegram.ui.Components.r5 r5Var = (org.telegram.ui.Components.r5) o41Var.e3.get(k51Var2.e.getDocumentId());
                    if (r5Var == null) {
                        cacheType = b61Var.getCacheType();
                        r5Var = org.telegram.ui.Components.r5.n(i15, k51Var2.e.getDocumentId(), null, cacheType);
                        o41Var.e3.put(k51Var2.e.getDocumentId(), r5Var);
                    }
                    k51Var2.setDrawable(r5Var);
                }
                k51Var2.d(contains, false);
                return;
            }
            return;
        }
        k51 k51Var3 = (k51) view;
        k51Var3.c = i10;
        ImageReceiver imageReceiver = k51Var3.n;
        ArrayList arrayList4 = b61Var.B1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = b61Var.C1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                i1Var = (ah.i1) b61Var.C1.get(i10 - this.c);
            }
        } else {
            i1Var = (ah.i1) b61Var.B1.get(i10);
        }
        if (k51Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(k51Var3);
            k51Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            k51Var3.h.onAttachedToWindow();
        }
        k51Var3.h.setParentView(o41Var);
        k51Var3.x = i1Var;
        k51Var3.y = false;
        k51Var3.d(b61Var.J.contains(i1Var), false);
        k51Var3.b = false;
        k51Var3.invalidate();
        if (i14 == 13) {
            k51Var3.setDrawable(Emoji.getEmojiDrawable(i1Var.f));
        } else if (i1Var.b || i1Var.f == null) {
            k51Var3.s = false;
            k51Var3.e = new org.telegram.ui.Components.a6(i1Var.g, (Paint.FontMetricsInt) null);
            k51Var3.d = null;
            k51Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.r5 r5Var2 = (org.telegram.ui.Components.r5) o41Var.e3.get(k51Var3.e.getDocumentId());
            if (r5Var2 == null) {
                cacheType2 = b61Var.getCacheType();
                r5Var2 = org.telegram.ui.Components.r5.n(i15, k51Var3.e.getDocumentId(), null, cacheType2);
                o41Var.e3.put(k51Var3.e.getDocumentId(), r5Var2);
            }
            k51Var3.setDrawable(r5Var2);
        } else {
            k51Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(i1Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.k6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    ah.i1 i1Var3 = i1Var;
                    k51Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", i1Var3, 0);
                    i1Var = i1Var3;
                } else {
                    k51Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
            } else {
                k51Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            k51Var3.e = null;
            k51Var3.d = null;
            k51Var3.setDrawable(null);
            j51 j51Var2 = k51Var3.J;
            if (j51Var2 != null) {
                j51Var2.setVisibility(8);
                k51Var3.J.setImageReceiver(null);
            }
            if (tL_availableReaction == null && i1Var.b) {
                k51Var3.setDrawable(Emoji.getEmojiDrawable(i1Var.f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && i1Var.b && i1Var.d) {
            k51Var3.b();
            k51Var3.J.setVisibility(0);
            k51Var3.setEmojicon(null);
            return;
        }
        if (i1Var.e) {
            k51Var3.setEmojicon(i1Var.f);
        } else {
            k51Var3.setEmojicon(null);
        }
        j51 j51Var3 = k51Var3.J;
        if (j51Var3 != null) {
            j51Var3.setVisibility(4);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View k51Var;
        b61 b61Var = this.s;
        if (i10 == 6) {
            k51Var = new g51(b61Var, b61Var.getContext(), b61Var.W == 6);
        } else if (i10 == 7) {
            k51Var = new org.telegram.ui.Components.un(b61Var.getContext(), 25);
            k51Var.setTag("searchbox");
        } else {
            k51Var = new k51(b61Var, b61Var.getContext());
        }
        if (b61.c(b61Var)) {
            k51Var.setScaleX(0.0f);
            k51Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.wl0(k51Var);
    }
}
