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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g61 extends org.telegram.ui.Components.rl0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ w61 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public g61(w61 w61Var) {
        this.s = w61Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z4) {
        w61 w61Var = this.s;
        int i10 = w61Var.T;
        boolean z10 = w61Var.F;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z11 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = w61Var.x1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < w61Var.x1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, w61Var.x1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = w61Var.y1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < w61Var.y1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, w61Var.y1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = w61Var.z1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < w61Var.z1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, w61Var.z1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = w61Var.A1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        l();
        if (w61Var.v1 && this.n == 0) {
            z11 = true;
        }
        if (w61Var.D1 == z11) {
            return;
        }
        w61Var.D1 = z11;
        ValueAnimator valueAnimator = w61Var.E1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        w61Var.E1 = ofFloat;
        ofFloat.addUpdateListener(new b51(w61Var, z11, i11));
        w61Var.E1.addListener(new p51(w61Var, z11, i11));
        w61Var.E1.setInterpolator(org.telegram.ui.Components.pr.h);
        w61Var.E1.setDuration(100L);
        w61Var.E1.start();
        if (z11) {
            w61.D(w61Var.S, w61Var.i0);
        }
    }

    @Override // f2.p0
    public final int h() {
        return this.n;
    }

    @Override // f2.p0
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f) {
            return 6;
        }
        w61 w61Var = this.s;
        if (w61Var.T == 14) {
            ArrayList arrayList = w61Var.y1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < w61Var.z1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = w61Var.x1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (w61Var.T == 13 || ((ng.q0) w61Var.x1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= w61Var.A1.size()) {
            return 4;
        }
        return w61Var.A1.get(i10 - this.h) instanceof t61 ? 6 : 3;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.Document document;
        Long l10;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        ng.q0 q0Var;
        int cacheType2;
        int i13;
        int indexOf;
        w61 w61Var = this.s;
        HashSet hashSet = w61Var.H;
        int i14 = w61Var.T;
        int i15 = w61Var.S;
        i51 i51Var = w61Var.f0;
        int i16 = m1Var.f;
        View view = m1Var.a;
        if (i16 == 6) {
            b61 b61Var = (b61) view;
            ArrayList arrayList = w61Var.A1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) w61Var.A1.get(i10 - this.h);
                if (document2 instanceof t61) {
                    CharSequence charSequence = ((t61) document2).a;
                    String str = w61Var.w1;
                    b61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ue, b61Var.f.W0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    b61Var.a.setText(charSequence);
                    b61Var.b(false);
                }
            } else if (i10 == this.e) {
                b61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                b61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                b61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            b61Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) w61Var.z1.get((i10 - this.c) - 1);
            f61 f61Var = (f61) view;
            f61Var.a(i51Var);
            f61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.k6.m6, 0.2f), 0L, "tgs", document3, 0);
            f61Var.N = true;
            f61Var.d = document3;
            f61Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                f61 f61Var2 = (f61) view;
                f61Var2.a = false;
                f61Var2.c = i10;
                f61Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                f61Var2.setDrawable(null);
                ArrayList arrayList2 = w61Var.x1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = w61Var.A1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) w61Var.A1.get(i10 - this.h);
                        if (!(document instanceof t61)) {
                            l10 = null;
                        }
                    }
                    document = null;
                    l10 = null;
                } else {
                    ng.q0 q0Var2 = (ng.q0) w61Var.x1.get(i10);
                    f61Var2.x = q0Var2;
                    long j10 = q0Var2.g;
                    if (j10 == 0) {
                        boolean contains2 = w61Var.G.contains(q0Var2);
                        f61Var2.y = true;
                        f61Var2.setDrawable(Emoji.getEmojiDrawable(q0Var2.f));
                        f61Var2.d(contains2, false);
                        return;
                    }
                    l10 = Long.valueOf(j10);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && q0Var2.b && q0Var2.d) {
                        f61Var2.b();
                        f61Var2.G.setVisibility(0);
                    } else {
                        e61 e61Var = f61Var2.G;
                        if (e61Var != null) {
                            e61Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l10 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        f61Var2.e = new org.telegram.ui.Components.u5(document, (Paint.FontMetricsInt) null);
                        f61Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(l10.longValue(), (Paint.FontMetricsInt) null);
                        f61Var2.e = u5Var;
                        f61Var2.d = u5Var.document;
                        contains = hashSet.contains(l10);
                    }
                    org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) i51Var.a3.get(f61Var2.e.getDocumentId());
                    if (l5Var == null) {
                        cacheType = w61Var.getCacheType();
                        l5Var = org.telegram.ui.Components.l5.n(i15, f61Var2.e.getDocumentId(), null, cacheType);
                        i51Var.a3.put(f61Var2.e.getDocumentId(), l5Var);
                    }
                    f61Var2.setDrawable(l5Var);
                }
                f61Var2.d(contains, false);
                return;
            }
            return;
        }
        f61 f61Var3 = (f61) view;
        f61Var3.c = i10;
        ImageReceiver imageReceiver = f61Var3.n;
        ArrayList arrayList4 = w61Var.x1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = w61Var.y1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                q0Var = (ng.q0) w61Var.y1.get(i10 - this.c);
            }
        } else {
            q0Var = (ng.q0) w61Var.x1.get(i10);
        }
        if (f61Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(f61Var3);
            f61Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            f61Var3.h.onAttachedToWindow();
        }
        f61Var3.h.setParentView(i51Var);
        f61Var3.x = q0Var;
        f61Var3.y = false;
        f61Var3.d(w61Var.G.contains(q0Var), false);
        f61Var3.b = false;
        f61Var3.invalidate();
        if (i14 == 13) {
            f61Var3.setDrawable(Emoji.getEmojiDrawable(q0Var.f));
        } else if (q0Var.b || q0Var.f == null) {
            f61Var3.s = false;
            f61Var3.e = new org.telegram.ui.Components.u5(q0Var.g, (Paint.FontMetricsInt) null);
            f61Var3.d = null;
            f61Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.l5 l5Var2 = (org.telegram.ui.Components.l5) i51Var.a3.get(f61Var3.e.getDocumentId());
            if (l5Var2 == null) {
                cacheType2 = w61Var.getCacheType();
                l5Var2 = org.telegram.ui.Components.l5.n(i15, f61Var3.e.getDocumentId(), null, cacheType2);
                i51Var.a3.put(f61Var3.e.getDocumentId(), l5Var2);
            }
            f61Var3.setDrawable(l5Var2);
        } else {
            f61Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(q0Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.k6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    ng.q0 q0Var3 = q0Var;
                    f61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var3, 0);
                    q0Var = q0Var3;
                } else {
                    f61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ng.m0.a());
            } else {
                f61Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            f61Var3.e = null;
            f61Var3.d = null;
            f61Var3.setDrawable(null);
            e61 e61Var2 = f61Var3.G;
            if (e61Var2 != null) {
                e61Var2.setVisibility(8);
                f61Var3.G.setImageReceiver(null);
            }
            if (tL_availableReaction == null && q0Var.b) {
                f61Var3.setDrawable(Emoji.getEmojiDrawable(q0Var.f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && q0Var.b && q0Var.d) {
            f61Var3.b();
            f61Var3.G.setVisibility(0);
            f61Var3.setEmojicon(null);
            return;
        }
        if (q0Var.e) {
            f61Var3.setEmojicon(q0Var.f);
        } else {
            f61Var3.setEmojicon(null);
        }
        e61 e61Var3 = f61Var3.G;
        if (e61Var3 != null) {
            e61Var3.setVisibility(4);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View f61Var;
        w61 w61Var = this.s;
        if (i10 == 6) {
            f61Var = new b61(w61Var, w61Var.getContext(), w61Var.T == 6);
        } else if (i10 == 7) {
            f61Var = new org.telegram.ui.Components.in(w61Var.getContext(), 22);
            f61Var.setTag("searchbox");
        } else {
            f61Var = new f61(w61Var, w61Var.getContext());
        }
        if (w61.c(w61Var)) {
            f61Var.setScaleX(0.0f);
            f61Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.el0(f61Var);
    }
}
