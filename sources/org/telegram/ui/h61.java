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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class h61 extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ i71 c;

    public h61(i71 i71Var) {
        this.c = i71Var;
    }

    @Override // org.telegram.ui.Components.ll0
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
        i71 i71Var = this.c;
        if (i10 == i71Var.a) {
            return 7;
        }
        if (i10 >= i71Var.b && i10 < i71Var.c) {
            return 1;
        }
        if (i10 >= i71Var.d && i10 < i71Var.e) {
            return 1;
        }
        if (i10 >= i71Var.E && i10 < i71Var.F) {
            return 1;
        }
        if (i10 >= i71Var.r && i10 < i71Var.s) {
            return 3;
        }
        if (i71Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (i71Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == i71Var.v) {
            return 6;
        }
        if (i71Var.w0.indexOfKey(i10) >= 0 || i10 == i71Var.f || i10 == i71Var.y || i10 == i71Var.n || i10 == i71Var.h || i10 == i71Var.x) {
            return 0;
        }
        return i10 == i71Var.w ? 8 : 3;
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
        org.telegram.ui.Components.x5 x5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.wx wxVar;
        ?? r92;
        boolean z12;
        String formatString;
        zg.p0 p0Var;
        int cacheType3;
        i71 i71Var = this.c;
        ArrayList arrayList = i71Var.G0;
        ArrayList arrayList2 = i71Var.K0;
        ArrayList arrayList3 = i71Var.F0;
        SparseIntArray sparseIntArray = i71Var.w0;
        boolean z13 = i71Var.N0;
        ArrayList arrayList4 = i71Var.D0;
        int i12 = i71Var.W;
        ArrayList arrayList5 = i71Var.M0;
        f61 f61Var = i71Var.h0;
        HashSet hashSet = i71Var.K;
        ArrayList arrayList6 = i71Var.E0;
        int i13 = i71Var.V;
        int i14 = c1Var.f;
        View view = c1Var.a;
        if (i14 == 8) {
            r61 r61Var = (r61) view;
            r61Var.c = i10;
            r61Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = i71Var.U1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i14 == 6) {
            TextView textView = (TextView) view;
            if (i71Var.P0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i14 == 0) {
            n61 n61Var = (n61) view;
            if (i10 == i71Var.x) {
                n61Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                n61Var.c.setVisibility(8);
                return;
            }
            if (i10 == i71Var.f) {
                n61Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                n61Var.c.setVisibility(8);
                return;
            }
            if (i10 == i71Var.y) {
                n61Var.a(LocaleController.getString(R.string.StickerEffects), false);
                n61Var.c.setVisibility(8);
                return;
            }
            n61Var.c.setVisibility(8);
            if (i10 == i71Var.h) {
                n61Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == i71Var.n) {
                n61Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i15 = sparseIntArray.get(i10);
            if (i15 < 0) {
                n61Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.wx wxVar2 = (org.telegram.ui.Components.wx) arrayList5.get(i15);
            if (wxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(wxVar2.d, false);
                wxVar2.d = null;
            }
            if (i12 != 5 && i12 != 7 && i12 != 6 && !wxVar2.e && !UserConfig.getInstance(i13).isPremium()) {
                z14 = true;
            }
            n61Var.a(wxVar2.b.title, z14);
            return;
        }
        if (i14 == 1) {
            r61 r61Var2 = (r61) view;
            r61Var2.c = i10;
            ImageReceiver imageReceiver = r61Var2.n;
            int i16 = i71Var.b;
            if (i10 < i16 || i10 >= i71Var.c) {
                int i17 = i71Var.E;
                p0Var = (i10 < i17 || i10 >= i71Var.F) ? (zg.p0) i71Var.H0.get(i10 - i71Var.d) : (zg.p0) i71Var.J0.get(i10 - i17);
            } else {
                p0Var = (zg.p0) i71Var.I0.get(i10 - i16);
            }
            if (i12 == 13) {
                r61Var2.b = false;
                r61Var2.y = true;
                r61Var2.x = p0Var;
                r61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var.f));
                r61Var2.d(i71Var.J.contains(p0Var), false);
                return;
            }
            r61Var2.a(f61Var);
            r61Var2.y = true;
            r61Var2.x = p0Var;
            r61Var2.d(i71Var.J.contains(p0Var), false);
            r61Var2.b = false;
            if (p0Var.b || p0Var.f == null) {
                r61Var2.s = false;
                r61Var2.e = new org.telegram.ui.Components.x5(p0Var.g, (Paint.FontMetricsInt) null);
                r61Var2.d = null;
                r61Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) f61Var.d3.get(r61Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = i71Var.getCacheType();
                    if (cacheType3 == 3 && p0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.o5.n(i13, r61Var2.e.getDocumentId(), null, cacheType3);
                    f61Var.d3.put(r61Var2.e.getDocumentId(), drawable);
                }
                r61Var2.setDrawable(drawable);
            } else {
                r61Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(p0Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        zg.p0 p0Var2 = p0Var;
                        r61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    } else {
                        r61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                    }
                    MediaDataController.getInstance(i13).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.l0.a());
                } else {
                    r61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                r61Var2.e = null;
                r61Var2.d = null;
                r61Var2.setDrawable(null);
                q61 q61Var = r61Var2.J;
                if (q61Var != null) {
                    q61Var.setVisibility(8);
                    r61Var2.J.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i13).isPremium() && i12 == 14 && p0Var.b && p0Var.d) {
                r61Var2.b();
                r61Var2.J.setVisibility(0);
                r61Var2.setEmojicon(null);
                return;
            }
            if (p0Var.e) {
                r61Var2.setEmojicon(p0Var.f);
            } else {
                r61Var2.setEmojicon(null);
            }
            q61 q61Var2 = r61Var2.J;
            if (q61Var2 != null) {
                q61Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i14 == 4) {
            m61 m61Var = (m61) view;
            int i18 = i71Var.y0.get(i10);
            org.telegram.ui.Components.wx wxVar3 = (i18 < 0 || i18 >= arrayList5.size()) ? null : (org.telegram.ui.Components.wx) arrayList5.get(i18);
            if (i18 == -1) {
                i71Var.G = m61Var;
                m61Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (wxVar3 == null) {
                if (i71Var.G == m61Var) {
                    i71Var.G = null;
                    return;
                }
                return;
            } else {
                if (i71Var.G == m61Var) {
                    i71Var.G = null;
                }
                TextView textView2 = m61Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(wxVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i14 == 5) {
            l61 l61Var = (l61) view;
            int i19 = i71Var.z0.get(i10);
            if (i19 < 0 || i19 >= arrayList5.size() || (wxVar = (org.telegram.ui.Components.wx) arrayList5.get(i19)) == null) {
                return;
            }
            String str = wxVar.b.title;
            boolean z15 = (wxVar.e || UserConfig.getInstance(i13).isPremium()) ? false : true;
            boolean z16 = wxVar.f;
            org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(this, wxVar, i19, 15);
            rg.p0 p0Var3 = l61Var.c;
            FrameLayout frameLayout = l61Var.a;
            l61Var.d = str;
            if (z15) {
                frameLayout.setVisibility(8);
                r92 = 0;
                p0Var3.setVisibility(0);
                p0Var3.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), vaVar, false);
            } else {
                r92 = 0;
                p0Var3.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(vaVar);
            }
            if (z16) {
                formatString = LocaleController.getString(R.string.Added);
                z12 = true;
            } else {
                int i20 = R.string.AddStickersCount;
                z12 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = l61Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i20, objArr);
            }
            l61Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = l61Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                l61Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = l61Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                l61Var.n = null;
            }
            Boolean bool = l61Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                l61Var.h = Boolean.valueOf(z15);
                float f7 = z15 ? 1.0f : 0.0f;
                l61Var.f = f7;
                frameLayout.setAlpha(1.0f - f7);
                p0Var3.setAlpha(l61Var.f);
                p0Var3.setScaleX(l61Var.f);
                p0Var3.setScaleY(l61Var.f);
                p0Var3.setVisibility(l61Var.h.booleanValue() ? 0 : 8);
                return;
            }
            return;
        }
        if (i14 == 7 || i14 == 9) {
            return;
        }
        r61 r61Var3 = (r61) view;
        r61Var3.v = null;
        r61Var3.w = null;
        r61Var3.a = false;
        r61Var3.c = i10;
        r61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i12 == 4 && i71Var.Q) || i12 == 6) {
            size = arrayList3.size();
        } else if (i12 == 4 || i12 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || i71Var.C0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (i71Var.a != -1 ? 1 : 0) + (i71Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                r61Var3.a = true;
                r61Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                r61Var3.e = null;
                r61Var3.d = null;
                r61Var3.Q = false;
                ImageReceiver imageReceiver2 = r61Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                x5Var = r61Var3.e;
                if (x5Var == null) {
                    org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) f61Var.d3.get(x5Var.getDocumentId());
                    if (o5Var == null) {
                        if (r61Var3.e.document != null) {
                            cacheType2 = i71Var.getCacheType();
                            o5Var = org.telegram.ui.Components.o5.m(i13, cacheType2, r61Var3.e.document);
                        } else {
                            cacheType = i71Var.getCacheType();
                            o5Var = org.telegram.ui.Components.o5.n(i13, r61Var3.e.getDocumentId(), null, cacheType);
                        }
                        f61Var.d3.put(r61Var3.e.getDocumentId(), o5Var);
                    }
                    r61Var3.setDrawable(o5Var);
                } else {
                    r61Var3.setDrawable(null);
                }
                r61Var3.d(z11, false);
            }
        }
        if (i12 == 13) {
            if ((i10 - (i71Var.a != -1 ? 1 : 0)) - (i71Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (i71Var.a != -1 ? 1 : 0)) - (i71Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                r61Var3.b = false;
                r61Var3.y = false;
                r61Var3.x = zg.p0.b(str2);
                r61Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                r61Var3.d(i71Var.J.contains(r61Var3.x), false);
                return;
            }
        }
        int i21 = i71Var.a;
        int i22 = i10 - (i21 != -1 ? 1 : 0);
        int i23 = i71Var.v;
        if (i22 - (i23 != -1 ? 1 : 0) < size) {
            int i24 = ((i10 - (i21 != -1 ? 1 : 0)) - (i23 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i12 == 4 && i71Var.Q) {
                r61Var3.c((TLRPC.Document) arrayList3.get(i24), f61Var);
            } else {
                if (i12 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i24);
                    r61Var3.c(document2, f61Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.x5 x5Var2 = (org.telegram.ui.Components.x5) arrayList4.get(i24);
                    r61Var3.e = x5Var2;
                    r61Var3.d = x5Var2 == null ? null : x5Var2.document;
                    z10 = x5Var2 != null && hashSet.contains(Long.valueOf(x5Var2.getDocumentId()));
                    r61Var3.Q = false;
                    ImageReceiver imageReceiver3 = r61Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - i71Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (i71Var.a != -1 ? 1 : 0)) - (i71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (i71Var.a != -1 ? 1 : 0)) - (i71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.x5 x5Var3 = (org.telegram.ui.Components.x5) arrayList2.get(((((i10 - (i71Var.a != -1 ? 1 : 0)) - (i71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            r61Var3.e = x5Var3;
                            r61Var3.d = x5Var3 == null ? null : x5Var3.document;
                            z10 = x5Var3 != null && hashSet.contains(Long.valueOf(x5Var3.getDocumentId()));
                            r61Var3.Q = false;
                            ImageReceiver imageReceiver4 = r61Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i25 = 0; i25 < sparseIntArray.size(); i25++) {
                    int keyAt = sparseIntArray.keyAt(i25);
                    int valueAt = sparseIntArray.valueAt(i25);
                    org.telegram.ui.Components.wx wxVar4 = valueAt >= 0 ? (org.telegram.ui.Components.wx) arrayList5.get(valueAt) : null;
                    if (wxVar4 != null) {
                        int size2 = wxVar4.h ? wxVar4.c.size() : Math.min(wxVar4.c.size(), 24);
                        int i26 = (i10 - keyAt) - 1;
                        if (i26 >= 0 && i26 < size2 && (document = (TLRPC.Document) wxVar4.c.get(i26)) != null) {
                            if (i71Var.Q) {
                                r61Var3.c(document, i71Var.i0);
                            } else {
                                r61Var3.Q = false;
                                ImageReceiver imageReceiver5 = r61Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                r61Var3.e = new org.telegram.ui.Components.x5(document, (Paint.FontMetricsInt) null);
                            }
                            r61Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.x5 x5Var4 = r61Var3.e;
                if (x5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - i71Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                r61Var3.e = new org.telegram.ui.Components.x5(document3, (Paint.FontMetricsInt) null);
                r61Var3.d = document3;
                r61Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) yh.v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    r61Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = r61Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                r61Var3.Q = false;
                ImageReceiver imageReceiver6 = r61Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        x5Var = r61Var3.e;
        if (x5Var == null) {
        }
        r61Var3.d(z11, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        i71 i71Var = this.c;
        int i11 = i71Var.W;
        org.telegram.ui.ActionBar.f6 f6Var = i71Var.Z0;
        if (i10 == 0) {
            view = new n61(i71Var, i71Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(i71Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            r61 r61Var = new r61(i71Var, i71Var.getContext());
            if (i10 == 8) {
                r61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(r61Var);
                r61Var.h = imageReceiver;
                r61Var.r = imageReceiver;
                imageReceiver.setImageBitmap(i71Var.N);
                i71Var.O = r61Var;
                r61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = r61Var;
        } else if (i10 == 4) {
            Context context = i71Var.getContext();
            m61 m61Var = new m61(context);
            TextView textView = new TextView(context);
            m61Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), i71Var.g1 ? org.telegram.ui.ActionBar.j6.v(i71Var.f1, org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false))) : i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            m61Var.addView(textView, w7.x5.e(-2, -2, 17));
            view = m61Var;
        } else if (i10 == 5) {
            l61 l61Var = new l61(i71Var.getContext());
            org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(l61Var.getContext(), false, false, false, 4);
            l61Var.b = t3Var;
            t3Var.b(0.3f, 250L, org.telegram.ui.Components.qr.h);
            t3Var.setTextSize(AndroidUtilities.dp(14.0f));
            t3Var.setTypeface(AndroidUtilities.bold());
            t3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
            t3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(l61Var.getContext());
            l61Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
            frameLayout.addView(t3Var, w7.x5.e(-1, -2, 17));
            l61Var.addView(frameLayout, w7.x5.c(-1.0f, -1));
            rg.p0 p0Var = new rg.p0(l61Var.getContext(), f6Var, false);
            l61Var.c = p0Var;
            p0Var.setIcon(R.raw.unlock_icon);
            l61Var.addView(p0Var, w7.x5.c(-1.0f, -1));
            view = l61Var;
        } else if (i10 == 6) {
            jn0 jn0Var = new jn0(i71Var.getContext(), 2);
            jn0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                jn0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                jn0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                jn0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            jn0Var.setGravity(17);
            jn0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var));
            view = jn0Var;
        } else if (i10 == 7) {
            View s3Var = new org.telegram.ui.Cells.s3(i71Var.getContext(), 52);
            s3Var.setTag("searchbox");
            view = s3Var;
        } else {
            view = new r61(i71Var, i71Var.getContext());
        }
        if (i71.c(i71Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.wk0(view);
    }
}
