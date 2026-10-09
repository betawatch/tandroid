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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class j61 extends org.telegram.ui.Components.pm0 {
    public final /* synthetic */ k71 c;

    public j61(k71 k71Var) {
        this.c = k71Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f;
        return i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8;
    }

    @Override // s4.i0
    public final int h() {
        return this.c.u0;
    }

    @Override // s4.i0
    public final long i(int i10) {
        return Math.abs(((Long) this.c.v0.get(i10)).longValue());
    }

    @Override // s4.i0
    public final int j(int i10) {
        k71 k71Var = this.c;
        if (i10 == k71Var.a) {
            return 7;
        }
        if (i10 >= k71Var.b && i10 < k71Var.c) {
            return 1;
        }
        if (i10 >= k71Var.d && i10 < k71Var.e) {
            return 1;
        }
        if (i10 >= k71Var.E && i10 < k71Var.F) {
            return 1;
        }
        if (i10 >= k71Var.r && i10 < k71Var.s) {
            return 3;
        }
        if (k71Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (k71Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == k71Var.v) {
            return 6;
        }
        if (k71Var.w0.indexOfKey(i10) >= 0 || i10 == k71Var.f || i10 == k71Var.y || i10 == k71Var.n || i10 == k71Var.h || i10 == k71Var.x) {
            return 0;
        }
        return i10 == k71Var.w ? 8 : 3;
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
    @Override // s4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.d1 d1Var, int i10) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i11;
        boolean z11;
        org.telegram.ui.Components.b6 b6Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.ny nyVar;
        int i12;
        ?? r92;
        boolean z12;
        String formatString;
        zg.n0 n0Var;
        int cacheType3;
        k71 k71Var = this.c;
        ArrayList arrayList = k71Var.G0;
        ArrayList arrayList2 = k71Var.K0;
        ArrayList arrayList3 = k71Var.F0;
        SparseIntArray sparseIntArray = k71Var.w0;
        boolean z13 = k71Var.N0;
        ArrayList arrayList4 = k71Var.D0;
        int i13 = k71Var.W;
        ArrayList arrayList5 = k71Var.M0;
        h61 h61Var = k71Var.h0;
        HashSet hashSet = k71Var.K;
        ArrayList arrayList6 = k71Var.E0;
        int i14 = k71Var.V;
        int i15 = d1Var.f;
        View view = d1Var.a;
        if (i15 == 8) {
            t61 t61Var = (t61) view;
            t61Var.c = i10;
            t61Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = k71Var.U1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i15 == 6) {
            TextView textView = (TextView) view;
            if (k71Var.P0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i15 == 0) {
            p61 p61Var = (p61) view;
            if (i10 == k71Var.x) {
                p61Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                p61Var.c.setVisibility(8);
                return;
            }
            if (i10 == k71Var.f) {
                p61Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                p61Var.c.setVisibility(8);
                return;
            }
            if (i10 == k71Var.y) {
                p61Var.a(LocaleController.getString(R.string.StickerEffects), false);
                p61Var.c.setVisibility(8);
                return;
            }
            p61Var.c.setVisibility(8);
            if (i10 == k71Var.h) {
                p61Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == k71Var.n) {
                p61Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i16 = sparseIntArray.get(i10);
            if (i16 < 0) {
                p61Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.ny nyVar2 = (org.telegram.ui.Components.ny) arrayList5.get(i16);
            if (nyVar2.d != null) {
                MediaDataController.getInstance(i14).getStickerSet(nyVar2.d, false);
                nyVar2.d = null;
            }
            if (i13 != 5 && i13 != 7 && i13 != 6 && !nyVar2.e && !UserConfig.getInstance(i14).isPremium()) {
                z14 = true;
            }
            p61Var.a(nyVar2.b.title, z14);
            return;
        }
        if (i15 == 1) {
            t61 t61Var2 = (t61) view;
            t61Var2.c = i10;
            ImageReceiver imageReceiver = t61Var2.n;
            int i17 = k71Var.b;
            if (i10 < i17 || i10 >= k71Var.c) {
                int i18 = k71Var.E;
                n0Var = (i10 < i18 || i10 >= k71Var.F) ? (zg.n0) k71Var.H0.get(i10 - k71Var.d) : (zg.n0) k71Var.J0.get(i10 - i18);
            } else {
                n0Var = (zg.n0) k71Var.I0.get(i10 - i17);
            }
            if (i13 == 13) {
                t61Var2.b = false;
                t61Var2.y = true;
                t61Var2.x = n0Var;
                t61Var2.setDrawable(Emoji.getEmojiDrawable(n0Var.f));
                t61Var2.d(k71Var.J.contains(n0Var), false);
                return;
            }
            t61Var2.a(h61Var);
            t61Var2.y = true;
            t61Var2.x = n0Var;
            t61Var2.d(k71Var.J.contains(n0Var), false);
            t61Var2.b = false;
            if (n0Var.b || n0Var.f == null) {
                t61Var2.s = false;
                t61Var2.e = new org.telegram.ui.Components.b6(n0Var.g, (Paint.FontMetricsInt) null);
                t61Var2.d = null;
                t61Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) h61Var.b3.get(t61Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = k71Var.getCacheType();
                    if (cacheType3 == 3 && n0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.s5.n(i14, t61Var2.e.getDocumentId(), null, cacheType3);
                    h61Var.b3.put(t61Var2.e.getDocumentId(), drawable);
                }
                t61Var2.setDrawable(drawable);
            } else {
                t61Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i14).getReactionsMap().get(n0Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.i6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        zg.n0 n0Var2 = n0Var;
                        t61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", n0Var2, 0);
                        n0Var = n0Var2;
                    } else {
                        t61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", n0Var, 0);
                    }
                    MediaDataController.getInstance(i14).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.j0.a());
                } else {
                    t61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                t61Var2.e = null;
                t61Var2.d = null;
                t61Var2.setDrawable(null);
                s61 s61Var = t61Var2.J;
                if (s61Var != null) {
                    s61Var.setVisibility(8);
                    t61Var2.J.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i14).isPremium() && i13 == 14 && n0Var.b && n0Var.d) {
                t61Var2.b();
                t61Var2.J.setVisibility(0);
                t61Var2.setEmojicon(null);
                return;
            }
            if (n0Var.e) {
                t61Var2.setEmojicon(n0Var.f);
            } else {
                t61Var2.setEmojicon(null);
            }
            s61 s61Var2 = t61Var2.J;
            if (s61Var2 != null) {
                s61Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i15 == 4) {
            o61 o61Var = (o61) view;
            int i19 = k71Var.y0.get(i10);
            org.telegram.ui.Components.ny nyVar3 = (i19 < 0 || i19 >= arrayList5.size()) ? null : (org.telegram.ui.Components.ny) arrayList5.get(i19);
            if (i19 == -1) {
                k71Var.G = o61Var;
                o61Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (nyVar3 == null) {
                if (k71Var.G == o61Var) {
                    k71Var.G = null;
                    return;
                }
                return;
            } else {
                if (k71Var.G == o61Var) {
                    k71Var.G = null;
                }
                TextView textView2 = o61Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(nyVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i15 == 5) {
            n61 n61Var = (n61) view;
            int i20 = k71Var.z0.get(i10);
            if (i20 < 0 || i20 >= arrayList5.size() || (nyVar = (org.telegram.ui.Components.ny) arrayList5.get(i20)) == null) {
                return;
            }
            String str = nyVar.b.title;
            boolean z15 = (nyVar.e || UserConfig.getInstance(i14).isPremium()) ? false : true;
            boolean z16 = nyVar.f;
            org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(this, nyVar, i20, 16);
            rg.p0 p0Var = n61Var.c;
            FrameLayout frameLayout = n61Var.a;
            n61Var.d = str;
            if (z15) {
                i12 = 8;
                frameLayout.setVisibility(8);
                r92 = 0;
                p0Var.setVisibility(0);
                p0Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), saVar, false);
            } else {
                i12 = 8;
                r92 = 0;
                p0Var.setVisibility(8);
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
                objArr[r92] = n61Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i21, objArr);
            }
            n61Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = n61Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                n61Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = n61Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                n61Var.n = null;
            }
            Boolean bool = n61Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                n61Var.h = Boolean.valueOf(z15);
                float f7 = z15 ? 1.0f : 0.0f;
                n61Var.f = f7;
                frameLayout.setAlpha(1.0f - f7);
                p0Var.setAlpha(n61Var.f);
                p0Var.setScaleX(n61Var.f);
                p0Var.setScaleY(n61Var.f);
                p0Var.setVisibility(n61Var.h.booleanValue() ? 0 : i12);
                return;
            }
            return;
        }
        if (i15 == 7 || i15 == 9) {
            return;
        }
        t61 t61Var3 = (t61) view;
        t61Var3.v = null;
        t61Var3.w = null;
        t61Var3.a = false;
        t61Var3.c = i10;
        t61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i13 == 4 && k71Var.Q) || i13 == 6) {
            size = arrayList3.size();
        } else if (i13 == 4 || i13 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || k71Var.C0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (k71Var.a != -1 ? 1 : 0) + (k71Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                t61Var3.a = true;
                t61Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                t61Var3.e = null;
                t61Var3.d = null;
                t61Var3.Q = false;
                ImageReceiver imageReceiver2 = t61Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                b6Var = t61Var3.e;
                if (b6Var == null) {
                    org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) h61Var.b3.get(b6Var.getDocumentId());
                    if (s5Var == null) {
                        if (t61Var3.e.document != null) {
                            cacheType2 = k71Var.getCacheType();
                            s5Var = org.telegram.ui.Components.s5.m(i14, cacheType2, t61Var3.e.document);
                        } else {
                            cacheType = k71Var.getCacheType();
                            s5Var = org.telegram.ui.Components.s5.n(i14, t61Var3.e.getDocumentId(), null, cacheType);
                        }
                        h61Var.b3.put(t61Var3.e.getDocumentId(), s5Var);
                    }
                    t61Var3.setDrawable(s5Var);
                } else {
                    t61Var3.setDrawable(null);
                }
                t61Var3.d(z11, false);
            }
        }
        if (i13 == 13) {
            if ((i10 - (k71Var.a != -1 ? 1 : 0)) - (k71Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (k71Var.a != -1 ? 1 : 0)) - (k71Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                t61Var3.b = false;
                t61Var3.y = false;
                t61Var3.x = zg.n0.b(str2);
                t61Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                t61Var3.d(k71Var.J.contains(t61Var3.x), false);
                return;
            }
        }
        int i22 = k71Var.a;
        int i23 = i10 - (i22 != -1 ? 1 : 0);
        int i24 = k71Var.v;
        if (i23 - (i24 != -1 ? 1 : 0) < size) {
            int i25 = ((i10 - (i22 != -1 ? 1 : 0)) - (i24 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i13 == 4 && k71Var.Q) {
                t61Var3.c((TLRPC.Document) arrayList3.get(i25), h61Var);
            } else {
                if (i13 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i25);
                    t61Var3.c(document2, h61Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.b6 b6Var2 = (org.telegram.ui.Components.b6) arrayList4.get(i25);
                    t61Var3.e = b6Var2;
                    t61Var3.d = b6Var2 == null ? null : b6Var2.document;
                    z10 = b6Var2 != null && hashSet.contains(Long.valueOf(b6Var2.getDocumentId()));
                    t61Var3.Q = false;
                    ImageReceiver imageReceiver3 = t61Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - k71Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (k71Var.a != -1 ? 1 : 0)) - (k71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (k71Var.a != -1 ? 1 : 0)) - (k71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.b6 b6Var3 = (org.telegram.ui.Components.b6) arrayList2.get(((((i10 - (k71Var.a != -1 ? 1 : 0)) - (k71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            t61Var3.e = b6Var3;
                            t61Var3.d = b6Var3 == null ? null : b6Var3.document;
                            z10 = b6Var3 != null && hashSet.contains(Long.valueOf(b6Var3.getDocumentId()));
                            t61Var3.Q = false;
                            ImageReceiver imageReceiver4 = t61Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i26 = 0; i26 < sparseIntArray.size(); i26++) {
                    int keyAt = sparseIntArray.keyAt(i26);
                    int valueAt = sparseIntArray.valueAt(i26);
                    org.telegram.ui.Components.ny nyVar4 = valueAt >= 0 ? (org.telegram.ui.Components.ny) arrayList5.get(valueAt) : null;
                    if (nyVar4 != null) {
                        int size2 = nyVar4.h ? nyVar4.c.size() : Math.min(nyVar4.c.size(), 24);
                        int i27 = (i10 - keyAt) - 1;
                        if (i27 >= 0 && i27 < size2 && (document = (TLRPC.Document) nyVar4.c.get(i27)) != null) {
                            if (k71Var.Q) {
                                t61Var3.c(document, k71Var.i0);
                            } else {
                                t61Var3.Q = false;
                                ImageReceiver imageReceiver5 = t61Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                t61Var3.e = new org.telegram.ui.Components.b6(document, (Paint.FontMetricsInt) null);
                            }
                            t61Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.b6 b6Var4 = t61Var3.e;
                if (b6Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - k71Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                t61Var3.e = new org.telegram.ui.Components.b6(document3, (Paint.FontMetricsInt) null);
                t61Var3.d = document3;
                t61Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) yh.m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    t61Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = t61Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                t61Var3.Q = false;
                ImageReceiver imageReceiver6 = t61Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        b6Var = t61Var3.e;
        if (b6Var == null) {
        }
        t61Var3.d(z11, false);
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        k71 k71Var = this.c;
        int i11 = k71Var.W;
        org.telegram.ui.ActionBar.e6 e6Var = k71Var.Z0;
        if (i10 == 0) {
            view = new p61(k71Var, k71Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(k71Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            t61 t61Var = new t61(k71Var, k71Var.getContext());
            if (i10 == 8) {
                t61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(t61Var);
                t61Var.h = imageReceiver;
                t61Var.r = imageReceiver;
                imageReceiver.setImageBitmap(k71Var.N);
                k71Var.O = t61Var;
                t61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = t61Var;
        } else if (i10 == 4) {
            Context context = k71Var.getContext();
            o61 o61Var = new o61(context);
            TextView textView = new TextView(context);
            o61Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(11.0f), k71Var.g1 ? org.telegram.ui.ActionBar.i6.v(k71Var.f1, org.telegram.ui.ActionBar.i6.m1(0.4f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false))) : i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            o61Var.addView(textView, w7.x5.e(-2, -2, 17));
            view = o61Var;
        } else if (i10 == 5) {
            n61 n61Var = new n61(k71Var.getContext());
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(n61Var.getContext(), false, false, false, 4);
            n61Var.b = u3Var;
            u3Var.b(0.3f, 250L, org.telegram.ui.Components.hs.h);
            u3Var.setTextSize(AndroidUtilities.dp(14.0f));
            u3Var.setTypeface(AndroidUtilities.bold());
            u3Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Sh, e6Var));
            u3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(n61Var.getContext());
            n61Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
            frameLayout.addView(u3Var, w7.x5.e(-1, -2, 17));
            n61Var.addView(frameLayout, w7.x5.d(-1.0f, -1));
            rg.p0 p0Var = new rg.p0(n61Var.getContext(), e6Var, false);
            n61Var.c = p0Var;
            p0Var.setIcon(R.raw.unlock_icon);
            n61Var.addView(p0Var, w7.x5.d(-1.0f, -1));
            view = n61Var;
        } else if (i10 == 6) {
            gn0 gn0Var = new gn0(k71Var.getContext(), 2);
            gn0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                gn0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                gn0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                gn0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            gn0Var.setGravity(17);
            gn0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.y6, e6Var));
            view = gn0Var;
        } else if (i10 == 7) {
            View t3Var = new org.telegram.ui.Cells.t3(k71Var.getContext(), 52);
            t3Var.setTag("searchbox");
            view = t3Var;
        } else {
            view = new t61(k71Var, k71Var.getContext());
        }
        if (k71.c(k71Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.am0(view);
    }
}
