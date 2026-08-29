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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n51 extends org.telegram.ui.Components.il0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ d61 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public n51(d61 d61Var) {
        this.s = d61Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z10) {
        d61 d61Var = this.s;
        int i10 = d61Var.S;
        boolean z11 = d61Var.E;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = d61Var.w1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < d61Var.w1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, d61Var.w1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = d61Var.x1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < d61Var.x1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, d61Var.x1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = d61Var.y1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < d61Var.y1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, d61Var.y1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = d61Var.z1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        l();
        if (d61Var.u1 && this.n == 0) {
            z12 = true;
        }
        if (d61Var.C1 == z12) {
            return;
        }
        d61Var.C1 = z12;
        ValueAnimator valueAnimator = d61Var.D1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        d61Var.D1 = ofFloat;
        ofFloat.addUpdateListener(new k41(d61Var, z12, i11));
        d61Var.D1.addListener(new w41(d61Var, z12, i11));
        d61Var.D1.setInterpolator(org.telegram.ui.Components.jr.h);
        d61Var.D1.setDuration(100L);
        d61Var.D1.start();
        if (z12) {
            d61.D(d61Var.R, d61Var.h0);
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
        d61 d61Var = this.s;
        if (d61Var.S == 14) {
            ArrayList arrayList = d61Var.x1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < d61Var.y1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = d61Var.w1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (d61Var.S == 13 || ((kg.q0) d61Var.w1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= d61Var.z1.size()) {
            return 4;
        }
        return d61Var.z1.get(i10 - this.h) instanceof a61 ? 6 : 3;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        TLRPC.Document document;
        Long l10;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        kg.q0 q0Var;
        int cacheType2;
        int i13;
        int indexOf;
        d61 d61Var = this.s;
        HashSet hashSet = d61Var.G;
        int i14 = d61Var.S;
        int i15 = d61Var.R;
        q41 q41Var = d61Var.e0;
        int i16 = n1Var.f;
        View view = n1Var.a;
        if (i16 == 6) {
            i51 i51Var = (i51) view;
            ArrayList arrayList = d61Var.z1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) d61Var.z1.get(i10 - this.h);
                if (document2 instanceof a61) {
                    CharSequence charSequence = ((a61) document2).a;
                    String str = d61Var.v1;
                    i51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ue, i51Var.f.V0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    i51Var.a.setText(charSequence);
                    i51Var.b(false);
                }
            } else if (i10 == this.e) {
                i51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                i51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                i51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            i51Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) d61Var.y1.get((i10 - this.c) - 1);
            m51 m51Var = (m51) view;
            m51Var.a(q41Var);
            m51Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.g6.m6, 0.2f), 0L, "tgs", document3, 0);
            m51Var.M = true;
            m51Var.d = document3;
            m51Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                m51 m51Var2 = (m51) view;
                m51Var2.a = false;
                m51Var2.c = i10;
                m51Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                m51Var2.setDrawable(null);
                ArrayList arrayList2 = d61Var.w1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = d61Var.z1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) d61Var.z1.get(i10 - this.h);
                        if (!(document instanceof a61)) {
                            l10 = null;
                        }
                    }
                    document = null;
                    l10 = null;
                } else {
                    kg.q0 q0Var2 = (kg.q0) d61Var.w1.get(i10);
                    m51Var2.x = q0Var2;
                    long j10 = q0Var2.g;
                    if (j10 == 0) {
                        boolean contains2 = d61Var.F.contains(q0Var2);
                        m51Var2.y = true;
                        m51Var2.setDrawable(Emoji.getEmojiDrawable(q0Var2.f));
                        m51Var2.d(contains2, false);
                        return;
                    }
                    l10 = Long.valueOf(j10);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && q0Var2.b && q0Var2.d) {
                        m51Var2.b();
                        m51Var2.F.setVisibility(0);
                    } else {
                        l51 l51Var = m51Var2.F;
                        if (l51Var != null) {
                            l51Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l10 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        m51Var2.e = new org.telegram.ui.Components.y5(document, (Paint.FontMetricsInt) null);
                        m51Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(l10.longValue(), (Paint.FontMetricsInt) null);
                        m51Var2.e = y5Var;
                        m51Var2.d = y5Var.document;
                        contains = hashSet.contains(l10);
                    }
                    org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) q41Var.Z2.get(m51Var2.e.getDocumentId());
                    if (p5Var == null) {
                        cacheType = d61Var.getCacheType();
                        p5Var = org.telegram.ui.Components.p5.n(i15, m51Var2.e.getDocumentId(), null, cacheType);
                        q41Var.Z2.put(m51Var2.e.getDocumentId(), p5Var);
                    }
                    m51Var2.setDrawable(p5Var);
                }
                m51Var2.d(contains, false);
                return;
            }
            return;
        }
        m51 m51Var3 = (m51) view;
        m51Var3.c = i10;
        ImageReceiver imageReceiver = m51Var3.n;
        ArrayList arrayList4 = d61Var.w1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = d61Var.x1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                q0Var = (kg.q0) d61Var.x1.get(i10 - this.c);
            }
        } else {
            q0Var = (kg.q0) d61Var.w1.get(i10);
        }
        if (m51Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(m51Var3);
            m51Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            m51Var3.h.onAttachedToWindow();
        }
        m51Var3.h.setParentView(q41Var);
        m51Var3.x = q0Var;
        m51Var3.y = false;
        m51Var3.d(d61Var.F.contains(q0Var), false);
        m51Var3.b = false;
        m51Var3.invalidate();
        if (i14 == 13) {
            m51Var3.setDrawable(Emoji.getEmojiDrawable(q0Var.f));
        } else if (q0Var.b || q0Var.f == null) {
            m51Var3.s = false;
            m51Var3.e = new org.telegram.ui.Components.y5(q0Var.g, (Paint.FontMetricsInt) null);
            m51Var3.d = null;
            m51Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.p5 p5Var2 = (org.telegram.ui.Components.p5) q41Var.Z2.get(m51Var3.e.getDocumentId());
            if (p5Var2 == null) {
                cacheType2 = d61Var.getCacheType();
                p5Var2 = org.telegram.ui.Components.p5.n(i15, m51Var3.e.getDocumentId(), null, cacheType2);
                q41Var.Z2.put(m51Var3.e.getDocumentId(), p5Var2);
            }
            m51Var3.setDrawable(p5Var2);
        } else {
            m51Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(q0Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.g6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    kg.q0 q0Var3 = q0Var;
                    m51Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var3, 0);
                    q0Var = q0Var3;
                } else {
                    m51Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), kg.m0.a());
            } else {
                m51Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            m51Var3.e = null;
            m51Var3.d = null;
            m51Var3.setDrawable(null);
            l51 l51Var2 = m51Var3.F;
            if (l51Var2 != null) {
                l51Var2.setVisibility(8);
                m51Var3.F.setImageReceiver(null);
            }
            if (tL_availableReaction == null && q0Var.b) {
                m51Var3.setDrawable(Emoji.getEmojiDrawable(q0Var.f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && q0Var.b && q0Var.d) {
            m51Var3.b();
            m51Var3.F.setVisibility(0);
            m51Var3.setEmojicon(null);
            return;
        }
        if (q0Var.e) {
            m51Var3.setEmojicon(q0Var.f);
        } else {
            m51Var3.setEmojicon(null);
        }
        l51 l51Var3 = m51Var3.F;
        if (l51Var3 != null) {
            l51Var3.setVisibility(4);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View m51Var;
        d61 d61Var = this.s;
        if (i10 == 6) {
            m51Var = new i51(d61Var, d61Var.getContext(), d61Var.S == 6);
        } else if (i10 == 7) {
            m51Var = new org.telegram.ui.Components.fn(d61Var.getContext(), 23);
            m51Var.setTag("searchbox");
        } else {
            m51Var = new m51(d61Var, d61Var.getContext());
        }
        if (d61.c(d61Var)) {
            m51Var.setScaleX(0.0f);
            m51Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.vk0(m51Var);
    }
}
