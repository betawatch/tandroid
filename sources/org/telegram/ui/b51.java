package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b51 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ c61 c;

    public b51(c61 c61Var) {
        this.c = c61Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
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
        c61 c61Var = this.c;
        if (i10 == c61Var.a) {
            return 7;
        }
        if (i10 >= c61Var.b && i10 < c61Var.c) {
            return 1;
        }
        if (i10 >= c61Var.d && i10 < c61Var.e) {
            return 1;
        }
        if (i10 >= c61Var.E && i10 < c61Var.F) {
            return 1;
        }
        if (i10 >= c61Var.r && i10 < c61Var.s) {
            return 3;
        }
        if (c61Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (c61Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == c61Var.v) {
            return 6;
        }
        if (c61Var.w0.indexOfKey(i10) >= 0 || i10 == c61Var.f || i10 == c61Var.y || i10 == c61Var.n || i10 == c61Var.h || i10 == c61Var.x) {
            return 0;
        }
        return i10 == c61Var.w ? 8 : 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:405:0x0724, code lost:
    
        if (r13.contains(java.lang.Long.valueOf(r0.getDocumentId())) != false) goto L292;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0770  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i11;
        boolean z11;
        org.telegram.ui.Components.c6 c6Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.ey eyVar;
        int i12;
        ?? r92;
        boolean z12;
        String formatString;
        bh.x0 x0Var;
        int cacheType3;
        c61 c61Var = this.c;
        ArrayList arrayList = c61Var.G0;
        ArrayList arrayList2 = c61Var.K0;
        ArrayList arrayList3 = c61Var.F0;
        SparseIntArray sparseIntArray = c61Var.w0;
        boolean z13 = c61Var.N0;
        ArrayList arrayList4 = c61Var.D0;
        int i13 = c61Var.W;
        ArrayList arrayList5 = c61Var.M0;
        z41 z41Var = c61Var.h0;
        HashSet hashSet = c61Var.K;
        ArrayList arrayList6 = c61Var.E0;
        int i14 = c61Var.V;
        int i15 = e1Var.f;
        View view = e1Var.a;
        if (i15 == 8) {
            l51 l51Var = (l51) view;
            l51Var.c = i10;
            l51Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = c61Var.V1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i15 == 6) {
            TextView textView = (TextView) view;
            if (c61Var.P0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i15 == 0) {
            h51 h51Var = (h51) view;
            if (i10 == c61Var.x) {
                h51Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                h51Var.c.setVisibility(8);
                return;
            }
            if (i10 == c61Var.f) {
                h51Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                h51Var.c.setVisibility(8);
                return;
            }
            if (i10 == c61Var.y) {
                h51Var.a(LocaleController.getString(R.string.StickerEffects), false);
                h51Var.c.setVisibility(8);
                return;
            }
            h51Var.c.setVisibility(8);
            if (i10 == c61Var.h) {
                h51Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == c61Var.n) {
                h51Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i16 = sparseIntArray.get(i10);
            if (i16 < 0) {
                h51Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.ey eyVar2 = (org.telegram.ui.Components.ey) arrayList5.get(i16);
            if (eyVar2.d != null) {
                MediaDataController.getInstance(i14).getStickerSet(eyVar2.d, false);
                eyVar2.d = null;
            }
            if (i13 != 5 && i13 != 7 && i13 != 6 && !eyVar2.e && !UserConfig.getInstance(i14).isPremium()) {
                z14 = true;
            }
            h51Var.a(eyVar2.b.title, z14);
            return;
        }
        if (i15 == 1) {
            l51 l51Var2 = (l51) view;
            l51Var2.c = i10;
            ImageReceiver imageReceiver = l51Var2.n;
            int i17 = c61Var.b;
            if (i10 < i17 || i10 >= c61Var.c) {
                int i18 = c61Var.E;
                x0Var = (i10 < i18 || i10 >= c61Var.F) ? (bh.x0) c61Var.H0.get(i10 - c61Var.d) : (bh.x0) c61Var.J0.get(i10 - i18);
            } else {
                x0Var = (bh.x0) c61Var.I0.get(i10 - i17);
            }
            if (i13 == 13) {
                l51Var2.b = false;
                l51Var2.y = true;
                l51Var2.x = x0Var;
                l51Var2.setDrawable(Emoji.getEmojiDrawable(x0Var.f));
                l51Var2.d(c61Var.J.contains(x0Var), false);
                return;
            }
            l51Var2.a(z41Var);
            l51Var2.y = true;
            l51Var2.x = x0Var;
            l51Var2.d(c61Var.J.contains(x0Var), false);
            l51Var2.b = false;
            if (x0Var.b || x0Var.f == null) {
                l51Var2.s = false;
                l51Var2.e = new org.telegram.ui.Components.c6(x0Var.g, (Paint.FontMetricsInt) null);
                l51Var2.d = null;
                l51Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) z41Var.l3.get(l51Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = c61Var.getCacheType();
                    if (cacheType3 == 3 && x0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.t5.n(i14, l51Var2.e.getDocumentId(), null, cacheType3);
                    z41Var.l3.put(l51Var2.e.getDocumentId(), drawable);
                }
                l51Var2.setDrawable(drawable);
            } else {
                l51Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i14).getReactionsMap().get(x0Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.y6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        bh.x0 x0Var2 = x0Var;
                        l51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", x0Var2, 0);
                        x0Var = x0Var2;
                    } else {
                        l51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", x0Var, 0);
                    }
                    MediaDataController.getInstance(i14).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), bh.s0.a());
                } else {
                    l51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                l51Var2.e = null;
                l51Var2.d = null;
                l51Var2.setDrawable(null);
                k51 k51Var = l51Var2.J;
                if (k51Var != null) {
                    k51Var.setVisibility(8);
                    l51Var2.J.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i14).isPremium() && i13 == 14 && x0Var.b && x0Var.d) {
                l51Var2.b();
                l51Var2.J.setVisibility(0);
                l51Var2.setEmojicon(null);
                return;
            }
            if (x0Var.e) {
                l51Var2.setEmojicon(x0Var.f);
            } else {
                l51Var2.setEmojicon(null);
            }
            k51 k51Var2 = l51Var2.J;
            if (k51Var2 != null) {
                k51Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i15 == 4) {
            g51 g51Var = (g51) view;
            int i19 = c61Var.y0.get(i10);
            org.telegram.ui.Components.ey eyVar3 = (i19 < 0 || i19 >= arrayList5.size()) ? null : (org.telegram.ui.Components.ey) arrayList5.get(i19);
            if (i19 == -1) {
                c61Var.G = g51Var;
                g51Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (eyVar3 == null) {
                if (c61Var.G == g51Var) {
                    c61Var.G = null;
                    return;
                }
                return;
            } else {
                if (c61Var.G == g51Var) {
                    c61Var.G = null;
                }
                TextView textView2 = g51Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(eyVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i15 == 5) {
            f51 f51Var = (f51) view;
            int i20 = c61Var.z0.get(i10);
            if (i20 < 0 || i20 >= arrayList5.size() || (eyVar = (org.telegram.ui.Components.ey) arrayList5.get(i20)) == null) {
                return;
            }
            String str = eyVar.b.title;
            boolean z15 = (eyVar.e || UserConfig.getInstance(i14).isPremium()) ? false : true;
            boolean z16 = eyVar.f;
            bi.pa paVar = new bi.pa(this, eyVar, i20, 18);
            tg.p0 p0Var = f51Var.c;
            FrameLayout frameLayout = f51Var.a;
            f51Var.d = str;
            if (z15) {
                i12 = 8;
                frameLayout.setVisibility(8);
                r92 = 0;
                p0Var.setVisibility(0);
                p0Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), paVar, false);
            } else {
                i12 = 8;
                r92 = 0;
                p0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(paVar);
            }
            if (z16) {
                formatString = LocaleController.getString(R.string.Added);
                z12 = true;
            } else {
                int i21 = R.string.AddStickersCount;
                z12 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = f51Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i21, objArr);
            }
            f51Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = f51Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                f51Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = f51Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                f51Var.n = null;
            }
            Boolean bool = f51Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                f51Var.h = Boolean.valueOf(z15);
                float f7 = z15 ? 1.0f : 0.0f;
                f51Var.f = f7;
                frameLayout.setAlpha(1.0f - f7);
                p0Var.setAlpha(f51Var.f);
                p0Var.setScaleX(f51Var.f);
                p0Var.setScaleY(f51Var.f);
                p0Var.setVisibility(f51Var.h.booleanValue() ? 0 : i12);
                return;
            }
            return;
        }
        if (i15 == 7 || i15 == 9) {
            return;
        }
        l51 l51Var3 = (l51) view;
        l51Var3.v = null;
        l51Var3.w = null;
        l51Var3.a = false;
        l51Var3.c = i10;
        l51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i13 == 4 && c61Var.Q) || i13 == 6) {
            size = arrayList3.size();
        } else if (i13 == 4 || i13 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || c61Var.C0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (c61Var.a != -1 ? 1 : 0) + (c61Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                l51Var3.a = true;
                l51Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                l51Var3.e = null;
                l51Var3.d = null;
                l51Var3.Q = false;
                ImageReceiver imageReceiver2 = l51Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                c6Var = l51Var3.e;
                if (c6Var == null) {
                    org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) z41Var.l3.get(c6Var.getDocumentId());
                    if (t5Var == null) {
                        if (l51Var3.e.document != null) {
                            cacheType2 = c61Var.getCacheType();
                            t5Var = org.telegram.ui.Components.t5.m(i14, cacheType2, l51Var3.e.document);
                        } else {
                            cacheType = c61Var.getCacheType();
                            t5Var = org.telegram.ui.Components.t5.n(i14, l51Var3.e.getDocumentId(), null, cacheType);
                        }
                        z41Var.l3.put(l51Var3.e.getDocumentId(), t5Var);
                    }
                    l51Var3.setDrawable(t5Var);
                } else {
                    l51Var3.setDrawable(null);
                }
                l51Var3.d(z11, false);
            }
        }
        if (i13 == 13) {
            if ((i10 - (c61Var.a != -1 ? 1 : 0)) - (c61Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (c61Var.a != -1 ? 1 : 0)) - (c61Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                l51Var3.b = false;
                l51Var3.y = false;
                l51Var3.x = bh.x0.b(str2);
                l51Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                l51Var3.d(c61Var.J.contains(l51Var3.x), false);
                return;
            }
        }
        int i22 = c61Var.a;
        int i23 = i10 - (i22 != -1 ? 1 : 0);
        int i24 = c61Var.v;
        if (i23 - (i24 != -1 ? 1 : 0) < size) {
            int i25 = ((i10 - (i22 != -1 ? 1 : 0)) - (i24 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i13 == 4 && c61Var.Q) {
                l51Var3.c((TLRPC.Document) arrayList3.get(i25), z41Var);
            } else {
                if (i13 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i25);
                    l51Var3.c(document2, z41Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.c6 c6Var2 = (org.telegram.ui.Components.c6) arrayList4.get(i25);
                    l51Var3.e = c6Var2;
                    l51Var3.d = c6Var2 == null ? null : c6Var2.document;
                    z10 = c6Var2 != null && hashSet.contains(Long.valueOf(c6Var2.getDocumentId()));
                    l51Var3.Q = false;
                    ImageReceiver imageReceiver3 = l51Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - c61Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (c61Var.a != -1 ? 1 : 0)) - (c61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (c61Var.a != -1 ? 1 : 0)) - (c61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.c6 c6Var3 = (org.telegram.ui.Components.c6) arrayList2.get(((((i10 - (c61Var.a != -1 ? 1 : 0)) - (c61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            l51Var3.e = c6Var3;
                            l51Var3.d = c6Var3 == null ? null : c6Var3.document;
                            z10 = c6Var3 != null && hashSet.contains(Long.valueOf(c6Var3.getDocumentId()));
                            l51Var3.Q = false;
                            ImageReceiver imageReceiver4 = l51Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i26 = 0; i26 < sparseIntArray.size(); i26++) {
                    int keyAt = sparseIntArray.keyAt(i26);
                    int valueAt = sparseIntArray.valueAt(i26);
                    org.telegram.ui.Components.ey eyVar4 = valueAt >= 0 ? (org.telegram.ui.Components.ey) arrayList5.get(valueAt) : null;
                    if (eyVar4 != null) {
                        int size2 = eyVar4.h ? eyVar4.c.size() : Math.min(eyVar4.c.size(), 24);
                        int i27 = (i10 - keyAt) - 1;
                        if (i27 >= 0 && i27 < size2 && (document = (TLRPC.Document) eyVar4.c.get(i27)) != null) {
                            if (c61Var.Q) {
                                l51Var3.c(document, c61Var.i0);
                            } else {
                                l51Var3.Q = false;
                                ImageReceiver imageReceiver5 = l51Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                l51Var3.e = new org.telegram.ui.Components.c6(document, (Paint.FontMetricsInt) null);
                            }
                            l51Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.c6 c6Var4 = l51Var3.e;
                if (c6Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - c61Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                l51Var3.e = new org.telegram.ui.Components.c6(document3, (Paint.FontMetricsInt) null);
                l51Var3.d = document3;
                l51Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) bi.ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    l51Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = l51Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                l51Var3.Q = false;
                ImageReceiver imageReceiver6 = l51Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        c6Var = l51Var3.e;
        if (c6Var == null) {
        }
        l51Var3.d(z11, false);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        c61 c61Var = this.c;
        int i11 = c61Var.W;
        org.telegram.ui.ActionBar.u6 u6Var = c61Var.Z0;
        if (i10 == 0) {
            view = new h51(c61Var, c61Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(c61Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            l51 l51Var = new l51(c61Var, c61Var.getContext());
            if (i10 == 8) {
                l51Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(l51Var);
                l51Var.h = imageReceiver;
                l51Var.r = imageReceiver;
                imageReceiver.setImageBitmap(c61Var.N);
                c61Var.O = l51Var;
                l51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = l51Var;
        } else if (i10 == 4) {
            Context context = c61Var.getContext();
            g51 g51Var = new g51(context);
            TextView textView = new TextView(context);
            g51Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            int v = c61Var.g1 ? org.telegram.ui.ActionBar.y6.v(c61Var.f1, org.telegram.ui.ActionBar.y6.o1(0.4f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false))) : i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Te, false), 99);
            if (c61Var.g1) {
                textView.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(11.0f), v));
            } else {
                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(11.0f), v);
                org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Te, 99);
                textView.setBackground(c02);
                org.telegram.ui.ActionBar.f7.k(textView, c02, h, null, null);
            }
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            g51Var.addView(textView, org.telegram.ui.Components.gb1.i(-2, -2, 17));
            view = g51Var;
        } else if (i10 == 5) {
            f51 f51Var = new f51(c61Var.getContext());
            org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(f51Var.getContext(), false, false, false, 4);
            f51Var.b = y3Var;
            y3Var.b(0.3f, 250L, org.telegram.ui.Components.ds.h);
            y3Var.setTextSize(AndroidUtilities.dp(14.0f));
            y3Var.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.f7.Z(y3Var, org.telegram.ui.ActionBar.y6.Sh, u6Var);
            y3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(f51Var.getContext());
            f51Var.a = frameLayout;
            int i12 = org.telegram.ui.ActionBar.y6.Oh;
            org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.o6.e(new float[]{8.0f}, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
            org.telegram.ui.ActionBar.b7 f7 = org.telegram.ui.ActionBar.f7.f(i12);
            frameLayout.setBackground(e);
            org.telegram.ui.ActionBar.f7.k(frameLayout, e, N, f7, u6Var);
            frameLayout.addView(y3Var, org.telegram.ui.Components.gb1.i(-1, -2, 17));
            f51Var.addView(frameLayout, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            tg.p0 p0Var = new tg.p0(f51Var.getContext(), u6Var, false);
            f51Var.c = p0Var;
            p0Var.setIcon(R.raw.unlock_icon);
            f51Var.addView(p0Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            view = f51Var;
        } else if (i10 == 6) {
            bn0 bn0Var = new bn0(c61Var.getContext(), 2);
            bn0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                bn0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                bn0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                bn0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            bn0Var.setGravity(17);
            org.telegram.ui.ActionBar.f7.V(bn0Var, org.telegram.ui.ActionBar.y6.y6, u6Var);
            view = bn0Var;
        } else if (i10 == 7) {
            View x3Var = new org.telegram.ui.Cells.x3(c61Var.getContext(), 52);
            x3Var.setTag("searchbox");
            view = x3Var;
        } else {
            view = new l51(c61Var, c61Var.getContext());
        }
        if (c61.c(c61Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.vl0(view);
    }
}
