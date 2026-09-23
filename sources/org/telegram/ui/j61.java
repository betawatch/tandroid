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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class j61 extends org.telegram.ui.Components.ll0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ z61 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public j61(z61 z61Var) {
        this.s = z61Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z10) {
        z61 z61Var = this.s;
        int i10 = z61Var.W;
        boolean z11 = z61Var.I;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = z61Var.A1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < z61Var.A1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, z61Var.A1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = z61Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < z61Var.B1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, z61Var.B1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = z61Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < z61Var.C1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, z61Var.C1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = z61Var.D1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        l();
        if (z61Var.y1 && this.n == 0) {
            z12 = true;
        }
        if (z61Var.G1 == z12) {
            return;
        }
        z61Var.G1 = z12;
        ValueAnimator valueAnimator = z61Var.H1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        z61Var.H1 = ofFloat;
        ofFloat.addUpdateListener(new f51(z61Var, z12, i11));
        z61Var.H1.addListener(new s51(z61Var, z12, i11));
        z61Var.H1.setInterpolator(org.telegram.ui.Components.rr.h);
        z61Var.H1.setDuration(100L);
        z61Var.H1.start();
        if (z12) {
            z61.D(z61Var.V, z61Var.l0);
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
        z61 z61Var = this.s;
        if (z61Var.W == 14) {
            ArrayList arrayList = z61Var.B1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < z61Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = z61Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (z61Var.W == 13 || ((zg.p0) z61Var.A1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= z61Var.D1.size()) {
            return 4;
        }
        return z61Var.D1.get(i10 - this.h) instanceof w61 ? 6 : 3;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        zg.p0 p0Var;
        int cacheType2;
        int i13;
        int indexOf;
        z61 z61Var = this.s;
        HashSet hashSet = z61Var.K;
        int i14 = z61Var.W;
        int i15 = z61Var.V;
        m51 m51Var = z61Var.i0;
        int i16 = c1Var.f;
        View view = c1Var.a;
        if (i16 == 6) {
            e61 e61Var = (e61) view;
            ArrayList arrayList = z61Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) z61Var.D1.get(i10 - this.h);
                if (document2 instanceof w61) {
                    CharSequence charSequence = ((w61) document2).a;
                    String str = z61Var.z1;
                    e61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ue, e61Var.f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    e61Var.a.setText(charSequence);
                    e61Var.b(false);
                }
            } else if (i10 == this.e) {
                e61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                e61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                e61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            e61Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) z61Var.C1.get((i10 - this.c) - 1);
            i61 i61Var = (i61) view;
            i61Var.a(m51Var);
            i61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.h6.m6, 0.2f), 0L, "tgs", document3, 0);
            i61Var.Q = true;
            i61Var.d = document3;
            i61Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                i61 i61Var2 = (i61) view;
                i61Var2.a = false;
                i61Var2.c = i10;
                i61Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                i61Var2.setDrawable(null);
                ArrayList arrayList2 = z61Var.A1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = z61Var.D1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) z61Var.D1.get(i10 - this.h);
                        if (!(document instanceof w61)) {
                            l4 = null;
                        }
                    }
                    document = null;
                    l4 = null;
                } else {
                    zg.p0 p0Var2 = (zg.p0) z61Var.A1.get(i10);
                    i61Var2.x = p0Var2;
                    long j3 = p0Var2.g;
                    if (j3 == 0) {
                        boolean contains2 = z61Var.J.contains(p0Var2);
                        i61Var2.y = true;
                        i61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var2.f));
                        i61Var2.d(contains2, false);
                        return;
                    }
                    l4 = Long.valueOf(j3);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && p0Var2.b && p0Var2.d) {
                        i61Var2.b();
                        i61Var2.J.setVisibility(0);
                    } else {
                        h61 h61Var = i61Var2.J;
                        if (h61Var != null) {
                            h61Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l4 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        i61Var2.e = new org.telegram.ui.Components.z5(document, (Paint.FontMetricsInt) null);
                        i61Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(l4.longValue(), (Paint.FontMetricsInt) null);
                        i61Var2.e = z5Var;
                        i61Var2.d = z5Var.document;
                        contains = hashSet.contains(l4);
                    }
                    org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) m51Var.d3.get(i61Var2.e.getDocumentId());
                    if (q5Var == null) {
                        cacheType = z61Var.getCacheType();
                        q5Var = org.telegram.ui.Components.q5.n(i15, i61Var2.e.getDocumentId(), null, cacheType);
                        m51Var.d3.put(i61Var2.e.getDocumentId(), q5Var);
                    }
                    i61Var2.setDrawable(q5Var);
                }
                i61Var2.d(contains, false);
                return;
            }
            return;
        }
        i61 i61Var3 = (i61) view;
        i61Var3.c = i10;
        ImageReceiver imageReceiver = i61Var3.n;
        ArrayList arrayList4 = z61Var.A1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = z61Var.B1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                p0Var = (zg.p0) z61Var.B1.get(i10 - this.c);
            }
        } else {
            p0Var = (zg.p0) z61Var.A1.get(i10);
        }
        if (i61Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(i61Var3);
            i61Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            i61Var3.h.onAttachedToWindow();
        }
        i61Var3.h.setParentView(m51Var);
        i61Var3.x = p0Var;
        i61Var3.y = false;
        i61Var3.d(z61Var.J.contains(p0Var), false);
        i61Var3.b = false;
        i61Var3.invalidate();
        if (i14 == 13) {
            i61Var3.setDrawable(Emoji.getEmojiDrawable(p0Var.f));
        } else if (p0Var.b || p0Var.f == null) {
            i61Var3.s = false;
            i61Var3.e = new org.telegram.ui.Components.z5(p0Var.g, (Paint.FontMetricsInt) null);
            i61Var3.d = null;
            i61Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.q5 q5Var2 = (org.telegram.ui.Components.q5) m51Var.d3.get(i61Var3.e.getDocumentId());
            if (q5Var2 == null) {
                cacheType2 = z61Var.getCacheType();
                q5Var2 = org.telegram.ui.Components.q5.n(i15, i61Var3.e.getDocumentId(), null, cacheType2);
                m51Var.d3.put(i61Var3.e.getDocumentId(), q5Var2);
            }
            i61Var3.setDrawable(q5Var2);
        } else {
            i61Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(p0Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.h6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    zg.p0 p0Var3 = p0Var;
                    i61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", p0Var3, 0);
                    p0Var = p0Var3;
                } else {
                    i61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.l0.a());
            } else {
                i61Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            i61Var3.e = null;
            i61Var3.d = null;
            i61Var3.setDrawable(null);
            h61 h61Var2 = i61Var3.J;
            if (h61Var2 != null) {
                h61Var2.setVisibility(8);
                i61Var3.J.setImageReceiver(null);
            }
            if (tL_availableReaction == null && p0Var.b) {
                i61Var3.setDrawable(Emoji.getEmojiDrawable(p0Var.f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && p0Var.b && p0Var.d) {
            i61Var3.b();
            i61Var3.J.setVisibility(0);
            i61Var3.setEmojicon(null);
            return;
        }
        if (p0Var.e) {
            i61Var3.setEmojicon(p0Var.f);
        } else {
            i61Var3.setEmojicon(null);
        }
        h61 h61Var3 = i61Var3.J;
        if (h61Var3 != null) {
            h61Var3.setVisibility(4);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View i61Var;
        z61 z61Var = this.s;
        if (i10 == 6) {
            i61Var = new e61(z61Var, z61Var.getContext(), z61Var.W == 6);
        } else if (i10 == 7) {
            i61Var = new org.telegram.ui.Components.ln(z61Var.getContext(), 25);
            i61Var.setTag("searchbox");
        } else {
            i61Var = new i61(z61Var, z61Var.getContext());
        }
        if (z61.c(z61Var)) {
            i61Var.setScaleX(0.0f);
            i61Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.wk0(i61Var);
    }
}
