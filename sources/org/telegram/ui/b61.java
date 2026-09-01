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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class b61 extends org.telegram.ui.Components.sl0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ r61 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public b61(r61 r61Var) {
        this.s = r61Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z4) {
        r61 r61Var = this.s;
        int i10 = r61Var.T;
        boolean z10 = r61Var.F;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z11 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = r61Var.x1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < r61Var.x1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, r61Var.x1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = r61Var.y1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < r61Var.y1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, r61Var.y1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = r61Var.z1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < r61Var.z1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, r61Var.z1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = r61Var.A1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        l();
        if (r61Var.v1 && this.n == 0) {
            z11 = true;
        }
        if (r61Var.D1 == z11) {
            return;
        }
        r61Var.D1 = z11;
        ValueAnimator valueAnimator = r61Var.E1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        r61Var.E1 = ofFloat;
        ofFloat.addUpdateListener(new w41(r61Var, z11, i11));
        r61Var.E1.addListener(new k51(r61Var, z11, i11));
        r61Var.E1.setInterpolator(org.telegram.ui.Components.pr.h);
        r61Var.E1.setDuration(100L);
        r61Var.E1.start();
        if (z11) {
            r61.D(r61Var.S, r61Var.i0);
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
        r61 r61Var = this.s;
        if (r61Var.T == 14) {
            ArrayList arrayList = r61Var.y1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < r61Var.z1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = r61Var.x1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (r61Var.T == 13 || ((ng.q0) r61Var.x1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= r61Var.A1.size()) {
            return 4;
        }
        return r61Var.A1.get(i10 - this.h) instanceof o61 ? 6 : 3;
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
        r61 r61Var = this.s;
        HashSet hashSet = r61Var.H;
        int i14 = r61Var.T;
        int i15 = r61Var.S;
        d51 d51Var = r61Var.f0;
        int i16 = m1Var.f;
        View view = m1Var.a;
        if (i16 == 6) {
            w51 w51Var = (w51) view;
            ArrayList arrayList = r61Var.A1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) r61Var.A1.get(i10 - this.h);
                if (document2 instanceof o61) {
                    CharSequence charSequence = ((o61) document2).a;
                    String str = r61Var.w1;
                    w51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ue, w51Var.f.W0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    w51Var.a.setText(charSequence);
                    w51Var.b(false);
                }
            } else if (i10 == this.e) {
                w51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                w51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                w51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            w51Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) r61Var.z1.get((i10 - this.c) - 1);
            a61 a61Var = (a61) view;
            a61Var.a(d51Var);
            a61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.k6.m6, 0.2f), 0L, "tgs", document3, 0);
            a61Var.N = true;
            a61Var.d = document3;
            a61Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                a61 a61Var2 = (a61) view;
                a61Var2.a = false;
                a61Var2.c = i10;
                a61Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                a61Var2.setDrawable(null);
                ArrayList arrayList2 = r61Var.x1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = r61Var.A1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) r61Var.A1.get(i10 - this.h);
                        if (!(document instanceof o61)) {
                            l10 = null;
                        }
                    }
                    document = null;
                    l10 = null;
                } else {
                    ng.q0 q0Var2 = (ng.q0) r61Var.x1.get(i10);
                    a61Var2.x = q0Var2;
                    long j10 = q0Var2.g;
                    if (j10 == 0) {
                        boolean contains2 = r61Var.G.contains(q0Var2);
                        a61Var2.y = true;
                        a61Var2.setDrawable(Emoji.getEmojiDrawable(q0Var2.f));
                        a61Var2.d(contains2, false);
                        return;
                    }
                    l10 = Long.valueOf(j10);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && q0Var2.b && q0Var2.d) {
                        a61Var2.b();
                        a61Var2.G.setVisibility(0);
                    } else {
                        z51 z51Var = a61Var2.G;
                        if (z51Var != null) {
                            z51Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l10 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        a61Var2.e = new org.telegram.ui.Components.u5(document, (Paint.FontMetricsInt) null);
                        a61Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(l10.longValue(), (Paint.FontMetricsInt) null);
                        a61Var2.e = u5Var;
                        a61Var2.d = u5Var.document;
                        contains = hashSet.contains(l10);
                    }
                    org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) d51Var.a3.get(a61Var2.e.getDocumentId());
                    if (l5Var == null) {
                        cacheType = r61Var.getCacheType();
                        l5Var = org.telegram.ui.Components.l5.n(i15, a61Var2.e.getDocumentId(), null, cacheType);
                        d51Var.a3.put(a61Var2.e.getDocumentId(), l5Var);
                    }
                    a61Var2.setDrawable(l5Var);
                }
                a61Var2.d(contains, false);
                return;
            }
            return;
        }
        a61 a61Var3 = (a61) view;
        a61Var3.c = i10;
        ImageReceiver imageReceiver = a61Var3.n;
        ArrayList arrayList4 = r61Var.x1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = r61Var.y1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                q0Var = (ng.q0) r61Var.y1.get(i10 - this.c);
            }
        } else {
            q0Var = (ng.q0) r61Var.x1.get(i10);
        }
        if (a61Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(a61Var3);
            a61Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            a61Var3.h.onAttachedToWindow();
        }
        a61Var3.h.setParentView(d51Var);
        a61Var3.x = q0Var;
        a61Var3.y = false;
        a61Var3.d(r61Var.G.contains(q0Var), false);
        a61Var3.b = false;
        a61Var3.invalidate();
        if (i14 == 13) {
            a61Var3.setDrawable(Emoji.getEmojiDrawable(q0Var.f));
        } else if (q0Var.b || q0Var.f == null) {
            a61Var3.s = false;
            a61Var3.e = new org.telegram.ui.Components.u5(q0Var.g, (Paint.FontMetricsInt) null);
            a61Var3.d = null;
            a61Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.l5 l5Var2 = (org.telegram.ui.Components.l5) d51Var.a3.get(a61Var3.e.getDocumentId());
            if (l5Var2 == null) {
                cacheType2 = r61Var.getCacheType();
                l5Var2 = org.telegram.ui.Components.l5.n(i15, a61Var3.e.getDocumentId(), null, cacheType2);
                d51Var.a3.put(a61Var3.e.getDocumentId(), l5Var2);
            }
            a61Var3.setDrawable(l5Var2);
        } else {
            a61Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(q0Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.k6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    ng.q0 q0Var3 = q0Var;
                    a61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var3, 0);
                    q0Var = q0Var3;
                } else {
                    a61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ng.m0.a());
            } else {
                a61Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            a61Var3.e = null;
            a61Var3.d = null;
            a61Var3.setDrawable(null);
            z51 z51Var2 = a61Var3.G;
            if (z51Var2 != null) {
                z51Var2.setVisibility(8);
                a61Var3.G.setImageReceiver(null);
            }
            if (tL_availableReaction == null && q0Var.b) {
                a61Var3.setDrawable(Emoji.getEmojiDrawable(q0Var.f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && q0Var.b && q0Var.d) {
            a61Var3.b();
            a61Var3.G.setVisibility(0);
            a61Var3.setEmojicon(null);
            return;
        }
        if (q0Var.e) {
            a61Var3.setEmojicon(q0Var.f);
        } else {
            a61Var3.setEmojicon(null);
        }
        z51 z51Var3 = a61Var3.G;
        if (z51Var3 != null) {
            z51Var3.setVisibility(4);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View a61Var;
        r61 r61Var = this.s;
        if (i10 == 6) {
            a61Var = new w51(r61Var, r61Var.getContext(), r61Var.T == 6);
        } else if (i10 == 7) {
            a61Var = new org.telegram.ui.Components.jn(r61Var.getContext(), 22);
            a61Var.setTag("searchbox");
        } else {
            a61Var = new a61(r61Var, r61Var.getContext());
        }
        if (r61.c(r61Var)) {
            a61Var.setScaleX(0.0f);
            a61Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.fl0(a61Var);
    }
}
