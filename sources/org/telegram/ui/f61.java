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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class f61 extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ g71 c;

    public f61(g71 g71Var) {
        this.c = g71Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.u0;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return Math.abs(((Long) this.c.v0.get(i10)).longValue());
    }

    @Override // s4.h0
    public final int j(int i10) {
        g71 g71Var = this.c;
        if (i10 == g71Var.a) {
            return 7;
        }
        if (i10 >= g71Var.b && i10 < g71Var.c) {
            return 1;
        }
        if (i10 >= g71Var.d && i10 < g71Var.e) {
            return 1;
        }
        if (i10 >= g71Var.E && i10 < g71Var.F) {
            return 1;
        }
        if (i10 >= g71Var.r && i10 < g71Var.s) {
            return 3;
        }
        if (g71Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (g71Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == g71Var.v) {
            return 6;
        }
        if (g71Var.w0.indexOfKey(i10) >= 0 || i10 == g71Var.f || i10 == g71Var.y || i10 == g71Var.n || i10 == g71Var.h || i10 == g71Var.x) {
            return 0;
        }
        return i10 == g71Var.w ? 8 : 3;
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
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i11;
        boolean z11;
        org.telegram.ui.Components.z5 z5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.xx xxVar;
        ?? r92;
        boolean z12;
        String formatString;
        zg.o0 o0Var;
        int cacheType3;
        g71 g71Var = this.c;
        ArrayList arrayList = g71Var.G0;
        ArrayList arrayList2 = g71Var.K0;
        ArrayList arrayList3 = g71Var.F0;
        SparseIntArray sparseIntArray = g71Var.w0;
        boolean z13 = g71Var.N0;
        ArrayList arrayList4 = g71Var.D0;
        int i12 = g71Var.W;
        ArrayList arrayList5 = g71Var.M0;
        d61 d61Var = g71Var.h0;
        HashSet hashSet = g71Var.K;
        ArrayList arrayList6 = g71Var.E0;
        int i13 = g71Var.V;
        int i14 = c1Var.f;
        View view = c1Var.a;
        if (i14 == 8) {
            p61 p61Var = (p61) view;
            p61Var.c = i10;
            p61Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = g71Var.U1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i14 == 6) {
            TextView textView = (TextView) view;
            if (g71Var.P0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i14 == 0) {
            l61 l61Var = (l61) view;
            if (i10 == g71Var.x) {
                l61Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                l61Var.c.setVisibility(8);
                return;
            }
            if (i10 == g71Var.f) {
                l61Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                l61Var.c.setVisibility(8);
                return;
            }
            if (i10 == g71Var.y) {
                l61Var.a(LocaleController.getString(R.string.StickerEffects), false);
                l61Var.c.setVisibility(8);
                return;
            }
            l61Var.c.setVisibility(8);
            if (i10 == g71Var.h) {
                l61Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == g71Var.n) {
                l61Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i15 = sparseIntArray.get(i10);
            if (i15 < 0) {
                l61Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.xx xxVar2 = (org.telegram.ui.Components.xx) arrayList5.get(i15);
            if (xxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(xxVar2.d, false);
                xxVar2.d = null;
            }
            if (i12 != 5 && i12 != 7 && i12 != 6 && !xxVar2.e && !UserConfig.getInstance(i13).isPremium()) {
                z14 = true;
            }
            l61Var.a(xxVar2.b.title, z14);
            return;
        }
        if (i14 == 1) {
            p61 p61Var2 = (p61) view;
            p61Var2.c = i10;
            ImageReceiver imageReceiver = p61Var2.n;
            int i16 = g71Var.b;
            if (i10 < i16 || i10 >= g71Var.c) {
                int i17 = g71Var.E;
                o0Var = (i10 < i17 || i10 >= g71Var.F) ? (zg.o0) g71Var.H0.get(i10 - g71Var.d) : (zg.o0) g71Var.J0.get(i10 - i17);
            } else {
                o0Var = (zg.o0) g71Var.I0.get(i10 - i16);
            }
            if (i12 == 13) {
                p61Var2.b = false;
                p61Var2.y = true;
                p61Var2.x = o0Var;
                p61Var2.setDrawable(Emoji.getEmojiDrawable(o0Var.f));
                p61Var2.d(g71Var.J.contains(o0Var), false);
                return;
            }
            p61Var2.a(d61Var);
            p61Var2.y = true;
            p61Var2.x = o0Var;
            p61Var2.d(g71Var.J.contains(o0Var), false);
            p61Var2.b = false;
            if (o0Var.b || o0Var.f == null) {
                p61Var2.s = false;
                p61Var2.e = new org.telegram.ui.Components.z5(o0Var.g, (Paint.FontMetricsInt) null);
                p61Var2.d = null;
                p61Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) d61Var.d3.get(p61Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = g71Var.getCacheType();
                    if (cacheType3 == 3 && o0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.q5.n(i13, p61Var2.e.getDocumentId(), null, cacheType3);
                    d61Var.d3.put(p61Var2.e.getDocumentId(), drawable);
                }
                p61Var2.setDrawable(drawable);
            } else {
                p61Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(o0Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        zg.o0 o0Var2 = o0Var;
                        p61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", o0Var2, 0);
                        o0Var = o0Var2;
                    } else {
                        p61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", o0Var, 0);
                    }
                    MediaDataController.getInstance(i13).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.k0.a());
                } else {
                    p61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                p61Var2.e = null;
                p61Var2.d = null;
                p61Var2.setDrawable(null);
                o61 o61Var = p61Var2.J;
                if (o61Var != null) {
                    o61Var.setVisibility(8);
                    p61Var2.J.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i13).isPremium() && i12 == 14 && o0Var.b && o0Var.d) {
                p61Var2.b();
                p61Var2.J.setVisibility(0);
                p61Var2.setEmojicon(null);
                return;
            }
            if (o0Var.e) {
                p61Var2.setEmojicon(o0Var.f);
            } else {
                p61Var2.setEmojicon(null);
            }
            o61 o61Var2 = p61Var2.J;
            if (o61Var2 != null) {
                o61Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i14 == 4) {
            k61 k61Var = (k61) view;
            int i18 = g71Var.y0.get(i10);
            org.telegram.ui.Components.xx xxVar3 = (i18 < 0 || i18 >= arrayList5.size()) ? null : (org.telegram.ui.Components.xx) arrayList5.get(i18);
            if (i18 == -1) {
                g71Var.G = k61Var;
                k61Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (xxVar3 == null) {
                if (g71Var.G == k61Var) {
                    g71Var.G = null;
                    return;
                }
                return;
            } else {
                if (g71Var.G == k61Var) {
                    g71Var.G = null;
                }
                TextView textView2 = k61Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(xxVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i14 == 5) {
            j61 j61Var = (j61) view;
            int i19 = g71Var.z0.get(i10);
            if (i19 < 0 || i19 >= arrayList5.size() || (xxVar = (org.telegram.ui.Components.xx) arrayList5.get(i19)) == null) {
                return;
            }
            String str = xxVar.b.title;
            boolean z15 = (xxVar.e || UserConfig.getInstance(i13).isPremium()) ? false : true;
            boolean z16 = xxVar.f;
            org.telegram.ui.Cells.ua uaVar = new org.telegram.ui.Cells.ua(this, xxVar, i19, 15);
            rg.p0 p0Var = j61Var.c;
            FrameLayout frameLayout = j61Var.a;
            j61Var.d = str;
            if (z15) {
                frameLayout.setVisibility(8);
                r92 = 0;
                p0Var.setVisibility(0);
                p0Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), uaVar, false);
            } else {
                r92 = 0;
                p0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(uaVar);
            }
            if (z16) {
                formatString = LocaleController.getString(R.string.Added);
                z12 = true;
            } else {
                int i20 = R.string.AddStickersCount;
                z12 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = j61Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i20, objArr);
            }
            j61Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = j61Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                j61Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = j61Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                j61Var.n = null;
            }
            Boolean bool = j61Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                j61Var.h = Boolean.valueOf(z15);
                float f7 = z15 ? 1.0f : 0.0f;
                j61Var.f = f7;
                frameLayout.setAlpha(1.0f - f7);
                p0Var.setAlpha(j61Var.f);
                p0Var.setScaleX(j61Var.f);
                p0Var.setScaleY(j61Var.f);
                p0Var.setVisibility(j61Var.h.booleanValue() ? 0 : 8);
                return;
            }
            return;
        }
        if (i14 == 7 || i14 == 9) {
            return;
        }
        p61 p61Var3 = (p61) view;
        p61Var3.v = null;
        p61Var3.w = null;
        p61Var3.a = false;
        p61Var3.c = i10;
        p61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i12 == 4 && g71Var.Q) || i12 == 6) {
            size = arrayList3.size();
        } else if (i12 == 4 || i12 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || g71Var.C0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (g71Var.a != -1 ? 1 : 0) + (g71Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                p61Var3.a = true;
                p61Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                p61Var3.e = null;
                p61Var3.d = null;
                p61Var3.Q = false;
                ImageReceiver imageReceiver2 = p61Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                z5Var = p61Var3.e;
                if (z5Var == null) {
                    org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) d61Var.d3.get(z5Var.getDocumentId());
                    if (q5Var == null) {
                        if (p61Var3.e.document != null) {
                            cacheType2 = g71Var.getCacheType();
                            q5Var = org.telegram.ui.Components.q5.m(i13, cacheType2, p61Var3.e.document);
                        } else {
                            cacheType = g71Var.getCacheType();
                            q5Var = org.telegram.ui.Components.q5.n(i13, p61Var3.e.getDocumentId(), null, cacheType);
                        }
                        d61Var.d3.put(p61Var3.e.getDocumentId(), q5Var);
                    }
                    p61Var3.setDrawable(q5Var);
                } else {
                    p61Var3.setDrawable(null);
                }
                p61Var3.d(z11, false);
            }
        }
        if (i12 == 13) {
            if ((i10 - (g71Var.a != -1 ? 1 : 0)) - (g71Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (g71Var.a != -1 ? 1 : 0)) - (g71Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                p61Var3.b = false;
                p61Var3.y = false;
                p61Var3.x = zg.o0.b(str2);
                p61Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                p61Var3.d(g71Var.J.contains(p61Var3.x), false);
                return;
            }
        }
        int i21 = g71Var.a;
        int i22 = i10 - (i21 != -1 ? 1 : 0);
        int i23 = g71Var.v;
        if (i22 - (i23 != -1 ? 1 : 0) < size) {
            int i24 = ((i10 - (i21 != -1 ? 1 : 0)) - (i23 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i12 == 4 && g71Var.Q) {
                p61Var3.c((TLRPC.Document) arrayList3.get(i24), d61Var);
            } else {
                if (i12 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i24);
                    p61Var3.c(document2, d61Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.z5 z5Var2 = (org.telegram.ui.Components.z5) arrayList4.get(i24);
                    p61Var3.e = z5Var2;
                    p61Var3.d = z5Var2 == null ? null : z5Var2.document;
                    z10 = z5Var2 != null && hashSet.contains(Long.valueOf(z5Var2.getDocumentId()));
                    p61Var3.Q = false;
                    ImageReceiver imageReceiver3 = p61Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - g71Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (g71Var.a != -1 ? 1 : 0)) - (g71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (g71Var.a != -1 ? 1 : 0)) - (g71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.z5 z5Var3 = (org.telegram.ui.Components.z5) arrayList2.get(((((i10 - (g71Var.a != -1 ? 1 : 0)) - (g71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            p61Var3.e = z5Var3;
                            p61Var3.d = z5Var3 == null ? null : z5Var3.document;
                            z10 = z5Var3 != null && hashSet.contains(Long.valueOf(z5Var3.getDocumentId()));
                            p61Var3.Q = false;
                            ImageReceiver imageReceiver4 = p61Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i25 = 0; i25 < sparseIntArray.size(); i25++) {
                    int keyAt = sparseIntArray.keyAt(i25);
                    int valueAt = sparseIntArray.valueAt(i25);
                    org.telegram.ui.Components.xx xxVar4 = valueAt >= 0 ? (org.telegram.ui.Components.xx) arrayList5.get(valueAt) : null;
                    if (xxVar4 != null) {
                        int size2 = xxVar4.h ? xxVar4.c.size() : Math.min(xxVar4.c.size(), 24);
                        int i26 = (i10 - keyAt) - 1;
                        if (i26 >= 0 && i26 < size2 && (document = (TLRPC.Document) xxVar4.c.get(i26)) != null) {
                            if (g71Var.Q) {
                                p61Var3.c(document, g71Var.i0);
                            } else {
                                p61Var3.Q = false;
                                ImageReceiver imageReceiver5 = p61Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                p61Var3.e = new org.telegram.ui.Components.z5(document, (Paint.FontMetricsInt) null);
                            }
                            p61Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.z5 z5Var4 = p61Var3.e;
                if (z5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - g71Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                p61Var3.e = new org.telegram.ui.Components.z5(document3, (Paint.FontMetricsInt) null);
                p61Var3.d = document3;
                p61Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) yh.t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    p61Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = p61Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                p61Var3.Q = false;
                ImageReceiver imageReceiver6 = p61Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        z5Var = p61Var3.e;
        if (z5Var == null) {
        }
        p61Var3.d(z11, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        g71 g71Var = this.c;
        int i11 = g71Var.W;
        org.telegram.ui.ActionBar.e6 e6Var = g71Var.Z0;
        if (i10 == 0) {
            view = new l61(g71Var, g71Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(g71Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            p61 p61Var = new p61(g71Var, g71Var.getContext());
            if (i10 == 8) {
                p61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(p61Var);
                p61Var.h = imageReceiver;
                p61Var.r = imageReceiver;
                imageReceiver.setImageBitmap(g71Var.N);
                g71Var.O = p61Var;
                p61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = p61Var;
        } else if (i10 == 4) {
            Context context = g71Var.getContext();
            k61 k61Var = new k61(context);
            TextView textView = new TextView(context);
            k61Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), g71Var.g1 ? org.telegram.ui.ActionBar.j6.v(g71Var.f1, org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false))) : i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            k61Var.addView(textView, w7.y5.e(-2, -2, 17));
            view = k61Var;
        } else if (i10 == 5) {
            j61 j61Var = new j61(g71Var.getContext());
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(j61Var.getContext(), false, false, false, 4);
            j61Var.b = u3Var;
            u3Var.b(0.3f, 250L, org.telegram.ui.Components.qr.h);
            u3Var.setTextSize(AndroidUtilities.dp(14.0f));
            u3Var.setTypeface(AndroidUtilities.bold());
            u3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, e6Var));
            u3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(j61Var.getContext());
            j61Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, e6Var)));
            frameLayout.addView(u3Var, w7.y5.e(-1, -2, 17));
            j61Var.addView(frameLayout, w7.y5.c(-1.0f, -1));
            rg.p0 p0Var = new rg.p0(j61Var.getContext(), e6Var, false);
            j61Var.c = p0Var;
            p0Var.setIcon(R.raw.unlock_icon);
            j61Var.addView(p0Var, w7.y5.c(-1.0f, -1));
            view = j61Var;
        } else if (i10 == 6) {
            in0 in0Var = new in0(g71Var.getContext(), 2);
            in0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                in0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                in0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                in0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            in0Var.setGravity(17);
            in0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, e6Var));
            view = in0Var;
        } else if (i10 == 7) {
            View t3Var = new org.telegram.ui.Cells.t3(g71Var.getContext(), 52);
            t3Var.setTag("searchbox");
            view = t3Var;
        } else {
            view = new p61(g71Var, g71Var.getContext());
        }
        if (g71.c(g71Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.gl0(view);
    }
}
