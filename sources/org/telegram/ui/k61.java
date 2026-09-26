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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class k61 extends org.telegram.ui.Components.vl0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ a71 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public k61(a71 a71Var) {
        this.s = a71Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z10) {
        a71 a71Var = this.s;
        int i10 = a71Var.W;
        boolean z11 = a71Var.I;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = a71Var.A1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < a71Var.A1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, a71Var.A1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = a71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < a71Var.B1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, a71Var.B1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = a71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < a71Var.C1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, a71Var.C1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = a71Var.D1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        l();
        if (a71Var.y1 && this.n == 0) {
            z12 = true;
        }
        if (a71Var.G1 == z12) {
            return;
        }
        a71Var.G1 = z12;
        ValueAnimator valueAnimator = a71Var.H1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        a71Var.H1 = ofFloat;
        ofFloat.addUpdateListener(new g51(a71Var, z12, i11));
        a71Var.H1.addListener(new t51(a71Var, z12, i11));
        a71Var.H1.setInterpolator(org.telegram.ui.Components.rr.h);
        a71Var.H1.setDuration(100L);
        a71Var.H1.start();
        if (z12) {
            a71.D(a71Var.V, a71Var.l0);
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
        a71 a71Var = this.s;
        if (a71Var.W == 14) {
            ArrayList arrayList = a71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < a71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = a71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (a71Var.W == 13 || ((zg.o0) a71Var.A1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= a71Var.D1.size()) {
            return 4;
        }
        return a71Var.D1.get(i10 - this.h) instanceof x61 ? 6 : 3;
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
        a71 a71Var = this.s;
        HashSet hashSet = a71Var.K;
        int i14 = a71Var.W;
        int i15 = a71Var.V;
        n51 n51Var = a71Var.i0;
        int i16 = c1Var.f;
        View view = c1Var.a;
        if (i16 == 6) {
            f61 f61Var = (f61) view;
            ArrayList arrayList = a71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) a71Var.D1.get(i10 - this.h);
                if (document2 instanceof x61) {
                    CharSequence charSequence = ((x61) document2).a;
                    String str = a71Var.z1;
                    f61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ue, f61Var.f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    f61Var.a.setText(charSequence);
                    f61Var.b(false);
                }
            } else if (i10 == this.e) {
                f61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                f61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                f61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            f61Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) a71Var.C1.get((i10 - this.c) - 1);
            j61 j61Var = (j61) view;
            j61Var.a(n51Var);
            j61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.h6.m6, 0.2f), 0L, "tgs", document3, 0);
            j61Var.Q = true;
            j61Var.d = document3;
            j61Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                j61 j61Var2 = (j61) view;
                j61Var2.a = false;
                j61Var2.c = i10;
                j61Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                j61Var2.setDrawable(null);
                ArrayList arrayList2 = a71Var.A1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = a71Var.D1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) a71Var.D1.get(i10 - this.h);
                        if (!(document instanceof x61)) {
                            l4 = null;
                        }
                    }
                    document = null;
                    l4 = null;
                } else {
                    zg.o0 o0Var2 = (zg.o0) a71Var.A1.get(i10);
                    j61Var2.x = o0Var2;
                    long j3 = o0Var2.g;
                    if (j3 == 0) {
                        boolean contains2 = a71Var.J.contains(o0Var2);
                        j61Var2.y = true;
                        j61Var2.setDrawable(Emoji.getEmojiDrawable(o0Var2.f));
                        j61Var2.d(contains2, false);
                        return;
                    }
                    l4 = Long.valueOf(j3);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && o0Var2.b && o0Var2.d) {
                        j61Var2.b();
                        j61Var2.J.setVisibility(0);
                    } else {
                        i61 i61Var = j61Var2.J;
                        if (i61Var != null) {
                            i61Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l4 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        j61Var2.e = new org.telegram.ui.Components.z5(document, (Paint.FontMetricsInt) null);
                        j61Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(l4.longValue(), (Paint.FontMetricsInt) null);
                        j61Var2.e = z5Var;
                        j61Var2.d = z5Var.document;
                        contains = hashSet.contains(l4);
                    }
                    org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) n51Var.d3.get(j61Var2.e.getDocumentId());
                    if (q5Var == null) {
                        cacheType = a71Var.getCacheType();
                        q5Var = org.telegram.ui.Components.q5.n(i15, j61Var2.e.getDocumentId(), null, cacheType);
                        n51Var.d3.put(j61Var2.e.getDocumentId(), q5Var);
                    }
                    j61Var2.setDrawable(q5Var);
                }
                j61Var2.d(contains, false);
                return;
            }
            return;
        }
        j61 j61Var3 = (j61) view;
        j61Var3.c = i10;
        ImageReceiver imageReceiver = j61Var3.n;
        ArrayList arrayList4 = a71Var.A1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = a71Var.B1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                o0Var = (zg.o0) a71Var.B1.get(i10 - this.c);
            }
        } else {
            o0Var = (zg.o0) a71Var.A1.get(i10);
        }
        if (j61Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(j61Var3);
            j61Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            j61Var3.h.onAttachedToWindow();
        }
        j61Var3.h.setParentView(n51Var);
        j61Var3.x = o0Var;
        j61Var3.y = false;
        j61Var3.d(a71Var.J.contains(o0Var), false);
        j61Var3.b = false;
        j61Var3.invalidate();
        if (i14 == 13) {
            j61Var3.setDrawable(Emoji.getEmojiDrawable(o0Var.f));
        } else if (o0Var.b || o0Var.f == null) {
            j61Var3.s = false;
            j61Var3.e = new org.telegram.ui.Components.z5(o0Var.g, (Paint.FontMetricsInt) null);
            j61Var3.d = null;
            j61Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.q5 q5Var2 = (org.telegram.ui.Components.q5) n51Var.d3.get(j61Var3.e.getDocumentId());
            if (q5Var2 == null) {
                cacheType2 = a71Var.getCacheType();
                q5Var2 = org.telegram.ui.Components.q5.n(i15, j61Var3.e.getDocumentId(), null, cacheType2);
                n51Var.d3.put(j61Var3.e.getDocumentId(), q5Var2);
            }
            j61Var3.setDrawable(q5Var2);
        } else {
            j61Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(o0Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.h6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    zg.o0 o0Var3 = o0Var;
                    j61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", o0Var3, 0);
                    o0Var = o0Var3;
                } else {
                    j61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", o0Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.k0.a());
            } else {
                j61Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            j61Var3.e = null;
            j61Var3.d = null;
            j61Var3.setDrawable(null);
            i61 i61Var2 = j61Var3.J;
            if (i61Var2 != null) {
                i61Var2.setVisibility(8);
                j61Var3.J.setImageReceiver(null);
            }
            if (tL_availableReaction == null && o0Var.b) {
                j61Var3.setDrawable(Emoji.getEmojiDrawable(o0Var.f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && o0Var.b && o0Var.d) {
            j61Var3.b();
            j61Var3.J.setVisibility(0);
            j61Var3.setEmojicon(null);
            return;
        }
        if (o0Var.e) {
            j61Var3.setEmojicon(o0Var.f);
        } else {
            j61Var3.setEmojicon(null);
        }
        i61 i61Var3 = j61Var3.J;
        if (i61Var3 != null) {
            i61Var3.setVisibility(4);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View j61Var;
        a71 a71Var = this.s;
        if (i10 == 6) {
            j61Var = new f61(a71Var, a71Var.getContext(), a71Var.W == 6);
        } else if (i10 == 7) {
            j61Var = new org.telegram.ui.Components.ln(a71Var.getContext(), 25);
            j61Var.setTag("searchbox");
        } else {
            j61Var = new j61(a71Var, a71Var.getContext());
        }
        if (a71.c(a71Var)) {
            j61Var.setScaleX(0.0f);
            j61Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.gl0(j61Var);
    }
}
