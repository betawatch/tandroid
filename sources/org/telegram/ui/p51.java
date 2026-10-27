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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p51 extends org.telegram.ui.Components.mm0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ f61 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public p51(f61 f61Var) {
        this.s = f61Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z10) {
        f61 f61Var = this.s;
        int i10 = f61Var.W;
        boolean z11 = f61Var.I;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = f61Var.B1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < f61Var.B1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, f61Var.B1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = f61Var.C1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < f61Var.C1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, f61Var.C1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = f61Var.D1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < f61Var.D1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, f61Var.D1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = f61Var.E1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        l();
        if (f61Var.z1 && this.n == 0) {
            z12 = true;
        }
        if (f61Var.H1 == z12) {
            return;
        }
        f61Var.H1 = z12;
        ValueAnimator valueAnimator = f61Var.I1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        f61Var.I1 = ofFloat;
        ofFloat.addUpdateListener(new k41(f61Var, z12, i11));
        f61Var.I1.addListener(new y41(f61Var, z12, i11));
        f61Var.I1.setInterpolator(org.telegram.ui.Components.ds.h);
        f61Var.I1.setDuration(100L);
        f61Var.I1.start();
        if (z12) {
            f61.D(f61Var.V, f61Var.l0);
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
        f61 f61Var = this.s;
        if (f61Var.W == 14) {
            ArrayList arrayList = f61Var.C1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < f61Var.D1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = f61Var.B1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (f61Var.W == 13 || ((bh.x0) f61Var.B1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= f61Var.E1.size()) {
            return 4;
        }
        return f61Var.E1.get(i10 - this.h) instanceof c61 ? 6 : 3;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        bh.x0 x0Var;
        int cacheType2;
        int i13;
        int indexOf;
        f61 f61Var = this.s;
        HashSet hashSet = f61Var.K;
        int i14 = f61Var.W;
        int i15 = f61Var.V;
        s41 s41Var = f61Var.i0;
        int i16 = e1Var.f;
        View view = e1Var.a;
        if (i16 == 6) {
            k51 k51Var = (k51) view;
            ArrayList arrayList = f61Var.E1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) f61Var.E1.get(i10 - this.h);
                if (document2 instanceof c61) {
                    CharSequence charSequence = ((c61) document2).a;
                    String str = f61Var.A1;
                    k51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ue, k51Var.f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    k51Var.a.setText(charSequence);
                    k51Var.b(false);
                }
            } else if (i10 == this.e) {
                k51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                k51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                k51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            k51Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) f61Var.D1.get((i10 - this.c) - 1);
            o51 o51Var = (o51) view;
            o51Var.a(s41Var);
            o51Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.y6.m6, 0.2f), 0L, "tgs", document3, 0);
            o51Var.Q = true;
            o51Var.d = document3;
            o51Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                o51 o51Var2 = (o51) view;
                o51Var2.a = false;
                o51Var2.c = i10;
                o51Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                o51Var2.setDrawable(null);
                ArrayList arrayList2 = f61Var.B1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = f61Var.E1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) f61Var.E1.get(i10 - this.h);
                        if (!(document instanceof c61)) {
                            l4 = null;
                        }
                    }
                    document = null;
                    l4 = null;
                } else {
                    bh.x0 x0Var2 = (bh.x0) f61Var.B1.get(i10);
                    o51Var2.x = x0Var2;
                    long j10 = x0Var2.g;
                    if (j10 == 0) {
                        boolean contains2 = f61Var.J.contains(x0Var2);
                        o51Var2.y = true;
                        o51Var2.setDrawable(Emoji.getEmojiDrawable(x0Var2.f));
                        o51Var2.d(contains2, false);
                        return;
                    }
                    l4 = Long.valueOf(j10);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && x0Var2.b && x0Var2.d) {
                        o51Var2.b();
                        o51Var2.J.setVisibility(0);
                    } else {
                        n51 n51Var = o51Var2.J;
                        if (n51Var != null) {
                            n51Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l4 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        o51Var2.e = new org.telegram.ui.Components.c6(document, (Paint.FontMetricsInt) null);
                        o51Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(l4.longValue(), (Paint.FontMetricsInt) null);
                        o51Var2.e = c6Var;
                        o51Var2.d = c6Var.document;
                        contains = hashSet.contains(l4);
                    }
                    org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) s41Var.l3.get(o51Var2.e.getDocumentId());
                    if (t5Var == null) {
                        cacheType = f61Var.getCacheType();
                        t5Var = org.telegram.ui.Components.t5.n(i15, o51Var2.e.getDocumentId(), null, cacheType);
                        s41Var.l3.put(o51Var2.e.getDocumentId(), t5Var);
                    }
                    o51Var2.setDrawable(t5Var);
                }
                o51Var2.d(contains, false);
                return;
            }
            return;
        }
        o51 o51Var3 = (o51) view;
        o51Var3.c = i10;
        ImageReceiver imageReceiver = o51Var3.n;
        ArrayList arrayList4 = f61Var.B1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = f61Var.C1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                x0Var = (bh.x0) f61Var.C1.get(i10 - this.c);
            }
        } else {
            x0Var = (bh.x0) f61Var.B1.get(i10);
        }
        if (o51Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(o51Var3);
            o51Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            o51Var3.h.onAttachedToWindow();
        }
        o51Var3.h.setParentView(s41Var);
        o51Var3.x = x0Var;
        o51Var3.y = false;
        o51Var3.d(f61Var.J.contains(x0Var), false);
        o51Var3.b = false;
        o51Var3.invalidate();
        if (i14 == 13) {
            o51Var3.setDrawable(Emoji.getEmojiDrawable(x0Var.f));
        } else if (x0Var.b || x0Var.f == null) {
            o51Var3.s = false;
            o51Var3.e = new org.telegram.ui.Components.c6(x0Var.g, (Paint.FontMetricsInt) null);
            o51Var3.d = null;
            o51Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.t5 t5Var2 = (org.telegram.ui.Components.t5) s41Var.l3.get(o51Var3.e.getDocumentId());
            if (t5Var2 == null) {
                cacheType2 = f61Var.getCacheType();
                t5Var2 = org.telegram.ui.Components.t5.n(i15, o51Var3.e.getDocumentId(), null, cacheType2);
                s41Var.l3.put(o51Var3.e.getDocumentId(), t5Var2);
            }
            o51Var3.setDrawable(t5Var2);
        } else {
            o51Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(x0Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.y6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    bh.x0 x0Var3 = x0Var;
                    o51Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", x0Var3, 0);
                    x0Var = x0Var3;
                } else {
                    o51Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", x0Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), bh.s0.a());
            } else {
                o51Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            o51Var3.e = null;
            o51Var3.d = null;
            o51Var3.setDrawable(null);
            n51 n51Var2 = o51Var3.J;
            if (n51Var2 != null) {
                n51Var2.setVisibility(8);
                o51Var3.J.setImageReceiver(null);
            }
            if (tL_availableReaction == null && x0Var.b) {
                o51Var3.setDrawable(Emoji.getEmojiDrawable(x0Var.f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && x0Var.b && x0Var.d) {
            o51Var3.b();
            o51Var3.J.setVisibility(0);
            o51Var3.setEmojicon(null);
            return;
        }
        if (x0Var.e) {
            o51Var3.setEmojicon(x0Var.f);
        } else {
            o51Var3.setEmojicon(null);
        }
        n51 n51Var3 = o51Var3.J;
        if (n51Var3 != null) {
            n51Var3.setVisibility(4);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View o51Var;
        f61 f61Var = this.s;
        if (i10 == 6) {
            o51Var = new k51(f61Var, f61Var.getContext(), f61Var.W == 6);
        } else if (i10 == 7) {
            o51Var = new org.telegram.ui.Components.vn(f61Var.getContext(), 25);
            o51Var.setTag("searchbox");
        } else {
            o51Var = new o51(f61Var, f61Var.getContext());
        }
        if (f61.c(f61Var)) {
            o51Var.setScaleX(0.0f);
            o51Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.wl0(o51Var);
    }
}
