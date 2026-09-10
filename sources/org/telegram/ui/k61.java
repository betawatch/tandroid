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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k61 extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ l71 c;

    public k61(l71 l71Var) {
        this.c = l71Var;
    }

    @Override // org.telegram.ui.Components.ul0
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
        l71 l71Var = this.c;
        if (i10 == l71Var.a) {
            return 7;
        }
        if (i10 >= l71Var.b && i10 < l71Var.c) {
            return 1;
        }
        if (i10 >= l71Var.d && i10 < l71Var.e) {
            return 1;
        }
        if (i10 >= l71Var.E && i10 < l71Var.F) {
            return 1;
        }
        if (i10 >= l71Var.r && i10 < l71Var.s) {
            return 3;
        }
        if (l71Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (l71Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == l71Var.v) {
            return 6;
        }
        if (l71Var.w0.indexOfKey(i10) >= 0 || i10 == l71Var.f || i10 == l71Var.y || i10 == l71Var.n || i10 == l71Var.h || i10 == l71Var.x) {
            return 0;
        }
        return i10 == l71Var.w ? 8 : 3;
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
        org.telegram.ui.Components.y5 y5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.dy dyVar;
        ?? r92;
        boolean z12;
        String formatString;
        yg.p0 p0Var;
        int cacheType3;
        l71 l71Var = this.c;
        ArrayList arrayList = l71Var.G0;
        ArrayList arrayList2 = l71Var.K0;
        ArrayList arrayList3 = l71Var.F0;
        SparseIntArray sparseIntArray = l71Var.w0;
        boolean z13 = l71Var.N0;
        ArrayList arrayList4 = l71Var.D0;
        int i12 = l71Var.W;
        ArrayList arrayList5 = l71Var.M0;
        i61 i61Var = l71Var.h0;
        HashSet hashSet = l71Var.K;
        ArrayList arrayList6 = l71Var.E0;
        int i13 = l71Var.V;
        int i14 = c1Var.f;
        View view = c1Var.a;
        if (i14 == 8) {
            u61 u61Var = (u61) view;
            u61Var.c = i10;
            u61Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = l71Var.U1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i14 == 6) {
            TextView textView = (TextView) view;
            if (l71Var.P0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i14 == 0) {
            q61 q61Var = (q61) view;
            if (i10 == l71Var.x) {
                q61Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                q61Var.c.setVisibility(8);
                return;
            }
            if (i10 == l71Var.f) {
                q61Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                q61Var.c.setVisibility(8);
                return;
            }
            if (i10 == l71Var.y) {
                q61Var.a(LocaleController.getString(R.string.StickerEffects), false);
                q61Var.c.setVisibility(8);
                return;
            }
            q61Var.c.setVisibility(8);
            if (i10 == l71Var.h) {
                q61Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == l71Var.n) {
                q61Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i15 = sparseIntArray.get(i10);
            if (i15 < 0) {
                q61Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.dy dyVar2 = (org.telegram.ui.Components.dy) arrayList5.get(i15);
            if (dyVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(dyVar2.d, false);
                dyVar2.d = null;
            }
            if (i12 != 5 && i12 != 7 && i12 != 6 && !dyVar2.e && !UserConfig.getInstance(i13).isPremium()) {
                z14 = true;
            }
            q61Var.a(dyVar2.b.title, z14);
            return;
        }
        if (i14 == 1) {
            u61 u61Var2 = (u61) view;
            u61Var2.c = i10;
            ImageReceiver imageReceiver = u61Var2.n;
            int i16 = l71Var.b;
            if (i10 < i16 || i10 >= l71Var.c) {
                int i17 = l71Var.E;
                p0Var = (i10 < i17 || i10 >= l71Var.F) ? (yg.p0) l71Var.H0.get(i10 - l71Var.d) : (yg.p0) l71Var.J0.get(i10 - i17);
            } else {
                p0Var = (yg.p0) l71Var.I0.get(i10 - i16);
            }
            if (i12 == 13) {
                u61Var2.b = false;
                u61Var2.y = true;
                u61Var2.x = p0Var;
                u61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var.f));
                u61Var2.d(l71Var.J.contains(p0Var), false);
                return;
            }
            u61Var2.a(i61Var);
            u61Var2.y = true;
            u61Var2.x = p0Var;
            u61Var2.d(l71Var.J.contains(p0Var), false);
            u61Var2.b = false;
            if (p0Var.b || p0Var.f == null) {
                u61Var2.s = false;
                u61Var2.e = new org.telegram.ui.Components.y5(p0Var.g, (Paint.FontMetricsInt) null);
                u61Var2.d = null;
                u61Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) i61Var.d3.get(u61Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = l71Var.getCacheType();
                    if (cacheType3 == 3 && p0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.p5.n(i13, u61Var2.e.getDocumentId(), null, cacheType3);
                    i61Var.d3.put(u61Var2.e.getDocumentId(), drawable);
                }
                u61Var2.setDrawable(drawable);
            } else {
                u61Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(p0Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        yg.p0 p0Var2 = p0Var;
                        u61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    } else {
                        u61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                    }
                    MediaDataController.getInstance(i13).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), yg.l0.a());
                } else {
                    u61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                u61Var2.e = null;
                u61Var2.d = null;
                u61Var2.setDrawable(null);
                t61 t61Var = u61Var2.J;
                if (t61Var != null) {
                    t61Var.setVisibility(8);
                    u61Var2.J.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i13).isPremium() && i12 == 14 && p0Var.b && p0Var.d) {
                u61Var2.b();
                u61Var2.J.setVisibility(0);
                u61Var2.setEmojicon(null);
                return;
            }
            if (p0Var.e) {
                u61Var2.setEmojicon(p0Var.f);
            } else {
                u61Var2.setEmojicon(null);
            }
            t61 t61Var2 = u61Var2.J;
            if (t61Var2 != null) {
                t61Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i14 == 4) {
            p61 p61Var = (p61) view;
            int i18 = l71Var.y0.get(i10);
            org.telegram.ui.Components.dy dyVar3 = (i18 < 0 || i18 >= arrayList5.size()) ? null : (org.telegram.ui.Components.dy) arrayList5.get(i18);
            if (i18 == -1) {
                l71Var.G = p61Var;
                p61Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (dyVar3 == null) {
                if (l71Var.G == p61Var) {
                    l71Var.G = null;
                    return;
                }
                return;
            } else {
                if (l71Var.G == p61Var) {
                    l71Var.G = null;
                }
                TextView textView2 = p61Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(dyVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i14 == 5) {
            o61 o61Var = (o61) view;
            int i19 = l71Var.z0.get(i10);
            if (i19 < 0 || i19 >= arrayList5.size() || (dyVar = (org.telegram.ui.Components.dy) arrayList5.get(i19)) == null) {
                return;
            }
            String str = dyVar.b.title;
            boolean z15 = (dyVar.e || UserConfig.getInstance(i13).isPremium()) ? false : true;
            boolean z16 = dyVar.f;
            org.telegram.ui.Cells.wa waVar = new org.telegram.ui.Cells.wa(this, dyVar, i19, 15);
            qg.s0 s0Var = o61Var.c;
            FrameLayout frameLayout = o61Var.a;
            o61Var.d = str;
            if (z15) {
                frameLayout.setVisibility(8);
                r92 = 0;
                s0Var.setVisibility(0);
                s0Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), waVar, false);
            } else {
                r92 = 0;
                s0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(waVar);
            }
            if (z16) {
                formatString = LocaleController.getString(R.string.Added);
                z12 = true;
            } else {
                int i20 = R.string.AddStickersCount;
                z12 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = o61Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i20, objArr);
            }
            o61Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = o61Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                o61Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = o61Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                o61Var.n = null;
            }
            Boolean bool = o61Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                o61Var.h = Boolean.valueOf(z15);
                float f7 = z15 ? 1.0f : 0.0f;
                o61Var.f = f7;
                frameLayout.setAlpha(1.0f - f7);
                s0Var.setAlpha(o61Var.f);
                s0Var.setScaleX(o61Var.f);
                s0Var.setScaleY(o61Var.f);
                s0Var.setVisibility(o61Var.h.booleanValue() ? 0 : 8);
                return;
            }
            return;
        }
        if (i14 == 7 || i14 == 9) {
            return;
        }
        u61 u61Var3 = (u61) view;
        u61Var3.v = null;
        u61Var3.w = null;
        u61Var3.a = false;
        u61Var3.c = i10;
        u61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i12 == 4 && l71Var.Q) || i12 == 6) {
            size = arrayList3.size();
        } else if (i12 == 4 || i12 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || l71Var.C0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (l71Var.a != -1 ? 1 : 0) + (l71Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                u61Var3.a = true;
                u61Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                u61Var3.e = null;
                u61Var3.d = null;
                u61Var3.Q = false;
                ImageReceiver imageReceiver2 = u61Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                y5Var = u61Var3.e;
                if (y5Var == null) {
                    org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) i61Var.d3.get(y5Var.getDocumentId());
                    if (p5Var == null) {
                        if (u61Var3.e.document != null) {
                            cacheType2 = l71Var.getCacheType();
                            p5Var = org.telegram.ui.Components.p5.m(i13, cacheType2, u61Var3.e.document);
                        } else {
                            cacheType = l71Var.getCacheType();
                            p5Var = org.telegram.ui.Components.p5.n(i13, u61Var3.e.getDocumentId(), null, cacheType);
                        }
                        i61Var.d3.put(u61Var3.e.getDocumentId(), p5Var);
                    }
                    u61Var3.setDrawable(p5Var);
                } else {
                    u61Var3.setDrawable(null);
                }
                u61Var3.d(z11, false);
            }
        }
        if (i12 == 13) {
            if ((i10 - (l71Var.a != -1 ? 1 : 0)) - (l71Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (l71Var.a != -1 ? 1 : 0)) - (l71Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                u61Var3.b = false;
                u61Var3.y = false;
                u61Var3.x = yg.p0.b(str2);
                u61Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                u61Var3.d(l71Var.J.contains(u61Var3.x), false);
                return;
            }
        }
        int i21 = l71Var.a;
        int i22 = i10 - (i21 != -1 ? 1 : 0);
        int i23 = l71Var.v;
        if (i22 - (i23 != -1 ? 1 : 0) < size) {
            int i24 = ((i10 - (i21 != -1 ? 1 : 0)) - (i23 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i12 == 4 && l71Var.Q) {
                u61Var3.c((TLRPC.Document) arrayList3.get(i24), i61Var);
            } else {
                if (i12 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i24);
                    u61Var3.c(document2, i61Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.y5 y5Var2 = (org.telegram.ui.Components.y5) arrayList4.get(i24);
                    u61Var3.e = y5Var2;
                    u61Var3.d = y5Var2 == null ? null : y5Var2.document;
                    z10 = y5Var2 != null && hashSet.contains(Long.valueOf(y5Var2.getDocumentId()));
                    u61Var3.Q = false;
                    ImageReceiver imageReceiver3 = u61Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - l71Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (l71Var.a != -1 ? 1 : 0)) - (l71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (l71Var.a != -1 ? 1 : 0)) - (l71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.y5 y5Var3 = (org.telegram.ui.Components.y5) arrayList2.get(((((i10 - (l71Var.a != -1 ? 1 : 0)) - (l71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            u61Var3.e = y5Var3;
                            u61Var3.d = y5Var3 == null ? null : y5Var3.document;
                            z10 = y5Var3 != null && hashSet.contains(Long.valueOf(y5Var3.getDocumentId()));
                            u61Var3.Q = false;
                            ImageReceiver imageReceiver4 = u61Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i25 = 0; i25 < sparseIntArray.size(); i25++) {
                    int keyAt = sparseIntArray.keyAt(i25);
                    int valueAt = sparseIntArray.valueAt(i25);
                    org.telegram.ui.Components.dy dyVar4 = valueAt >= 0 ? (org.telegram.ui.Components.dy) arrayList5.get(valueAt) : null;
                    if (dyVar4 != null) {
                        int size2 = dyVar4.h ? dyVar4.c.size() : Math.min(dyVar4.c.size(), 24);
                        int i26 = (i10 - keyAt) - 1;
                        if (i26 >= 0 && i26 < size2 && (document = (TLRPC.Document) dyVar4.c.get(i26)) != null) {
                            if (l71Var.Q) {
                                u61Var3.c(document, l71Var.i0);
                            } else {
                                u61Var3.Q = false;
                                ImageReceiver imageReceiver5 = u61Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                u61Var3.e = new org.telegram.ui.Components.y5(document, (Paint.FontMetricsInt) null);
                            }
                            u61Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.y5 y5Var4 = u61Var3.e;
                if (y5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - l71Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                u61Var3.e = new org.telegram.ui.Components.y5(document3, (Paint.FontMetricsInt) null);
                u61Var3.d = document3;
                u61Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) xh.v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    u61Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = u61Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                u61Var3.Q = false;
                ImageReceiver imageReceiver6 = u61Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        y5Var = u61Var3.e;
        if (y5Var == null) {
        }
        u61Var3.d(z11, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        l71 l71Var = this.c;
        int i11 = l71Var.W;
        org.telegram.ui.ActionBar.f6 f6Var = l71Var.Z0;
        if (i10 == 0) {
            view = new q61(l71Var, l71Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(l71Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            u61 u61Var = new u61(l71Var, l71Var.getContext());
            if (i10 == 8) {
                u61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(u61Var);
                u61Var.h = imageReceiver;
                u61Var.r = imageReceiver;
                imageReceiver.setImageBitmap(l71Var.N);
                l71Var.O = u61Var;
                u61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = u61Var;
        } else if (i10 == 4) {
            Context context = l71Var.getContext();
            p61 p61Var = new p61(context);
            TextView textView = new TextView(context);
            p61Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), l71Var.g1 ? org.telegram.ui.ActionBar.j6.v(l71Var.f1, org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false))) : i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            p61Var.addView(textView, w7.a6.e(-2, -2, 17));
            view = p61Var;
        } else if (i10 == 5) {
            o61 o61Var = new o61(l71Var.getContext());
            org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(o61Var.getContext(), false, false, false, 4);
            o61Var.b = t3Var;
            t3Var.b(0.3f, 250L, org.telegram.ui.Components.wr.h);
            t3Var.setTextSize(AndroidUtilities.dp(14.0f));
            t3Var.setTypeface(AndroidUtilities.bold());
            t3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
            t3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(o61Var.getContext());
            o61Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
            frameLayout.addView(t3Var, w7.a6.e(-1, -2, 17));
            o61Var.addView(frameLayout, w7.a6.c(-1.0f, -1));
            qg.s0 s0Var = new qg.s0(o61Var.getContext(), f6Var, false);
            o61Var.c = s0Var;
            s0Var.setIcon(R.raw.unlock_icon);
            o61Var.addView(s0Var, w7.a6.c(-1.0f, -1));
            view = o61Var;
        } else if (i10 == 6) {
            hn0 hn0Var = new hn0(l71Var.getContext(), 1);
            hn0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                hn0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                hn0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                hn0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            hn0Var.setGravity(17);
            hn0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var));
            view = hn0Var;
        } else if (i10 == 7) {
            View s3Var = new org.telegram.ui.Cells.s3(l71Var.getContext(), 52);
            s3Var.setTag("searchbox");
            view = s3Var;
        } else {
            view = new u61(l71Var, l71Var.getContext());
        }
        if (l71.c(l71Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.fl0(view);
    }
}
