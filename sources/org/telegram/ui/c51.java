package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
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
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c51 extends org.telegram.ui.Components.il0 {
    public final /* synthetic */ d61 c;

    public c51(d61 d61Var) {
        this.c = d61Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.q0;
    }

    @Override // f2.p0
    public final long i(int i10) {
        return Math.abs(((Long) this.c.r0.get(i10)).longValue());
    }

    @Override // f2.p0
    public final int j(int i10) {
        d61 d61Var = this.c;
        if (i10 == d61Var.a) {
            return 7;
        }
        if (i10 >= d61Var.b && i10 < d61Var.c) {
            return 1;
        }
        if (i10 >= d61Var.d && i10 < d61Var.e) {
            return 1;
        }
        if (i10 >= d61Var.A && i10 < d61Var.B) {
            return 1;
        }
        if (i10 >= d61Var.r && i10 < d61Var.s) {
            return 3;
        }
        if (d61Var.u0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (d61Var.v0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == d61Var.v) {
            return 6;
        }
        if (d61Var.s0.indexOfKey(i10) >= 0 || i10 == d61Var.f || i10 == d61Var.y || i10 == d61Var.n || i10 == d61Var.h || i10 == d61Var.x) {
            return 0;
        }
        return i10 == d61Var.w ? 8 : 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:405:0x0725, code lost:
    
        if (r13.contains(java.lang.Long.valueOf(r0.getDocumentId())) != false) goto L292;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0771  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i11;
        boolean z11;
        org.telegram.ui.Components.y5 y5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.rx rxVar;
        ?? r9;
        boolean z12;
        String formatString;
        kg.q0 q0Var;
        int cacheType3;
        d61 d61Var = this.c;
        ArrayList arrayList = d61Var.C0;
        ArrayList arrayList2 = d61Var.G0;
        ArrayList arrayList3 = d61Var.B0;
        SparseIntArray sparseIntArray = d61Var.s0;
        boolean z13 = d61Var.J0;
        ArrayList arrayList4 = d61Var.z0;
        int i12 = d61Var.S;
        ArrayList arrayList5 = d61Var.I0;
        a51 a51Var = d61Var.d0;
        HashSet hashSet = d61Var.G;
        ArrayList arrayList6 = d61Var.A0;
        int i13 = d61Var.R;
        int i14 = n1Var.f;
        View view = n1Var.a;
        if (i14 == 8) {
            m51 m51Var = (m51) view;
            m51Var.c = i10;
            m51Var.H = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = d61Var.Q1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i14 == 6) {
            TextView textView = (TextView) view;
            if (d61Var.L0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i14 == 0) {
            i51 i51Var = (i51) view;
            if (i10 == d61Var.x) {
                i51Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                i51Var.c.setVisibility(8);
                return;
            }
            if (i10 == d61Var.f) {
                i51Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                i51Var.c.setVisibility(8);
                return;
            }
            if (i10 == d61Var.y) {
                i51Var.a(LocaleController.getString(R.string.StickerEffects), false);
                i51Var.c.setVisibility(8);
                return;
            }
            i51Var.c.setVisibility(8);
            if (i10 == d61Var.h) {
                i51Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == d61Var.n) {
                i51Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i15 = sparseIntArray.get(i10);
            if (i15 < 0) {
                i51Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.rx rxVar2 = (org.telegram.ui.Components.rx) arrayList5.get(i15);
            if (rxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(rxVar2.d, false);
                rxVar2.d = null;
            }
            if (i12 != 5 && i12 != 7 && i12 != 6 && !rxVar2.e && !UserConfig.getInstance(i13).isPremium()) {
                z14 = true;
            }
            i51Var.a(rxVar2.b.title, z14);
            return;
        }
        if (i14 == 1) {
            m51 m51Var2 = (m51) view;
            m51Var2.c = i10;
            ImageReceiver imageReceiver = m51Var2.n;
            int i16 = d61Var.b;
            if (i10 < i16 || i10 >= d61Var.c) {
                int i17 = d61Var.A;
                q0Var = (i10 < i17 || i10 >= d61Var.B) ? (kg.q0) d61Var.D0.get(i10 - d61Var.d) : (kg.q0) d61Var.F0.get(i10 - i17);
            } else {
                q0Var = (kg.q0) d61Var.E0.get(i10 - i16);
            }
            if (i12 == 13) {
                m51Var2.b = false;
                m51Var2.y = true;
                m51Var2.x = q0Var;
                m51Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f));
                m51Var2.d(d61Var.F.contains(q0Var), false);
                return;
            }
            m51Var2.a(a51Var);
            m51Var2.y = true;
            m51Var2.x = q0Var;
            m51Var2.d(d61Var.F.contains(q0Var), false);
            m51Var2.b = false;
            if (q0Var.b || q0Var.f == null) {
                m51Var2.s = false;
                m51Var2.e = new org.telegram.ui.Components.y5(q0Var.g, (Paint.FontMetricsInt) null);
                m51Var2.d = null;
                m51Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) a51Var.Z2.get(m51Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = d61Var.getCacheType();
                    if (cacheType3 == 3 && q0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.p5.n(i13, m51Var2.e.getDocumentId(), null, cacheType3);
                    a51Var.Z2.put(m51Var2.e.getDocumentId(), drawable);
                }
                m51Var2.setDrawable(drawable);
            } else {
                m51Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(q0Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.g6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        kg.q0 q0Var2 = q0Var;
                        m51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var2, 0);
                        q0Var = q0Var2;
                    } else {
                        m51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                    }
                    MediaDataController.getInstance(i13).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), kg.m0.a());
                } else {
                    m51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                m51Var2.e = null;
                m51Var2.d = null;
                m51Var2.setDrawable(null);
                l51 l51Var = m51Var2.F;
                if (l51Var != null) {
                    l51Var.setVisibility(8);
                    m51Var2.F.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i13).isPremium() && i12 == 14 && q0Var.b && q0Var.d) {
                m51Var2.b();
                m51Var2.F.setVisibility(0);
                m51Var2.setEmojicon(null);
                return;
            }
            if (q0Var.e) {
                m51Var2.setEmojicon(q0Var.f);
            } else {
                m51Var2.setEmojicon(null);
            }
            l51 l51Var2 = m51Var2.F;
            if (l51Var2 != null) {
                l51Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i14 == 4) {
            h51 h51Var = (h51) view;
            int i18 = d61Var.u0.get(i10);
            org.telegram.ui.Components.rx rxVar3 = (i18 < 0 || i18 >= arrayList5.size()) ? null : (org.telegram.ui.Components.rx) arrayList5.get(i18);
            if (i18 == -1) {
                d61Var.C = h51Var;
                h51Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (rxVar3 == null) {
                if (d61Var.C == h51Var) {
                    d61Var.C = null;
                    return;
                }
                return;
            } else {
                if (d61Var.C == h51Var) {
                    d61Var.C = null;
                }
                TextView textView2 = h51Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(rxVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i14 == 5) {
            g51 g51Var = (g51) view;
            int i19 = d61Var.v0.get(i10);
            if (i19 < 0 || i19 >= arrayList5.size() || (rxVar = (org.telegram.ui.Components.rx) arrayList5.get(i19)) == null) {
                return;
            }
            String str = rxVar.b.title;
            boolean z15 = (rxVar.e || UserConfig.getInstance(i13).isPremium()) ? false : true;
            boolean z16 = rxVar.f;
            bg.p2 p2Var = new bg.p2(this, rxVar, i19, 19);
            cg.d1 d1Var = g51Var.c;
            FrameLayout frameLayout = g51Var.a;
            g51Var.d = str;
            if (z15) {
                frameLayout.setVisibility(8);
                r9 = 0;
                d1Var.setVisibility(0);
                d1Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), p2Var, false);
            } else {
                r9 = 0;
                d1Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(p2Var);
            }
            if (z16) {
                formatString = LocaleController.getString(R.string.Added);
                z12 = true;
            } else {
                int i20 = R.string.AddStickersCount;
                z12 = true;
                Object[] objArr = new Object[1];
                objArr[r9] = g51Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i20, objArr);
            }
            g51Var.b.c(formatString, r9, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = g51Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                g51Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = g51Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                g51Var.n = null;
            }
            Boolean bool = g51Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                g51Var.h = Boolean.valueOf(z15);
                float f9 = z15 ? 1.0f : 0.0f;
                g51Var.f = f9;
                frameLayout.setAlpha(1.0f - f9);
                d1Var.setAlpha(g51Var.f);
                d1Var.setScaleX(g51Var.f);
                d1Var.setScaleY(g51Var.f);
                d1Var.setVisibility(g51Var.h.booleanValue() ? 0 : 8);
                return;
            }
            return;
        }
        if (i14 == 7 || i14 == 9) {
            return;
        }
        m51 m51Var3 = (m51) view;
        m51Var3.v = null;
        m51Var3.w = null;
        m51Var3.a = false;
        m51Var3.c = i10;
        m51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i12 == 4 && d61Var.M) || i12 == 6) {
            size = arrayList3.size();
        } else if (i12 == 4 || i12 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || d61Var.y0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (d61Var.a != -1 ? 1 : 0) + (d61Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                m51Var3.a = true;
                m51Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                m51Var3.e = null;
                m51Var3.d = null;
                m51Var3.M = false;
                ImageReceiver imageReceiver2 = m51Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                y5Var = m51Var3.e;
                if (y5Var == null) {
                    org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) a51Var.Z2.get(y5Var.getDocumentId());
                    if (p5Var == null) {
                        if (m51Var3.e.document != null) {
                            cacheType2 = d61Var.getCacheType();
                            p5Var = org.telegram.ui.Components.p5.m(i13, cacheType2, m51Var3.e.document);
                        } else {
                            cacheType = d61Var.getCacheType();
                            p5Var = org.telegram.ui.Components.p5.n(i13, m51Var3.e.getDocumentId(), null, cacheType);
                        }
                        a51Var.Z2.put(m51Var3.e.getDocumentId(), p5Var);
                    }
                    m51Var3.setDrawable(p5Var);
                } else {
                    m51Var3.setDrawable(null);
                }
                m51Var3.d(z11, false);
            }
        }
        if (i12 == 13) {
            if ((i10 - (d61Var.a != -1 ? 1 : 0)) - (d61Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (d61Var.a != -1 ? 1 : 0)) - (d61Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                m51Var3.b = false;
                m51Var3.y = false;
                m51Var3.x = kg.q0.b(str2);
                m51Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                m51Var3.d(d61Var.F.contains(m51Var3.x), false);
                return;
            }
        }
        int i21 = d61Var.a;
        int i22 = i10 - (i21 != -1 ? 1 : 0);
        int i23 = d61Var.v;
        if (i22 - (i23 != -1 ? 1 : 0) < size) {
            int i24 = ((i10 - (i21 != -1 ? 1 : 0)) - (i23 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i12 == 4 && d61Var.M) {
                m51Var3.c((TLRPC.Document) arrayList3.get(i24), a51Var);
            } else {
                if (i12 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i24);
                    m51Var3.c(document2, a51Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.y5 y5Var2 = (org.telegram.ui.Components.y5) arrayList4.get(i24);
                    m51Var3.e = y5Var2;
                    m51Var3.d = y5Var2 == null ? null : y5Var2.document;
                    z10 = y5Var2 != null && hashSet.contains(Long.valueOf(y5Var2.getDocumentId()));
                    m51Var3.M = false;
                    ImageReceiver imageReceiver3 = m51Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - d61Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (d61Var.a != -1 ? 1 : 0)) - (d61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (d61Var.a != -1 ? 1 : 0)) - (d61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.y5 y5Var3 = (org.telegram.ui.Components.y5) arrayList2.get(((((i10 - (d61Var.a != -1 ? 1 : 0)) - (d61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            m51Var3.e = y5Var3;
                            m51Var3.d = y5Var3 == null ? null : y5Var3.document;
                            z10 = y5Var3 != null && hashSet.contains(Long.valueOf(y5Var3.getDocumentId()));
                            m51Var3.M = false;
                            ImageReceiver imageReceiver4 = m51Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i25 = 0; i25 < sparseIntArray.size(); i25++) {
                    int keyAt = sparseIntArray.keyAt(i25);
                    int valueAt = sparseIntArray.valueAt(i25);
                    org.telegram.ui.Components.rx rxVar4 = valueAt >= 0 ? (org.telegram.ui.Components.rx) arrayList5.get(valueAt) : null;
                    if (rxVar4 != null) {
                        int size2 = rxVar4.h ? rxVar4.c.size() : Math.min(rxVar4.c.size(), 24);
                        int i26 = (i10 - keyAt) - 1;
                        if (i26 >= 0 && i26 < size2 && (document = (TLRPC.Document) rxVar4.c.get(i26)) != null) {
                            if (d61Var.M) {
                                m51Var3.c(document, d61Var.e0);
                            } else {
                                m51Var3.M = false;
                                ImageReceiver imageReceiver5 = m51Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                m51Var3.e = new org.telegram.ui.Components.y5(document, (Paint.FontMetricsInt) null);
                            }
                            m51Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.y5 y5Var4 = m51Var3.e;
                if (y5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - d61Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                m51Var3.e = new org.telegram.ui.Components.y5(document3, (Paint.FontMetricsInt) null);
                m51Var3.d = document3;
                m51Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jh.s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    m51Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = m51Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                m51Var3.M = false;
                ImageReceiver imageReceiver6 = m51Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        y5Var = m51Var3.e;
        if (y5Var == null) {
        }
        m51Var3.d(z11, false);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        d61 d61Var = this.c;
        int i11 = d61Var.S;
        org.telegram.ui.ActionBar.c6 c6Var = d61Var.V0;
        if (i10 == 0) {
            view = new i51(d61Var, d61Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(d61Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            m51 m51Var = new m51(d61Var, d61Var.getContext());
            if (i10 == 8) {
                m51Var.M = true;
                ImageReceiver imageReceiver = new ImageReceiver(m51Var);
                m51Var.h = imageReceiver;
                m51Var.r = imageReceiver;
                imageReceiver.setImageBitmap(d61Var.J);
                d61Var.K = m51Var;
                m51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = m51Var;
        } else if (i10 == 4) {
            Context context = d61Var.getContext();
            h51 h51Var = new h51(context);
            TextView textView = new TextView(context);
            h51Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(11.0f), d61Var.c1 ? org.telegram.ui.ActionBar.g6.v(d61Var.b1, org.telegram.ui.ActionBar.g6.l1(0.4f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false))) : i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            h51Var.addView(textView, i7.f6.e(-2, -2, 17));
            view = h51Var;
        } else if (i10 == 5) {
            g51 g51Var = new g51(d61Var.getContext());
            org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(g51Var.getContext(), false, false, false, 4);
            g51Var.b = r3Var;
            r3Var.b(0.3f, 250L, org.telegram.ui.Components.jr.h);
            r3Var.setTextSize(AndroidUtilities.dp(14.0f));
            r3Var.setTypeface(AndroidUtilities.bold());
            r3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
            r3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(g51Var.getContext());
            g51Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
            frameLayout.addView(r3Var, i7.f6.e(-1, -2, 17));
            g51Var.addView(frameLayout, i7.f6.c(-1.0f, -1));
            cg.d1 d1Var = new cg.d1(g51Var.getContext(), c6Var, false);
            g51Var.c = d1Var;
            d1Var.setIcon(R.raw.unlock_icon);
            g51Var.addView(d1Var, i7.f6.c(-1.0f, -1));
            view = g51Var;
        } else if (i10 == 6) {
            om0 om0Var = new om0(d61Var.getContext(), 1);
            om0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                om0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                om0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                om0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            om0Var.setGravity(17);
            om0Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var));
            view = om0Var;
        } else if (i10 == 7) {
            View q3Var = new org.telegram.ui.Cells.q3(d61Var.getContext(), 52);
            q3Var.setTag("searchbox");
            view = q3Var;
        } else {
            view = new m51(d61Var, d61Var.getContext());
        }
        if (d61.c(d61Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.vk0(view);
    }
}
