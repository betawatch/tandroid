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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class a51 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ b61 c;

    public a51(b61 b61Var) {
        this.c = b61Var;
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
        b61 b61Var = this.c;
        if (i10 == b61Var.a) {
            return 7;
        }
        if (i10 >= b61Var.b && i10 < b61Var.c) {
            return 1;
        }
        if (i10 >= b61Var.d && i10 < b61Var.e) {
            return 1;
        }
        if (i10 >= b61Var.E && i10 < b61Var.F) {
            return 1;
        }
        if (i10 >= b61Var.r && i10 < b61Var.s) {
            return 3;
        }
        if (b61Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (b61Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == b61Var.v) {
            return 6;
        }
        if (b61Var.w0.indexOfKey(i10) >= 0 || i10 == b61Var.f || i10 == b61Var.y || i10 == b61Var.n || i10 == b61Var.h || i10 == b61Var.x) {
            return 0;
        }
        return i10 == b61Var.w ? 8 : 3;
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
        org.telegram.ui.Components.a6 a6Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.fy fyVar;
        int i12;
        ?? r92;
        boolean z12;
        String formatString;
        ah.i1 i1Var;
        int cacheType3;
        b61 b61Var = this.c;
        ArrayList arrayList = b61Var.G0;
        ArrayList arrayList2 = b61Var.K0;
        ArrayList arrayList3 = b61Var.F0;
        SparseIntArray sparseIntArray = b61Var.w0;
        boolean z13 = b61Var.N0;
        ArrayList arrayList4 = b61Var.D0;
        int i13 = b61Var.W;
        ArrayList arrayList5 = b61Var.M0;
        y41 y41Var = b61Var.h0;
        HashSet hashSet = b61Var.K;
        ArrayList arrayList6 = b61Var.E0;
        int i14 = b61Var.V;
        int i15 = b1Var.f;
        View view = b1Var.a;
        if (i15 == 8) {
            k51 k51Var = (k51) view;
            k51Var.c = i10;
            k51Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = b61Var.V1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i15 == 6) {
            TextView textView = (TextView) view;
            if (b61Var.P0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i15 == 0) {
            g51 g51Var = (g51) view;
            if (i10 == b61Var.x) {
                g51Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                g51Var.c.setVisibility(8);
                return;
            }
            if (i10 == b61Var.f) {
                g51Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                g51Var.c.setVisibility(8);
                return;
            }
            if (i10 == b61Var.y) {
                g51Var.a(LocaleController.getString(R.string.StickerEffects), false);
                g51Var.c.setVisibility(8);
                return;
            }
            g51Var.c.setVisibility(8);
            if (i10 == b61Var.h) {
                g51Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == b61Var.n) {
                g51Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i16 = sparseIntArray.get(i10);
            if (i16 < 0) {
                g51Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.fy fyVar2 = (org.telegram.ui.Components.fy) arrayList5.get(i16);
            if (fyVar2.d != null) {
                MediaDataController.getInstance(i14).getStickerSet(fyVar2.d, false);
                fyVar2.d = null;
            }
            if (i13 != 5 && i13 != 7 && i13 != 6 && !fyVar2.e && !UserConfig.getInstance(i14).isPremium()) {
                z14 = true;
            }
            g51Var.a(fyVar2.b.title, z14);
            return;
        }
        if (i15 == 1) {
            k51 k51Var2 = (k51) view;
            k51Var2.c = i10;
            ImageReceiver imageReceiver = k51Var2.n;
            int i17 = b61Var.b;
            if (i10 < i17 || i10 >= b61Var.c) {
                int i18 = b61Var.E;
                i1Var = (i10 < i18 || i10 >= b61Var.F) ? (ah.i1) b61Var.H0.get(i10 - b61Var.d) : (ah.i1) b61Var.J0.get(i10 - i18);
            } else {
                i1Var = (ah.i1) b61Var.I0.get(i10 - i17);
            }
            if (i13 == 13) {
                k51Var2.b = false;
                k51Var2.y = true;
                k51Var2.x = i1Var;
                k51Var2.setDrawable(Emoji.getEmojiDrawable(i1Var.f));
                k51Var2.d(b61Var.J.contains(i1Var), false);
                return;
            }
            k51Var2.a(y41Var);
            k51Var2.y = true;
            k51Var2.x = i1Var;
            k51Var2.d(b61Var.J.contains(i1Var), false);
            k51Var2.b = false;
            if (i1Var.b || i1Var.f == null) {
                k51Var2.s = false;
                k51Var2.e = new org.telegram.ui.Components.a6(i1Var.g, (Paint.FontMetricsInt) null);
                k51Var2.d = null;
                k51Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) y41Var.e3.get(k51Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = b61Var.getCacheType();
                    if (cacheType3 == 3 && i1Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.r5.n(i14, k51Var2.e.getDocumentId(), null, cacheType3);
                    y41Var.e3.put(k51Var2.e.getDocumentId(), drawable);
                }
                k51Var2.setDrawable(drawable);
            } else {
                k51Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i14).getReactionsMap().get(i1Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.k6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        ah.i1 i1Var2 = i1Var;
                        k51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", i1Var2, 0);
                        i1Var = i1Var2;
                    } else {
                        k51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                    }
                    MediaDataController.getInstance(i14).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
                } else {
                    k51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                k51Var2.e = null;
                k51Var2.d = null;
                k51Var2.setDrawable(null);
                j51 j51Var = k51Var2.J;
                if (j51Var != null) {
                    j51Var.setVisibility(8);
                    k51Var2.J.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i14).isPremium() && i13 == 14 && i1Var.b && i1Var.d) {
                k51Var2.b();
                k51Var2.J.setVisibility(0);
                k51Var2.setEmojicon(null);
                return;
            }
            if (i1Var.e) {
                k51Var2.setEmojicon(i1Var.f);
            } else {
                k51Var2.setEmojicon(null);
            }
            j51 j51Var2 = k51Var2.J;
            if (j51Var2 != null) {
                j51Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i15 == 4) {
            f51 f51Var = (f51) view;
            int i19 = b61Var.y0.get(i10);
            org.telegram.ui.Components.fy fyVar3 = (i19 < 0 || i19 >= arrayList5.size()) ? null : (org.telegram.ui.Components.fy) arrayList5.get(i19);
            if (i19 == -1) {
                b61Var.G = f51Var;
                f51Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (fyVar3 == null) {
                if (b61Var.G == f51Var) {
                    b61Var.G = null;
                    return;
                }
                return;
            } else {
                if (b61Var.G == f51Var) {
                    b61Var.G = null;
                }
                TextView textView2 = f51Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(fyVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i15 == 5) {
            e51 e51Var = (e51) view;
            int i20 = b61Var.z0.get(i10);
            if (i20 < 0 || i20 >= arrayList5.size() || (fyVar = (org.telegram.ui.Components.fy) arrayList5.get(i20)) == null) {
                return;
            }
            String str = fyVar.b.title;
            boolean z15 = (fyVar.e || UserConfig.getInstance(i14).isPremium()) ? false : true;
            boolean z16 = fyVar.f;
            ai.ia iaVar = new ai.ia(this, fyVar, i20, 17);
            sg.p0 p0Var = e51Var.c;
            FrameLayout frameLayout = e51Var.a;
            e51Var.d = str;
            if (z15) {
                i12 = 8;
                frameLayout.setVisibility(8);
                r92 = 0;
                p0Var.setVisibility(0);
                p0Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), iaVar, false);
            } else {
                i12 = 8;
                r92 = 0;
                p0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(iaVar);
            }
            if (z16) {
                formatString = LocaleController.getString(R.string.Added);
                z12 = true;
            } else {
                int i21 = R.string.AddStickersCount;
                z12 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = e51Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i21, objArr);
            }
            e51Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = e51Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                e51Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = e51Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                e51Var.n = null;
            }
            Boolean bool = e51Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                e51Var.h = Boolean.valueOf(z15);
                float f7 = z15 ? 1.0f : 0.0f;
                e51Var.f = f7;
                frameLayout.setAlpha(1.0f - f7);
                p0Var.setAlpha(e51Var.f);
                p0Var.setScaleX(e51Var.f);
                p0Var.setScaleY(e51Var.f);
                p0Var.setVisibility(e51Var.h.booleanValue() ? 0 : i12);
                return;
            }
            return;
        }
        if (i15 == 7 || i15 == 9) {
            return;
        }
        k51 k51Var3 = (k51) view;
        k51Var3.v = null;
        k51Var3.w = null;
        k51Var3.a = false;
        k51Var3.c = i10;
        k51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i13 == 4 && b61Var.Q) || i13 == 6) {
            size = arrayList3.size();
        } else if (i13 == 4 || i13 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || b61Var.C0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (b61Var.a != -1 ? 1 : 0) + (b61Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                k51Var3.a = true;
                k51Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                k51Var3.e = null;
                k51Var3.d = null;
                k51Var3.Q = false;
                ImageReceiver imageReceiver2 = k51Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                a6Var = k51Var3.e;
                if (a6Var == null) {
                    org.telegram.ui.Components.r5 r5Var = (org.telegram.ui.Components.r5) y41Var.e3.get(a6Var.getDocumentId());
                    if (r5Var == null) {
                        if (k51Var3.e.document != null) {
                            cacheType2 = b61Var.getCacheType();
                            r5Var = org.telegram.ui.Components.r5.m(i14, cacheType2, k51Var3.e.document);
                        } else {
                            cacheType = b61Var.getCacheType();
                            r5Var = org.telegram.ui.Components.r5.n(i14, k51Var3.e.getDocumentId(), null, cacheType);
                        }
                        y41Var.e3.put(k51Var3.e.getDocumentId(), r5Var);
                    }
                    k51Var3.setDrawable(r5Var);
                } else {
                    k51Var3.setDrawable(null);
                }
                k51Var3.d(z11, false);
            }
        }
        if (i13 == 13) {
            if ((i10 - (b61Var.a != -1 ? 1 : 0)) - (b61Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (b61Var.a != -1 ? 1 : 0)) - (b61Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                k51Var3.b = false;
                k51Var3.y = false;
                k51Var3.x = ah.i1.b(str2);
                k51Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                k51Var3.d(b61Var.J.contains(k51Var3.x), false);
                return;
            }
        }
        int i22 = b61Var.a;
        int i23 = i10 - (i22 != -1 ? 1 : 0);
        int i24 = b61Var.v;
        if (i23 - (i24 != -1 ? 1 : 0) < size) {
            int i25 = ((i10 - (i22 != -1 ? 1 : 0)) - (i24 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i13 == 4 && b61Var.Q) {
                k51Var3.c((TLRPC.Document) arrayList3.get(i25), y41Var);
            } else {
                if (i13 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i25);
                    k51Var3.c(document2, y41Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.a6 a6Var2 = (org.telegram.ui.Components.a6) arrayList4.get(i25);
                    k51Var3.e = a6Var2;
                    k51Var3.d = a6Var2 == null ? null : a6Var2.document;
                    z10 = a6Var2 != null && hashSet.contains(Long.valueOf(a6Var2.getDocumentId()));
                    k51Var3.Q = false;
                    ImageReceiver imageReceiver3 = k51Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - b61Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (b61Var.a != -1 ? 1 : 0)) - (b61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (b61Var.a != -1 ? 1 : 0)) - (b61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.a6 a6Var3 = (org.telegram.ui.Components.a6) arrayList2.get(((((i10 - (b61Var.a != -1 ? 1 : 0)) - (b61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            k51Var3.e = a6Var3;
                            k51Var3.d = a6Var3 == null ? null : a6Var3.document;
                            z10 = a6Var3 != null && hashSet.contains(Long.valueOf(a6Var3.getDocumentId()));
                            k51Var3.Q = false;
                            ImageReceiver imageReceiver4 = k51Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i26 = 0; i26 < sparseIntArray.size(); i26++) {
                    int keyAt = sparseIntArray.keyAt(i26);
                    int valueAt = sparseIntArray.valueAt(i26);
                    org.telegram.ui.Components.fy fyVar4 = valueAt >= 0 ? (org.telegram.ui.Components.fy) arrayList5.get(valueAt) : null;
                    if (fyVar4 != null) {
                        int size2 = fyVar4.h ? fyVar4.c.size() : Math.min(fyVar4.c.size(), 24);
                        int i27 = (i10 - keyAt) - 1;
                        if (i27 >= 0 && i27 < size2 && (document = (TLRPC.Document) fyVar4.c.get(i27)) != null) {
                            if (b61Var.Q) {
                                k51Var3.c(document, b61Var.i0);
                            } else {
                                k51Var3.Q = false;
                                ImageReceiver imageReceiver5 = k51Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                k51Var3.e = new org.telegram.ui.Components.a6(document, (Paint.FontMetricsInt) null);
                            }
                            k51Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.a6 a6Var4 = k51Var3.e;
                if (a6Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - b61Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                k51Var3.e = new org.telegram.ui.Components.a6(document3, (Paint.FontMetricsInt) null);
                k51Var3.d = document3;
                k51Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ai.ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    k51Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = k51Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                k51Var3.Q = false;
                ImageReceiver imageReceiver6 = k51Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        a6Var = k51Var3.e;
        if (a6Var == null) {
        }
        k51Var3.d(z11, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        b61 b61Var = this.c;
        int i11 = b61Var.W;
        org.telegram.ui.ActionBar.g6 g6Var = b61Var.Z0;
        if (i10 == 0) {
            view = new g51(b61Var, b61Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(b61Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            k51 k51Var = new k51(b61Var, b61Var.getContext());
            if (i10 == 8) {
                k51Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(k51Var);
                k51Var.h = imageReceiver;
                k51Var.r = imageReceiver;
                imageReceiver.setImageBitmap(b61Var.N);
                b61Var.O = k51Var;
                k51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = k51Var;
        } else if (i10 == 4) {
            Context context = b61Var.getContext();
            f51 f51Var = new f51(context);
            TextView textView = new TextView(context);
            f51Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            int v = b61Var.g1 ? org.telegram.ui.ActionBar.k6.v(b61Var.f1, org.telegram.ui.ActionBar.k6.o1(0.4f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false))) : i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Te, false), 99);
            if (b61Var.g1) {
                textView.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(11.0f), v));
            } else {
                ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(11.0f), v);
                org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Te, 99);
                textView.setBackground(c02);
                org.telegram.ui.ActionBar.r6.k(textView, c02, h, null, null);
            }
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            f51Var.addView(textView, w7.z5.e(-2, -2, 17));
            view = f51Var;
        } else if (i10 == 5) {
            e51 e51Var = new e51(b61Var.getContext());
            org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(e51Var.getContext(), false, false, false, 4);
            e51Var.b = t3Var;
            t3Var.b(0.3f, 250L, org.telegram.ui.Components.bs.h);
            t3Var.setTextSize(AndroidUtilities.dp(14.0f));
            t3Var.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.r6.a0(t3Var, org.telegram.ui.ActionBar.k6.Sh, g6Var);
            t3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(e51Var.getContext());
            e51Var.a = frameLayout;
            int i12 = org.telegram.ui.ActionBar.k6.Oh;
            org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.a6.e(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
            org.telegram.ui.ActionBar.n6 f7 = org.telegram.ui.ActionBar.r6.f(i12);
            frameLayout.setBackground(e);
            org.telegram.ui.ActionBar.r6.k(frameLayout, e, O, f7, g6Var);
            frameLayout.addView(t3Var, w7.z5.e(-1, -2, 17));
            e51Var.addView(frameLayout, w7.z5.c(-1.0f, -1));
            sg.p0 p0Var = new sg.p0(e51Var.getContext(), g6Var, false);
            e51Var.c = p0Var;
            p0Var.setIcon(R.raw.unlock_icon);
            e51Var.addView(p0Var, w7.z5.c(-1.0f, -1));
            view = e51Var;
        } else if (i10 == 6) {
            tm0 tm0Var = new tm0(b61Var.getContext(), 2);
            tm0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                tm0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                tm0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                tm0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            tm0Var.setGravity(17);
            org.telegram.ui.ActionBar.r6.W(tm0Var, org.telegram.ui.ActionBar.k6.y6, g6Var);
            view = tm0Var;
        } else if (i10 == 7) {
            View s3Var = new org.telegram.ui.Cells.s3(b61Var.getContext(), 52);
            s3Var.setTag("searchbox");
            view = s3Var;
        } else {
            view = new k51(b61Var, b61Var.getContext());
        }
        if (b61.c(b61Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.wl0(view);
    }
}
