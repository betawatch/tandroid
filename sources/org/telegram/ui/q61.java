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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class q61 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ r71 c;

    public q61(r71 r71Var) {
        this.c = r71Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.u0;
    }

    @Override // s4.g0
    public final long i(int i10) {
        return Math.abs(((Long) this.c.v0.get(i10)).longValue());
    }

    @Override // s4.g0
    public final int j(int i10) {
        r71 r71Var = this.c;
        if (i10 == r71Var.a) {
            return 7;
        }
        if (i10 >= r71Var.b && i10 < r71Var.c) {
            return 1;
        }
        if (i10 >= r71Var.d && i10 < r71Var.e) {
            return 1;
        }
        if (i10 >= r71Var.E && i10 < r71Var.F) {
            return 1;
        }
        if (i10 >= r71Var.r && i10 < r71Var.s) {
            return 3;
        }
        if (r71Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (r71Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == r71Var.v) {
            return 6;
        }
        if (r71Var.w0.indexOfKey(i10) >= 0 || i10 == r71Var.f || i10 == r71Var.y || i10 == r71Var.n || i10 == r71Var.h || i10 == r71Var.x) {
            return 0;
        }
        return i10 == r71Var.w ? 8 : 3;
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
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i11;
        boolean z11;
        org.telegram.ui.Components.b6 b6Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.jy jyVar;
        int i12;
        ?? r92;
        boolean z12;
        String formatString;
        ah.i1 i1Var;
        int cacheType3;
        r71 r71Var = this.c;
        ArrayList arrayList = r71Var.G0;
        ArrayList arrayList2 = r71Var.K0;
        ArrayList arrayList3 = r71Var.F0;
        SparseIntArray sparseIntArray = r71Var.w0;
        boolean z13 = r71Var.N0;
        ArrayList arrayList4 = r71Var.D0;
        int i13 = r71Var.W;
        ArrayList arrayList5 = r71Var.M0;
        o61 o61Var = r71Var.h0;
        HashSet hashSet = r71Var.K;
        ArrayList arrayList6 = r71Var.E0;
        int i14 = r71Var.V;
        int i15 = b1Var.f;
        View view = b1Var.a;
        if (i15 == 8) {
            a71 a71Var = (a71) view;
            a71Var.c = i10;
            a71Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = r71Var.U1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i15 == 6) {
            TextView textView = (TextView) view;
            if (r71Var.P0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i15 == 0) {
            w61 w61Var = (w61) view;
            if (i10 == r71Var.x) {
                w61Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                w61Var.c.setVisibility(8);
                return;
            }
            if (i10 == r71Var.f) {
                w61Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                w61Var.c.setVisibility(8);
                return;
            }
            if (i10 == r71Var.y) {
                w61Var.a(LocaleController.getString(R.string.StickerEffects), false);
                w61Var.c.setVisibility(8);
                return;
            }
            w61Var.c.setVisibility(8);
            if (i10 == r71Var.h) {
                w61Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == r71Var.n) {
                w61Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i16 = sparseIntArray.get(i10);
            if (i16 < 0) {
                w61Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.jy jyVar2 = (org.telegram.ui.Components.jy) arrayList5.get(i16);
            if (jyVar2.d != null) {
                MediaDataController.getInstance(i14).getStickerSet(jyVar2.d, false);
                jyVar2.d = null;
            }
            if (i13 != 5 && i13 != 7 && i13 != 6 && !jyVar2.e && !UserConfig.getInstance(i14).isPremium()) {
                z14 = true;
            }
            w61Var.a(jyVar2.b.title, z14);
            return;
        }
        if (i15 == 1) {
            a71 a71Var2 = (a71) view;
            a71Var2.c = i10;
            ImageReceiver imageReceiver = a71Var2.n;
            int i17 = r71Var.b;
            if (i10 < i17 || i10 >= r71Var.c) {
                int i18 = r71Var.E;
                i1Var = (i10 < i18 || i10 >= r71Var.F) ? (ah.i1) r71Var.H0.get(i10 - r71Var.d) : (ah.i1) r71Var.J0.get(i10 - i18);
            } else {
                i1Var = (ah.i1) r71Var.I0.get(i10 - i17);
            }
            if (i13 == 13) {
                a71Var2.b = false;
                a71Var2.y = true;
                a71Var2.x = i1Var;
                a71Var2.setDrawable(Emoji.getEmojiDrawable(i1Var.f));
                a71Var2.d(r71Var.J.contains(i1Var), false);
                return;
            }
            a71Var2.a(o61Var);
            a71Var2.y = true;
            a71Var2.x = i1Var;
            a71Var2.d(r71Var.J.contains(i1Var), false);
            a71Var2.b = false;
            if (i1Var.b || i1Var.f == null) {
                a71Var2.s = false;
                a71Var2.e = new org.telegram.ui.Components.b6(i1Var.g, (Paint.FontMetricsInt) null);
                a71Var2.d = null;
                a71Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) o61Var.b3.get(a71Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = r71Var.getCacheType();
                    if (cacheType3 == 3 && i1Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.s5.n(i14, a71Var2.e.getDocumentId(), null, cacheType3);
                    o61Var.b3.put(a71Var2.e.getDocumentId(), drawable);
                }
                a71Var2.setDrawable(drawable);
            } else {
                a71Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i14).getReactionsMap().get(i1Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.g6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        ah.i1 i1Var2 = i1Var;
                        a71Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", i1Var2, 0);
                        i1Var = i1Var2;
                    } else {
                        a71Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                    }
                    MediaDataController.getInstance(i14).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
                } else {
                    a71Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                a71Var2.e = null;
                a71Var2.d = null;
                a71Var2.setDrawable(null);
                z61 z61Var = a71Var2.J;
                if (z61Var != null) {
                    z61Var.setVisibility(8);
                    a71Var2.J.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i14).isPremium() && i13 == 14 && i1Var.b && i1Var.d) {
                a71Var2.b();
                a71Var2.J.setVisibility(0);
                a71Var2.setEmojicon(null);
                return;
            }
            if (i1Var.e) {
                a71Var2.setEmojicon(i1Var.f);
            } else {
                a71Var2.setEmojicon(null);
            }
            z61 z61Var2 = a71Var2.J;
            if (z61Var2 != null) {
                z61Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i15 == 4) {
            v61 v61Var = (v61) view;
            int i19 = r71Var.y0.get(i10);
            org.telegram.ui.Components.jy jyVar3 = (i19 < 0 || i19 >= arrayList5.size()) ? null : (org.telegram.ui.Components.jy) arrayList5.get(i19);
            if (i19 == -1) {
                r71Var.G = v61Var;
                v61Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (jyVar3 == null) {
                if (r71Var.G == v61Var) {
                    r71Var.G = null;
                    return;
                }
                return;
            } else {
                if (r71Var.G == v61Var) {
                    r71Var.G = null;
                }
                TextView textView2 = v61Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(jyVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i15 == 5) {
            u61 u61Var = (u61) view;
            int i20 = r71Var.z0.get(i10);
            if (i20 < 0 || i20 >= arrayList5.size() || (jyVar = (org.telegram.ui.Components.jy) arrayList5.get(i20)) == null) {
                return;
            }
            String str = jyVar.b.title;
            boolean z15 = (jyVar.e || UserConfig.getInstance(i14).isPremium()) ? false : true;
            boolean z16 = jyVar.f;
            org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(this, jyVar, i20, 16);
            sg.q0 q0Var = u61Var.c;
            FrameLayout frameLayout = u61Var.a;
            u61Var.d = str;
            if (z15) {
                i12 = 8;
                frameLayout.setVisibility(8);
                r92 = 0;
                q0Var.setVisibility(0);
                q0Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), saVar, false);
            } else {
                i12 = 8;
                r92 = 0;
                q0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(saVar);
            }
            if (z16) {
                formatString = LocaleController.getString(R.string.Added);
                z12 = true;
            } else {
                int i21 = R.string.AddStickersCount;
                z12 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = u61Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i21, objArr);
            }
            u61Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = u61Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                u61Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = u61Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                u61Var.n = null;
            }
            Boolean bool = u61Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                u61Var.h = Boolean.valueOf(z15);
                float f7 = z15 ? 1.0f : 0.0f;
                u61Var.f = f7;
                frameLayout.setAlpha(1.0f - f7);
                q0Var.setAlpha(u61Var.f);
                q0Var.setScaleX(u61Var.f);
                q0Var.setScaleY(u61Var.f);
                q0Var.setVisibility(u61Var.h.booleanValue() ? 0 : i12);
                return;
            }
            return;
        }
        if (i15 == 7 || i15 == 9) {
            return;
        }
        a71 a71Var3 = (a71) view;
        a71Var3.v = null;
        a71Var3.w = null;
        a71Var3.a = false;
        a71Var3.c = i10;
        a71Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i13 == 4 && r71Var.Q) || i13 == 6) {
            size = arrayList3.size();
        } else if (i13 == 4 || i13 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || r71Var.C0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (r71Var.a != -1 ? 1 : 0) + (r71Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                a71Var3.a = true;
                a71Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                a71Var3.e = null;
                a71Var3.d = null;
                a71Var3.Q = false;
                ImageReceiver imageReceiver2 = a71Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                b6Var = a71Var3.e;
                if (b6Var == null) {
                    org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) o61Var.b3.get(b6Var.getDocumentId());
                    if (s5Var == null) {
                        if (a71Var3.e.document != null) {
                            cacheType2 = r71Var.getCacheType();
                            s5Var = org.telegram.ui.Components.s5.m(i14, cacheType2, a71Var3.e.document);
                        } else {
                            cacheType = r71Var.getCacheType();
                            s5Var = org.telegram.ui.Components.s5.n(i14, a71Var3.e.getDocumentId(), null, cacheType);
                        }
                        o61Var.b3.put(a71Var3.e.getDocumentId(), s5Var);
                    }
                    a71Var3.setDrawable(s5Var);
                } else {
                    a71Var3.setDrawable(null);
                }
                a71Var3.d(z11, false);
            }
        }
        if (i13 == 13) {
            if ((i10 - (r71Var.a != -1 ? 1 : 0)) - (r71Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (r71Var.a != -1 ? 1 : 0)) - (r71Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                a71Var3.b = false;
                a71Var3.y = false;
                a71Var3.x = ah.i1.b(str2);
                a71Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                a71Var3.d(r71Var.J.contains(a71Var3.x), false);
                return;
            }
        }
        int i22 = r71Var.a;
        int i23 = i10 - (i22 != -1 ? 1 : 0);
        int i24 = r71Var.v;
        if (i23 - (i24 != -1 ? 1 : 0) < size) {
            int i25 = ((i10 - (i22 != -1 ? 1 : 0)) - (i24 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i13 == 4 && r71Var.Q) {
                a71Var3.c((TLRPC.Document) arrayList3.get(i25), o61Var);
            } else {
                if (i13 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i25);
                    a71Var3.c(document2, o61Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.b6 b6Var2 = (org.telegram.ui.Components.b6) arrayList4.get(i25);
                    a71Var3.e = b6Var2;
                    a71Var3.d = b6Var2 == null ? null : b6Var2.document;
                    z10 = b6Var2 != null && hashSet.contains(Long.valueOf(b6Var2.getDocumentId()));
                    a71Var3.Q = false;
                    ImageReceiver imageReceiver3 = a71Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - r71Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (r71Var.a != -1 ? 1 : 0)) - (r71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (r71Var.a != -1 ? 1 : 0)) - (r71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.b6 b6Var3 = (org.telegram.ui.Components.b6) arrayList2.get(((((i10 - (r71Var.a != -1 ? 1 : 0)) - (r71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            a71Var3.e = b6Var3;
                            a71Var3.d = b6Var3 == null ? null : b6Var3.document;
                            z10 = b6Var3 != null && hashSet.contains(Long.valueOf(b6Var3.getDocumentId()));
                            a71Var3.Q = false;
                            ImageReceiver imageReceiver4 = a71Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i26 = 0; i26 < sparseIntArray.size(); i26++) {
                    int keyAt = sparseIntArray.keyAt(i26);
                    int valueAt = sparseIntArray.valueAt(i26);
                    org.telegram.ui.Components.jy jyVar4 = valueAt >= 0 ? (org.telegram.ui.Components.jy) arrayList5.get(valueAt) : null;
                    if (jyVar4 != null) {
                        int size2 = jyVar4.h ? jyVar4.c.size() : Math.min(jyVar4.c.size(), 24);
                        int i27 = (i10 - keyAt) - 1;
                        if (i27 >= 0 && i27 < size2 && (document = (TLRPC.Document) jyVar4.c.get(i27)) != null) {
                            if (r71Var.Q) {
                                a71Var3.c(document, r71Var.i0);
                            } else {
                                a71Var3.Q = false;
                                ImageReceiver imageReceiver5 = a71Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                a71Var3.e = new org.telegram.ui.Components.b6(document, (Paint.FontMetricsInt) null);
                            }
                            a71Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.b6 b6Var4 = a71Var3.e;
                if (b6Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - r71Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                a71Var3.e = new org.telegram.ui.Components.b6(document3, (Paint.FontMetricsInt) null);
                a71Var3.d = document3;
                a71Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) zh.n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    a71Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = a71Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                a71Var3.Q = false;
                ImageReceiver imageReceiver6 = a71Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        b6Var = a71Var3.e;
        if (b6Var == null) {
        }
        a71Var3.d(z11, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        r71 r71Var = this.c;
        int i11 = r71Var.W;
        org.telegram.ui.ActionBar.c6 c6Var = r71Var.Z0;
        if (i10 == 0) {
            view = new w61(r71Var, r71Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(r71Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            a71 a71Var = new a71(r71Var, r71Var.getContext());
            if (i10 == 8) {
                a71Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(a71Var);
                a71Var.h = imageReceiver;
                a71Var.r = imageReceiver;
                imageReceiver.setImageBitmap(r71Var.N);
                r71Var.O = a71Var;
                a71Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = a71Var;
        } else if (i10 == 4) {
            Context context = r71Var.getContext();
            v61 v61Var = new v61(context);
            TextView textView = new TextView(context);
            v61Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(11.0f), r71Var.g1 ? org.telegram.ui.ActionBar.g6.v(r71Var.f1, org.telegram.ui.ActionBar.g6.m1(0.4f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false))) : i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            v61Var.addView(textView, w7.a6.e(-2, -2, 17));
            view = v61Var;
        } else if (i10 == 5) {
            u61 u61Var = new u61(r71Var.getContext());
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(u61Var.getContext(), false, false, false, 4);
            u61Var.b = u3Var;
            u3Var.b(0.3f, 250L, org.telegram.ui.Components.es.h);
            u3Var.setTextSize(AndroidUtilities.dp(14.0f));
            u3Var.setTypeface(AndroidUtilities.bold());
            u3Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
            u3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(u61Var.getContext());
            u61Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
            frameLayout.addView(u3Var, w7.a6.e(-1, -2, 17));
            u61Var.addView(frameLayout, w7.a6.d(-1.0f, -1));
            sg.q0 q0Var = new sg.q0(u61Var.getContext(), c6Var, false);
            u61Var.c = q0Var;
            q0Var.setIcon(R.raw.unlock_icon);
            u61Var.addView(q0Var, w7.a6.d(-1.0f, -1));
            view = u61Var;
        } else if (i10 == 6) {
            mn0 mn0Var = new mn0(r71Var.getContext(), 2);
            mn0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                mn0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                mn0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                mn0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            mn0Var.setGravity(17);
            mn0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.y6, c6Var));
            view = mn0Var;
        } else if (i10 == 7) {
            View t3Var = new org.telegram.ui.Cells.t3(r71Var.getContext(), 52);
            t3Var.setTag("searchbox");
            view = t3Var;
        } else {
            view = new a71(r71Var, r71Var.getContext());
        }
        if (r71.c(r71Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.wl0(view);
    }
}
