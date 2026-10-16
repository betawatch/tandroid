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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class b71 extends org.telegram.ui.Components.lm0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ r71 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public b71(r71 r71Var) {
        this.s = r71Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z10) {
        r71 r71Var = this.s;
        int i10 = r71Var.W;
        boolean z11 = r71Var.I;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = r71Var.A1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < r71Var.A1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, r71Var.A1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = r71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < r71Var.B1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, r71Var.B1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = r71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < r71Var.C1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, r71Var.C1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = r71Var.D1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        l();
        if (r71Var.y1 && this.n == 0) {
            z12 = true;
        }
        if (r71Var.G1 == z12) {
            return;
        }
        r71Var.G1 = z12;
        ValueAnimator valueAnimator = r71Var.H1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        r71Var.H1 = ofFloat;
        ofFloat.addUpdateListener(new w51(r71Var, z12, i11));
        r71Var.H1.addListener(new k61(r71Var, z12, i11));
        r71Var.H1.setInterpolator(org.telegram.ui.Components.es.h);
        r71Var.H1.setDuration(100L);
        r71Var.H1.start();
        if (z12) {
            r71.D(r71Var.V, r71Var.l0);
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
        r71 r71Var = this.s;
        if (r71Var.W == 14) {
            ArrayList arrayList = r71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < r71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = r71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (r71Var.W == 13 || ((ah.i1) r71Var.A1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= r71Var.D1.size()) {
            return 4;
        }
        return r71Var.D1.get(i10 - this.h) instanceof o71 ? 6 : 3;
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
        r71 r71Var = this.s;
        HashSet hashSet = r71Var.K;
        int i14 = r71Var.W;
        int i15 = r71Var.V;
        e61 e61Var = r71Var.i0;
        int i16 = b1Var.f;
        View view = b1Var.a;
        if (i16 == 6) {
            w61 w61Var = (w61) view;
            ArrayList arrayList = r71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) r71Var.D1.get(i10 - this.h);
                if (document2 instanceof o71) {
                    CharSequence charSequence = ((o71) document2).a;
                    String str = r71Var.z1;
                    w61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ue, w61Var.f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    w61Var.a.setText(charSequence);
                    w61Var.b(false);
                }
            } else if (i10 == this.e) {
                w61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                w61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                w61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            w61Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) r71Var.C1.get((i10 - this.c) - 1);
            a71 a71Var = (a71) view;
            a71Var.a(e61Var);
            a71Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.g6.m6, 0.2f), 0L, "tgs", document3, 0);
            a71Var.Q = true;
            a71Var.d = document3;
            a71Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                a71 a71Var2 = (a71) view;
                a71Var2.a = false;
                a71Var2.c = i10;
                a71Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                a71Var2.setDrawable(null);
                ArrayList arrayList2 = r71Var.A1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = r71Var.D1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) r71Var.D1.get(i10 - this.h);
                        if (!(document instanceof o71)) {
                            l4 = null;
                        }
                    }
                    document = null;
                    l4 = null;
                } else {
                    ah.i1 i1Var2 = (ah.i1) r71Var.A1.get(i10);
                    a71Var2.x = i1Var2;
                    long j10 = i1Var2.g;
                    if (j10 == 0) {
                        boolean contains2 = r71Var.J.contains(i1Var2);
                        a71Var2.y = true;
                        a71Var2.setDrawable(Emoji.getEmojiDrawable(i1Var2.f));
                        a71Var2.d(contains2, false);
                        return;
                    }
                    l4 = Long.valueOf(j10);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && i1Var2.b && i1Var2.d) {
                        a71Var2.b();
                        a71Var2.J.setVisibility(0);
                    } else {
                        z61 z61Var = a71Var2.J;
                        if (z61Var != null) {
                            z61Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l4 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        a71Var2.e = new org.telegram.ui.Components.b6(document, (Paint.FontMetricsInt) null);
                        a71Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(l4.longValue(), (Paint.FontMetricsInt) null);
                        a71Var2.e = b6Var;
                        a71Var2.d = b6Var.document;
                        contains = hashSet.contains(l4);
                    }
                    org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) e61Var.b3.get(a71Var2.e.getDocumentId());
                    if (s5Var == null) {
                        cacheType = r71Var.getCacheType();
                        s5Var = org.telegram.ui.Components.s5.n(i15, a71Var2.e.getDocumentId(), null, cacheType);
                        e61Var.b3.put(a71Var2.e.getDocumentId(), s5Var);
                    }
                    a71Var2.setDrawable(s5Var);
                }
                a71Var2.d(contains, false);
                return;
            }
            return;
        }
        a71 a71Var3 = (a71) view;
        a71Var3.c = i10;
        ImageReceiver imageReceiver = a71Var3.n;
        ArrayList arrayList4 = r71Var.A1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = r71Var.B1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                i1Var = (ah.i1) r71Var.B1.get(i10 - this.c);
            }
        } else {
            i1Var = (ah.i1) r71Var.A1.get(i10);
        }
        if (a71Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(a71Var3);
            a71Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            a71Var3.h.onAttachedToWindow();
        }
        a71Var3.h.setParentView(e61Var);
        a71Var3.x = i1Var;
        a71Var3.y = false;
        a71Var3.d(r71Var.J.contains(i1Var), false);
        a71Var3.b = false;
        a71Var3.invalidate();
        if (i14 == 13) {
            a71Var3.setDrawable(Emoji.getEmojiDrawable(i1Var.f));
        } else if (i1Var.b || i1Var.f == null) {
            a71Var3.s = false;
            a71Var3.e = new org.telegram.ui.Components.b6(i1Var.g, (Paint.FontMetricsInt) null);
            a71Var3.d = null;
            a71Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.s5 s5Var2 = (org.telegram.ui.Components.s5) e61Var.b3.get(a71Var3.e.getDocumentId());
            if (s5Var2 == null) {
                cacheType2 = r71Var.getCacheType();
                s5Var2 = org.telegram.ui.Components.s5.n(i15, a71Var3.e.getDocumentId(), null, cacheType2);
                e61Var.b3.put(a71Var3.e.getDocumentId(), s5Var2);
            }
            a71Var3.setDrawable(s5Var2);
        } else {
            a71Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(i1Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.g6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    ah.i1 i1Var3 = i1Var;
                    a71Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", i1Var3, 0);
                    i1Var = i1Var3;
                } else {
                    a71Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
            } else {
                a71Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            a71Var3.e = null;
            a71Var3.d = null;
            a71Var3.setDrawable(null);
            z61 z61Var2 = a71Var3.J;
            if (z61Var2 != null) {
                z61Var2.setVisibility(8);
                a71Var3.J.setImageReceiver(null);
            }
            if (tL_availableReaction == null && i1Var.b) {
                a71Var3.setDrawable(Emoji.getEmojiDrawable(i1Var.f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && i1Var.b && i1Var.d) {
            a71Var3.b();
            a71Var3.J.setVisibility(0);
            a71Var3.setEmojicon(null);
            return;
        }
        if (i1Var.e) {
            a71Var3.setEmojicon(i1Var.f);
        } else {
            a71Var3.setEmojicon(null);
        }
        z61 z61Var3 = a71Var3.J;
        if (z61Var3 != null) {
            z61Var3.setVisibility(4);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View a71Var;
        r71 r71Var = this.s;
        if (i10 == 6) {
            a71Var = new w61(r71Var, r71Var.getContext(), r71Var.W == 6);
        } else if (i10 == 7) {
            a71Var = new org.telegram.ui.Components.xn(r71Var.getContext(), 25);
            a71Var.setTag("searchbox");
        } else {
            a71Var = new a71(r71Var, r71Var.getContext());
        }
        if (r71.c(r71Var)) {
            a71Var.setScaleX(0.0f);
            a71Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.wl0(a71Var);
    }
}
