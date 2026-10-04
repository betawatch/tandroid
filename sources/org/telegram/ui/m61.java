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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class m61 extends org.telegram.ui.Components.yl0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ c71 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public m61(c71 c71Var) {
        this.s = c71Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z10) {
        c71 c71Var = this.s;
        int i10 = c71Var.W;
        boolean z11 = c71Var.I;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = c71Var.A1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < c71Var.A1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, c71Var.A1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = c71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < c71Var.B1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, c71Var.B1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = c71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < c71Var.C1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, c71Var.C1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = c71Var.D1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        l();
        if (c71Var.y1 && this.n == 0) {
            z12 = true;
        }
        if (c71Var.G1 == z12) {
            return;
        }
        c71Var.G1 = z12;
        ValueAnimator valueAnimator = c71Var.H1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        c71Var.H1 = ofFloat;
        ofFloat.addUpdateListener(new j51(c71Var, z12, i11));
        c71Var.H1.addListener(new v51(c71Var, z12, i11));
        c71Var.H1.setInterpolator(org.telegram.ui.Components.tr.h);
        c71Var.H1.setDuration(100L);
        c71Var.H1.start();
        if (z12) {
            c71.D(c71Var.V, c71Var.l0);
        }
    }

    @Override // s4.h0
    public final int h() {
        return this.n;
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f) {
            return 6;
        }
        c71 c71Var = this.s;
        if (c71Var.W == 14) {
            ArrayList arrayList = c71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < c71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = c71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (c71Var.W == 13 || ((zg.o0) c71Var.A1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= c71Var.D1.size()) {
            return 4;
        }
        return c71Var.D1.get(i10 - this.h) instanceof z61 ? 6 : 3;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        zg.o0 o0Var;
        int cacheType2;
        int i13;
        int indexOf;
        c71 c71Var = this.s;
        HashSet hashSet = c71Var.K;
        int i14 = c71Var.W;
        int i15 = c71Var.V;
        p51 p51Var = c71Var.i0;
        int i16 = c1Var.f;
        View view = c1Var.a;
        if (i16 == 6) {
            h61 h61Var = (h61) view;
            ArrayList arrayList = c71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) c71Var.D1.get(i10 - this.h);
                if (document2 instanceof z61) {
                    CharSequence charSequence = ((z61) document2).a;
                    String str = c71Var.z1;
                    h61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ue, h61Var.f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    h61Var.a.setText(charSequence);
                    h61Var.b(false);
                }
            } else if (i10 == this.e) {
                h61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                h61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                h61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            h61Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) c71Var.C1.get((i10 - this.c) - 1);
            l61 l61Var = (l61) view;
            l61Var.a(p51Var);
            l61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.i6.m6, 0.2f), 0L, "tgs", document3, 0);
            l61Var.Q = true;
            l61Var.d = document3;
            l61Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                l61 l61Var2 = (l61) view;
                l61Var2.a = false;
                l61Var2.c = i10;
                l61Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                l61Var2.setDrawable(null);
                ArrayList arrayList2 = c71Var.A1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = c71Var.D1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) c71Var.D1.get(i10 - this.h);
                        if (!(document instanceof z61)) {
                            l4 = null;
                        }
                    }
                    document = null;
                    l4 = null;
                } else {
                    zg.o0 o0Var2 = (zg.o0) c71Var.A1.get(i10);
                    l61Var2.x = o0Var2;
                    long j3 = o0Var2.g;
                    if (j3 == 0) {
                        boolean contains2 = c71Var.J.contains(o0Var2);
                        l61Var2.y = true;
                        l61Var2.setDrawable(Emoji.getEmojiDrawable(o0Var2.f));
                        l61Var2.d(contains2, false);
                        return;
                    }
                    l4 = Long.valueOf(j3);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && o0Var2.b && o0Var2.d) {
                        l61Var2.b();
                        l61Var2.J.setVisibility(0);
                    } else {
                        k61 k61Var = l61Var2.J;
                        if (k61Var != null) {
                            k61Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l4 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        l61Var2.e = new org.telegram.ui.Components.z5(document, (Paint.FontMetricsInt) null);
                        l61Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(l4.longValue(), (Paint.FontMetricsInt) null);
                        l61Var2.e = z5Var;
                        l61Var2.d = z5Var.document;
                        contains = hashSet.contains(l4);
                    }
                    org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) p51Var.k3.get(l61Var2.e.getDocumentId());
                    if (q5Var == null) {
                        cacheType = c71Var.getCacheType();
                        q5Var = org.telegram.ui.Components.q5.n(i15, l61Var2.e.getDocumentId(), null, cacheType);
                        p51Var.k3.put(l61Var2.e.getDocumentId(), q5Var);
                    }
                    l61Var2.setDrawable(q5Var);
                }
                l61Var2.d(contains, false);
                return;
            }
            return;
        }
        l61 l61Var3 = (l61) view;
        l61Var3.c = i10;
        ImageReceiver imageReceiver = l61Var3.n;
        ArrayList arrayList4 = c71Var.A1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = c71Var.B1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                o0Var = (zg.o0) c71Var.B1.get(i10 - this.c);
            }
        } else {
            o0Var = (zg.o0) c71Var.A1.get(i10);
        }
        if (l61Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(l61Var3);
            l61Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            l61Var3.h.onAttachedToWindow();
        }
        l61Var3.h.setParentView(p51Var);
        l61Var3.x = o0Var;
        l61Var3.y = false;
        l61Var3.d(c71Var.J.contains(o0Var), false);
        l61Var3.b = false;
        l61Var3.invalidate();
        if (i14 == 13) {
            l61Var3.setDrawable(Emoji.getEmojiDrawable(o0Var.f));
        } else if (o0Var.b || o0Var.f == null) {
            l61Var3.s = false;
            l61Var3.e = new org.telegram.ui.Components.z5(o0Var.g, (Paint.FontMetricsInt) null);
            l61Var3.d = null;
            l61Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.q5 q5Var2 = (org.telegram.ui.Components.q5) p51Var.k3.get(l61Var3.e.getDocumentId());
            if (q5Var2 == null) {
                cacheType2 = c71Var.getCacheType();
                q5Var2 = org.telegram.ui.Components.q5.n(i15, l61Var3.e.getDocumentId(), null, cacheType2);
                p51Var.k3.put(l61Var3.e.getDocumentId(), q5Var2);
            }
            l61Var3.setDrawable(q5Var2);
        } else {
            l61Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(o0Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.i6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    zg.o0 o0Var3 = o0Var;
                    l61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", o0Var3, 0);
                    o0Var = o0Var3;
                } else {
                    l61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", o0Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.k0.a());
            } else {
                l61Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            l61Var3.e = null;
            l61Var3.d = null;
            l61Var3.setDrawable(null);
            k61 k61Var2 = l61Var3.J;
            if (k61Var2 != null) {
                k61Var2.setVisibility(8);
                l61Var3.J.setImageReceiver(null);
            }
            if (tL_availableReaction == null && o0Var.b) {
                l61Var3.setDrawable(Emoji.getEmojiDrawable(o0Var.f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && o0Var.b && o0Var.d) {
            l61Var3.b();
            l61Var3.J.setVisibility(0);
            l61Var3.setEmojicon(null);
            return;
        }
        if (o0Var.e) {
            l61Var3.setEmojicon(o0Var.f);
        } else {
            l61Var3.setEmojicon(null);
        }
        k61 k61Var3 = l61Var3.J;
        if (k61Var3 != null) {
            k61Var3.setVisibility(4);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View l61Var;
        c71 c71Var = this.s;
        if (i10 == 6) {
            l61Var = new h61(c71Var, c71Var.getContext(), c71Var.W == 6);
        } else if (i10 == 7) {
            l61Var = new org.telegram.ui.Components.nn(c71Var.getContext(), 25);
            l61Var.setTag("searchbox");
        } else {
            l61Var = new l61(c71Var, c71Var.getContext());
        }
        if (c71.c(c71Var)) {
            l61Var.setScaleX(0.0f);
            l61Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.il0(l61Var);
    }
}
