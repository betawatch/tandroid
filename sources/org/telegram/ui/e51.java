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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e51 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ f61 c;

    public e51(f61 f61Var) {
        this.c = f61Var;
    }

    @Override // org.telegram.ui.Components.mm0
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
        f61 f61Var = this.c;
        if (i10 == f61Var.a) {
            return 7;
        }
        if (i10 >= f61Var.b && i10 < f61Var.c) {
            return 1;
        }
        if (i10 >= f61Var.d && i10 < f61Var.e) {
            return 1;
        }
        if (i10 >= f61Var.E && i10 < f61Var.F) {
            return 1;
        }
        if (i10 >= f61Var.r && i10 < f61Var.s) {
            return 3;
        }
        if (f61Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (f61Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == f61Var.v) {
            return 6;
        }
        if (f61Var.w0.indexOfKey(i10) >= 0 || i10 == f61Var.f || i10 == f61Var.y || i10 == f61Var.n || i10 == f61Var.h || i10 == f61Var.x) {
            return 0;
        }
        return i10 == f61Var.w ? 8 : 3;
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
        f61 f61Var = this.c;
        ArrayList arrayList = f61Var.G0;
        ArrayList arrayList2 = f61Var.K0;
        ArrayList arrayList3 = f61Var.F0;
        SparseIntArray sparseIntArray = f61Var.w0;
        boolean z13 = f61Var.N0;
        ArrayList arrayList4 = f61Var.D0;
        int i13 = f61Var.W;
        ArrayList arrayList5 = f61Var.M0;
        c51 c51Var = f61Var.h0;
        HashSet hashSet = f61Var.K;
        ArrayList arrayList6 = f61Var.E0;
        int i14 = f61Var.V;
        int i15 = e1Var.f;
        View view = e1Var.a;
        if (i15 == 8) {
            o51 o51Var = (o51) view;
            o51Var.c = i10;
            o51Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = f61Var.V1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i15 == 6) {
            TextView textView = (TextView) view;
            if (f61Var.P0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i15 == 0) {
            k51 k51Var = (k51) view;
            if (i10 == f61Var.x) {
                k51Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                k51Var.c.setVisibility(8);
                return;
            }
            if (i10 == f61Var.f) {
                k51Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                k51Var.c.setVisibility(8);
                return;
            }
            if (i10 == f61Var.y) {
                k51Var.a(LocaleController.getString(R.string.StickerEffects), false);
                k51Var.c.setVisibility(8);
                return;
            }
            k51Var.c.setVisibility(8);
            if (i10 == f61Var.h) {
                k51Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == f61Var.n) {
                k51Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i16 = sparseIntArray.get(i10);
            if (i16 < 0) {
                k51Var.a(null, false);
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
            k51Var.a(eyVar2.b.title, z14);
            return;
        }
        if (i15 == 1) {
            o51 o51Var2 = (o51) view;
            o51Var2.c = i10;
            ImageReceiver imageReceiver = o51Var2.n;
            int i17 = f61Var.b;
            if (i10 < i17 || i10 >= f61Var.c) {
                int i18 = f61Var.E;
                x0Var = (i10 < i18 || i10 >= f61Var.F) ? (bh.x0) f61Var.H0.get(i10 - f61Var.d) : (bh.x0) f61Var.J0.get(i10 - i18);
            } else {
                x0Var = (bh.x0) f61Var.I0.get(i10 - i17);
            }
            if (i13 == 13) {
                o51Var2.b = false;
                o51Var2.y = true;
                o51Var2.x = x0Var;
                o51Var2.setDrawable(Emoji.getEmojiDrawable(x0Var.f));
                o51Var2.d(f61Var.J.contains(x0Var), false);
                return;
            }
            o51Var2.a(c51Var);
            o51Var2.y = true;
            o51Var2.x = x0Var;
            o51Var2.d(f61Var.J.contains(x0Var), false);
            o51Var2.b = false;
            if (x0Var.b || x0Var.f == null) {
                o51Var2.s = false;
                o51Var2.e = new org.telegram.ui.Components.c6(x0Var.g, (Paint.FontMetricsInt) null);
                o51Var2.d = null;
                o51Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) c51Var.l3.get(o51Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = f61Var.getCacheType();
                    if (cacheType3 == 3 && x0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.t5.n(i14, o51Var2.e.getDocumentId(), null, cacheType3);
                    c51Var.l3.put(o51Var2.e.getDocumentId(), drawable);
                }
                o51Var2.setDrawable(drawable);
            } else {
                o51Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i14).getReactionsMap().get(x0Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.y6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        bh.x0 x0Var2 = x0Var;
                        o51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", x0Var2, 0);
                        x0Var = x0Var2;
                    } else {
                        o51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", x0Var, 0);
                    }
                    MediaDataController.getInstance(i14).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), bh.s0.a());
                } else {
                    o51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                o51Var2.e = null;
                o51Var2.d = null;
                o51Var2.setDrawable(null);
                n51 n51Var = o51Var2.J;
                if (n51Var != null) {
                    n51Var.setVisibility(8);
                    o51Var2.J.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i14).isPremium() && i13 == 14 && x0Var.b && x0Var.d) {
                o51Var2.b();
                o51Var2.J.setVisibility(0);
                o51Var2.setEmojicon(null);
                return;
            }
            if (x0Var.e) {
                o51Var2.setEmojicon(x0Var.f);
            } else {
                o51Var2.setEmojicon(null);
            }
            n51 n51Var2 = o51Var2.J;
            if (n51Var2 != null) {
                n51Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i15 == 4) {
            j51 j51Var = (j51) view;
            int i19 = f61Var.y0.get(i10);
            org.telegram.ui.Components.ey eyVar3 = (i19 < 0 || i19 >= arrayList5.size()) ? null : (org.telegram.ui.Components.ey) arrayList5.get(i19);
            if (i19 == -1) {
                f61Var.G = j51Var;
                j51Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (eyVar3 == null) {
                if (f61Var.G == j51Var) {
                    f61Var.G = null;
                    return;
                }
                return;
            } else {
                if (f61Var.G == j51Var) {
                    f61Var.G = null;
                }
                TextView textView2 = j51Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(eyVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i15 == 5) {
            i51 i51Var = (i51) view;
            int i20 = f61Var.z0.get(i10);
            if (i20 < 0 || i20 >= arrayList5.size() || (eyVar = (org.telegram.ui.Components.ey) arrayList5.get(i20)) == null) {
                return;
            }
            String str = eyVar.b.title;
            boolean z15 = (eyVar.e || UserConfig.getInstance(i14).isPremium()) ? false : true;
            boolean z16 = eyVar.f;
            bi.pa paVar = new bi.pa(this, eyVar, i20, 18);
            tg.p0 p0Var = i51Var.c;
            FrameLayout frameLayout = i51Var.a;
            i51Var.d = str;
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
                objArr[r92] = i51Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i21, objArr);
            }
            i51Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = i51Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                i51Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = i51Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                i51Var.n = null;
            }
            Boolean bool = i51Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                i51Var.h = Boolean.valueOf(z15);
                float f7 = z15 ? 1.0f : 0.0f;
                i51Var.f = f7;
                frameLayout.setAlpha(1.0f - f7);
                p0Var.setAlpha(i51Var.f);
                p0Var.setScaleX(i51Var.f);
                p0Var.setScaleY(i51Var.f);
                p0Var.setVisibility(i51Var.h.booleanValue() ? 0 : i12);
                return;
            }
            return;
        }
        if (i15 == 7 || i15 == 9) {
            return;
        }
        o51 o51Var3 = (o51) view;
        o51Var3.v = null;
        o51Var3.w = null;
        o51Var3.a = false;
        o51Var3.c = i10;
        o51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i13 == 4 && f61Var.Q) || i13 == 6) {
            size = arrayList3.size();
        } else if (i13 == 4 || i13 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || f61Var.C0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (f61Var.a != -1 ? 1 : 0) + (f61Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                o51Var3.a = true;
                o51Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                o51Var3.e = null;
                o51Var3.d = null;
                o51Var3.Q = false;
                ImageReceiver imageReceiver2 = o51Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                c6Var = o51Var3.e;
                if (c6Var == null) {
                    org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) c51Var.l3.get(c6Var.getDocumentId());
                    if (t5Var == null) {
                        if (o51Var3.e.document != null) {
                            cacheType2 = f61Var.getCacheType();
                            t5Var = org.telegram.ui.Components.t5.m(i14, cacheType2, o51Var3.e.document);
                        } else {
                            cacheType = f61Var.getCacheType();
                            t5Var = org.telegram.ui.Components.t5.n(i14, o51Var3.e.getDocumentId(), null, cacheType);
                        }
                        c51Var.l3.put(o51Var3.e.getDocumentId(), t5Var);
                    }
                    o51Var3.setDrawable(t5Var);
                } else {
                    o51Var3.setDrawable(null);
                }
                o51Var3.d(z11, false);
            }
        }
        if (i13 == 13) {
            if ((i10 - (f61Var.a != -1 ? 1 : 0)) - (f61Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (f61Var.a != -1 ? 1 : 0)) - (f61Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                o51Var3.b = false;
                o51Var3.y = false;
                o51Var3.x = bh.x0.b(str2);
                o51Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                o51Var3.d(f61Var.J.contains(o51Var3.x), false);
                return;
            }
        }
        int i22 = f61Var.a;
        int i23 = i10 - (i22 != -1 ? 1 : 0);
        int i24 = f61Var.v;
        if (i23 - (i24 != -1 ? 1 : 0) < size) {
            int i25 = ((i10 - (i22 != -1 ? 1 : 0)) - (i24 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i13 == 4 && f61Var.Q) {
                o51Var3.c((TLRPC.Document) arrayList3.get(i25), c51Var);
            } else {
                if (i13 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i25);
                    o51Var3.c(document2, c51Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.c6 c6Var2 = (org.telegram.ui.Components.c6) arrayList4.get(i25);
                    o51Var3.e = c6Var2;
                    o51Var3.d = c6Var2 == null ? null : c6Var2.document;
                    z10 = c6Var2 != null && hashSet.contains(Long.valueOf(c6Var2.getDocumentId()));
                    o51Var3.Q = false;
                    ImageReceiver imageReceiver3 = o51Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - f61Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (f61Var.a != -1 ? 1 : 0)) - (f61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (f61Var.a != -1 ? 1 : 0)) - (f61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.c6 c6Var3 = (org.telegram.ui.Components.c6) arrayList2.get(((((i10 - (f61Var.a != -1 ? 1 : 0)) - (f61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            o51Var3.e = c6Var3;
                            o51Var3.d = c6Var3 == null ? null : c6Var3.document;
                            z10 = c6Var3 != null && hashSet.contains(Long.valueOf(c6Var3.getDocumentId()));
                            o51Var3.Q = false;
                            ImageReceiver imageReceiver4 = o51Var3.h;
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
                            if (f61Var.Q) {
                                o51Var3.c(document, f61Var.i0);
                            } else {
                                o51Var3.Q = false;
                                ImageReceiver imageReceiver5 = o51Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                o51Var3.e = new org.telegram.ui.Components.c6(document, (Paint.FontMetricsInt) null);
                            }
                            o51Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.c6 c6Var4 = o51Var3.e;
                if (c6Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - f61Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                o51Var3.e = new org.telegram.ui.Components.c6(document3, (Paint.FontMetricsInt) null);
                o51Var3.d = document3;
                o51Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) bi.ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    o51Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = o51Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                o51Var3.Q = false;
                ImageReceiver imageReceiver6 = o51Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        c6Var = o51Var3.e;
        if (c6Var == null) {
        }
        o51Var3.d(z11, false);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        f61 f61Var = this.c;
        int i11 = f61Var.W;
        org.telegram.ui.ActionBar.u6 u6Var = f61Var.Z0;
        if (i10 == 0) {
            view = new k51(f61Var, f61Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(f61Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            o51 o51Var = new o51(f61Var, f61Var.getContext());
            if (i10 == 8) {
                o51Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(o51Var);
                o51Var.h = imageReceiver;
                o51Var.r = imageReceiver;
                imageReceiver.setImageBitmap(f61Var.N);
                f61Var.O = o51Var;
                o51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = o51Var;
        } else if (i10 == 4) {
            Context context = f61Var.getContext();
            j51 j51Var = new j51(context);
            TextView textView = new TextView(context);
            j51Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            int v = f61Var.g1 ? org.telegram.ui.ActionBar.y6.v(f61Var.f1, org.telegram.ui.ActionBar.y6.o1(0.4f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false))) : i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Te, false), 99);
            if (f61Var.g1) {
                textView.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(11.0f), v));
            } else {
                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(11.0f), v);
                org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Te, 99);
                textView.setBackground(c02);
                org.telegram.ui.ActionBar.f7.k(textView, c02, h, null, null);
            }
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            j51Var.addView(textView, org.telegram.ui.Components.kb1.i(-2, -2, 17));
            view = j51Var;
        } else if (i10 == 5) {
            i51 i51Var = new i51(f61Var.getContext());
            org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(i51Var.getContext(), false, false, false, 4);
            i51Var.b = y3Var;
            y3Var.b(0.3f, 250L, org.telegram.ui.Components.ds.h);
            y3Var.setTextSize(AndroidUtilities.dp(14.0f));
            y3Var.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.f7.Z(y3Var, org.telegram.ui.ActionBar.y6.Sh, u6Var);
            y3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(i51Var.getContext());
            i51Var.a = frameLayout;
            int i12 = org.telegram.ui.ActionBar.y6.Oh;
            org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.o6.e(new float[]{8.0f}, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
            org.telegram.ui.ActionBar.b7 f7 = org.telegram.ui.ActionBar.f7.f(i12);
            frameLayout.setBackground(e);
            org.telegram.ui.ActionBar.f7.k(frameLayout, e, N, f7, u6Var);
            frameLayout.addView(y3Var, org.telegram.ui.Components.kb1.i(-1, -2, 17));
            i51Var.addView(frameLayout, org.telegram.ui.Components.kb1.g(-1.0f, -1));
            tg.p0 p0Var = new tg.p0(i51Var.getContext(), u6Var, false);
            i51Var.c = p0Var;
            p0Var.setIcon(R.raw.unlock_icon);
            i51Var.addView(p0Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
            view = i51Var;
        } else if (i10 == 6) {
            dn0 dn0Var = new dn0(f61Var.getContext(), 2);
            dn0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                dn0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                dn0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                dn0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            dn0Var.setGravity(17);
            org.telegram.ui.ActionBar.f7.V(dn0Var, org.telegram.ui.ActionBar.y6.y6, u6Var);
            view = dn0Var;
        } else if (i10 == 7) {
            View x3Var = new org.telegram.ui.Cells.x3(f61Var.getContext(), 52);
            x3Var.setTag("searchbox");
            view = x3Var;
        } else {
            view = new o51(f61Var, f61Var.getContext());
        }
        if (f61.c(f61Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.wl0(view);
    }
}
