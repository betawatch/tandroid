package di;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a8(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ch.d dVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        org.telegram.ui.Components.o5 o5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Photo photo;
        fj fjVar;
        int e12;
        int[] iArr;
        File file;
        int i7;
        boolean contains;
        SQLiteCursor sQLiteCursor;
        int i10;
        ArrayList arrayList;
        int i11 = 7;
        Pair pair = null;
        SQLiteCursor sQLiteCursor2 = null;
        r7 = null;
        r7 = null;
        r7 = null;
        int[] iArr2 = null;
        Bitmap decodeFile = null;
        int i12 = 1;
        int i13 = 0;
        switch (this.a) {
            case 0:
                y8 y8Var = (y8) this.b;
                HashSet hashSet = (HashSet) this.c;
                Runnable runnable = (Runnable) this.d;
                y8Var.getClass();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    y8Var.Q.remove(num);
                    y8Var.R.remove(num);
                }
                runnable.run();
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.d;
                zArr[0] = false;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                w2VarArr[0].dismiss();
                return;
            case 2:
                fi.b3 b3Var = (fi.b3) this.b;
                ch.p0 p0Var = (ch.p0) this.c;
                View view = (View) this.d;
                fi.z3 z3Var = b3Var.a;
                z3Var.e3 = true;
                fi.x3 x3Var = z3Var.y1;
                ImageReceiver imageReceiver = z3Var.V2;
                boolean[] zArr2 = {false};
                fi.u6 u6Var = z3Var.o0;
                u6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new fi.f2(1, u6Var)).setDuration(150L).start();
                int L = org.telegram.messenger.g0.L(8.0f);
                fi.u6 u6Var2 = new fi.u6(z3Var.getContext(), z3Var.h1);
                z3Var.o0 = u6Var2;
                u6Var2.setPadding(L, L, L, L);
                z3Var.n0.addView(z3Var.o0, c8.na.e(40, 40, 3));
                org.telegram.ui.Components.o5 o5Var2 = z3Var.Y2;
                if (o5Var2 != null) {
                    o5Var2.n(z3Var);
                    dVar = null;
                    z3Var.Y2 = null;
                } else {
                    dVar = null;
                }
                ch.d dVar2 = z3Var.W2;
                if (dVar2 != null) {
                    dVar2.d(z3Var);
                    z3Var.W2 = dVar;
                }
                z3Var.Z2 = false;
                if (p0Var.g != 0) {
                    z3Var.Z2 = true;
                    org.telegram.ui.Components.o5 o5Var3 = new org.telegram.ui.Components.o5(2, z3Var.m2, p0Var.g);
                    z3Var.Y2 = o5Var3;
                    o5Var3.a(z3Var);
                } else if (p0Var.f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(z3Var.m2).r.get(p0Var.f)) != null) {
                    z3Var.X2.v0(null, null, org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.r0(org.telegram.messenger.fc.b(tL_availableReaction.around_animation), ch.l0.a(), null, null, null, 0);
                    if (imageReceiver.C() != null) {
                        imageReceiver.C().N(0, false, true);
                    }
                }
                z3Var.o0.setReaction(p0Var);
                if (z3Var.n1) {
                    TL_stories.StoryItem storyItem3 = x3Var.a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = x3Var.a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        ch.s0.b(null, storyItem4.sent_reaction, storyViews);
                        z3Var.i1(true);
                    }
                }
                if (p0Var.g != 0 && (o5Var = z3Var.o0.f) != null) {
                    ch.d a10 = ch.d.a(o5Var, false, true);
                    z3Var.W2 = a10;
                    a10.f(z3Var);
                }
                z3Var.C1.j0(z3Var.l1, x3Var.a, p0Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                int[] iArr4 = new int[2];
                z3Var.getLocationInWindow(iArr4);
                z3Var.g3 = iArr3[0] - iArr4[0];
                z3Var.h3 = iArr3[1] - iArr4[1];
                z3Var.i3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                z3Var.f3 = 0.0f;
                z3Var.invalidate();
                fi.u6 u6Var3 = z3Var.o0;
                u6Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = u6Var3.e;
                if (p0Var.g == 0 && (tL_availableReaction2 = (TLRPC.TL_availableReaction) ri.d0(i10.t0).r.get(p0Var.f)) != null) {
                    imageReceiver2.r0(org.telegram.messenger.fc.b(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.X(0);
                }
                ofFloat.addUpdateListener(new fi.z2(b3Var, ofFloat, zArr2, i13));
                ofFloat.addListener(new fi.a3(b3Var, zArr2, u6Var3, i13));
                ofFloat.setDuration(220L);
                ofFloat.start();
                z3Var.Z0(false);
                return;
            case 3:
                fi.r3 r3Var = (fi.r3) this.b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.d;
                fi.z3 z3Var2 = r3Var.x;
                org.telegram.ui.Components.b5.P(z3Var2.getContext(), null, i6Var, new a3.h(r3Var, storyItem5, i6Var, i11));
                fi.r3 r3Var2 = z3Var2.d1;
                if (r3Var2 != null) {
                    r3Var2.a();
                    return;
                }
                return;
            case 4:
                fi.a6 a6Var = (fi.a6) this.b;
                TL_stories.StoryItem storyItem6 = (TL_stories.StoryItem) this.c;
                w10 w10Var = (w10) this.d;
                while (i13 < a6Var.i.size()) {
                    fj fjVar2 = (fj) a6Var.i.get(i13);
                    if (fjVar2 != null && (storyItem = fjVar2.l) != null && (messageMedia = storyItem.media) != null && (document = storyItem6.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                        w10Var.a(document2);
                        return;
                    }
                    i13++;
                }
                w10Var.a(null);
                return;
            case 5:
                fi.p6 p6Var = (fi.p6) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int i14 = p6Var.a;
                p6Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    p6Var.S = null;
                    ks.f(i14).k(ks.d3, new Object[0]);
                    return;
                } else if (!(tLObject instanceof TL_stories.canSendStoryCount)) {
                    p6Var.n(tL_error);
                    return;
                } else {
                    p6Var.S = new fi.j6(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    ks.f(i14).k(ks.d3, new Object[0]);
                    return;
                }
            case 6:
                fi.a6 a6Var2 = (fi.a6) this.b;
                fi.z5 z5Var = (fi.z5) this.c;
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) this.d;
                ArrayList arrayList2 = a6Var2.i;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    fj fjVar3 = (fj) arrayList2.get(i15);
                    if (fjVar3 != null && (storyItem2 = fjVar3.l) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = z5Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 == null) {
                                continue;
                            } else if (document4.id == document3.id) {
                                e3Var.a((fi.z5) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.id == photo2.id) {
                            e3Var.a((fi.z5) storyItem2);
                            return;
                        }
                    }
                }
                e3Var.a(null);
                return;
            case 7:
                fi.a6 a6Var3 = (fi.a6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                Runnable runnable2 = (Runnable) this.d;
                fi.e6 e6Var = a6Var3.q;
                ArrayList arrayList3 = a6Var3.G;
                ArrayList arrayList4 = a6Var3.i;
                ArrayList arrayList5 = a6Var3.H;
                a6Var3.F = 0;
                a6Var3.C = false;
                a6Var3.D = true;
                a6Var3.r = true;
                ArrayList arrayList6 = new ArrayList();
                if (tLObject2 instanceof Vector) {
                    ArrayList<T> arrayList7 = ((Vector) tLObject2).objects;
                    int size = arrayList7.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = arrayList7.get(i16);
                        i16++;
                        arrayList6.add((TL_bots.botPreviewMedia) obj);
                    }
                } else {
                    if (!(tLObject2 instanceof TL_bots.previewInfo)) {
                        return;
                    }
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject2;
                    arrayList3.clear();
                    arrayList3.addAll(previewinfo.lang_codes);
                    arrayList6.addAll(previewinfo.media);
                }
                ArrayList arrayList8 = new ArrayList(arrayList4);
                arrayList4.clear();
                arrayList5.clear();
                int size2 = arrayList6.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj2 = arrayList6.get(i17);
                    i17++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj2;
                    ArrayList arrayList9 = arrayList6;
                    fj fjVar4 = new fj(a6Var3.c, new fi.z5(a6Var3, a6Var3.d, botpreviewmedia));
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList8.size()) {
                            fjVar = null;
                        } else if (mp.u0(((fj) arrayList8.get(i18)).l.media, botpreviewmedia.media)) {
                            fjVar = (fj) arrayList8.get(i18);
                        } else {
                            i18++;
                        }
                    }
                    TL_stories.StoryItem storyItem7 = fjVar4.l;
                    TLRPC.Message message = fjVar4.k;
                    if (fjVar == null) {
                        e12 = a6Var3.I;
                        a6Var3.I = e12 + 1;
                    } else {
                        e12 = fjVar.e1();
                    }
                    message.id = e12;
                    storyItem7.id = e12;
                    fjVar4.j = a6Var3;
                    fjVar4.r0(false);
                    if (arrayList5.isEmpty()) {
                        arrayList5.add(new ArrayList());
                    }
                    ((ArrayList) arrayList5.get(0)).add(Integer.valueOf(fjVar4.e1()));
                    arrayList4.add(fjVar4);
                    arrayList6 = arrayList9;
                }
                org.telegram.messenger.g0.r(e6Var);
                org.telegram.messenger.g0.g3(e6Var);
                if (runnable2 != null) {
                    org.telegram.messenger.g0.g3(runnable2);
                    return;
                }
                return;
            case 8:
                fi.w8 w8Var = (fi.w8) this.b;
                fi.h6 h6Var = (fi.h6) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                fi.f9 f9Var = w8Var.d;
                f9Var.o0.D(f9Var.h, h6Var.d, arrayList10);
                return;
            case 9:
                fi.o9 o9Var = (fi.o9) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                f2.a aVar = o9Var.f;
                int i19 = o9Var.b;
                fi.o9.g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    mp.u1(i19).f4(tL_stories_storyViews.users, false);
                    if (!o9Var.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        o9Var.d = 0;
                        o9Var.e = false;
                        return;
                    }
                    ks.f(i19).k(ks.y5, new Object[0]);
                }
                o9Var.d = 0;
                if (o9Var.e) {
                    org.telegram.messenger.g0.r(aVar);
                    org.telegram.messenger.g0.h3(aVar, 10000L);
                    return;
                }
                return;
            case 10:
                m9.y yVar = (m9.y) this.b;
                m9.e0 e0Var = (m9.e0) this.c;
                try {
                    try {
                        e0Var.o(((m9.q) this.d).apply(c8.u9.a(yVar)));
                        return;
                    } catch (Throwable th2) {
                        e0Var.n(th2);
                        return;
                    }
                } catch (Error e10) {
                    e = e10;
                    e0Var.n(e);
                    return;
                } catch (CancellationException unused) {
                    e0Var.cancel(false);
                    return;
                } catch (RuntimeException e11) {
                    e = e11;
                    e0Var.n(e);
                    return;
                } catch (ExecutionException e13) {
                    e = e13;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    e0Var.n(e);
                    return;
                }
            case 11:
                m9.e0 e0Var2 = (m9.e0) this.b;
                org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) this.c;
                p4.n1 n1Var = (p4.n1) this.d;
                try {
                    if (e0Var2.a instanceof m9.a) {
                        return;
                    }
                    t1Var.run();
                    e0Var2.m(n1Var);
                    return;
                } catch (Throwable th3) {
                    e0Var2.n(th3);
                    return;
                }
            case 12:
                hi.f2 f2Var = (hi.f2) this.b;
                String str = (String) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                ArrayList arrayList11 = f2Var.w;
                hi.g2 g2Var = f2Var.O;
                ArrayList arrayList12 = f2Var.s;
                if (TextUtils.equals(str, f2Var.I)) {
                    f2Var.y = 0;
                    arrayList12.clear();
                    arrayList11.clear();
                    f2Var.E.clear();
                    f2Var.n.clear();
                    f2Var.y++;
                    arrayList12.add(null);
                    arrayList11.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList12.addAll(tL_messages_stickers.stickers);
                        f2Var.y = tL_messages_stickers.stickers.size() + f2Var.y;
                    }
                    f2Var.J = f2Var.I;
                    f2Var.f();
                    hi.w1.z1(g2Var.b, 0, 0);
                    g2Var.f.c(false);
                    g2Var.e.n(false);
                    return;
                }
                return;
            case 13:
                hi.i3 i3Var = (hi.i3) this.b;
                Object obj3 = this.c;
                String str2 = (String) this.d;
                float f10 = i3Var.L;
                if (obj3 != null) {
                    int min = (int) Math.min(org.telegram.messenger.g0.q.x / 3.0f, org.telegram.messenger.g0.L(330.0f));
                    if (obj3 instanceof ef) {
                        ef efVar = (ef) obj3;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        i3Var.c(efVar, options);
                        hi.x7.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c10 = i3Var.c(efVar, options);
                        if (c10 != null && c10.getHeight() / c10.getWidth() < f10) {
                            if (efVar.T == 0 && efVar.U == 0 && !c10.isRecycled()) {
                                iArr2 = c8.k0.b(c10, true);
                                efVar.T = iArr2[0];
                                efVar.U = iArr2[1];
                            } else {
                                int i20 = efVar.T;
                                if (i20 != 0 && (i7 = efVar.U) != 0) {
                                    iArr2 = new int[]{i20, i7};
                                }
                            }
                        }
                        iArr = iArr2;
                        decodeFile = c10;
                    } else if (!(obj3 instanceof hi.x7) || (file = ((hi.x7) obj3).O0) == null) {
                        iArr = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        hi.x7.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        decodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    }
                    pair = new Pair(decodeFile, iArr);
                }
                org.telegram.messenger.g0.g3(new a8(i3Var, str2, pair, 14));
                return;
            case 14:
                hi.i3 i3Var2 = (hi.i3) this.b;
                String str3 = (String) this.c;
                Pair pair2 = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair2.first;
                int[] iArr5 = (int[]) pair2.second;
                Paint paint = i3Var2.d;
                if (bitmap == null) {
                    return;
                }
                if (str3 != null) {
                    hi.i3.g0.put(str3, bitmap);
                    HashMap hashMap = hi.i3.f0;
                    Integer num2 = (Integer) hashMap.get(str3);
                    if (num2 != null) {
                        hashMap.put(str3, Integer.valueOf(num2.intValue() + 1));
                    } else {
                        hashMap.put(str3, 1);
                    }
                }
                if (!TextUtils.equals(str3, i3Var2.S)) {
                    hi.i3.d(str3);
                    return;
                }
                i3Var2.a = bitmap;
                if (iArr5 == null) {
                    paint.setShader(null);
                    i3Var2.e = null;
                } else {
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr5, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    i3Var2.e = linearGradient;
                    paint.setShader(linearGradient);
                }
                i3Var2.h();
                i3Var2.invalidate();
                return;
            case 15:
                hi.l3 l3Var = (hi.l3) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                mp mpVar = (mp) this.d;
                l3Var.r = true;
                l3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    mpVar.f4(tL_contacts_resolvedPeer.users, false);
                    mpVar.Z3(tL_contacts_resolvedPeer.chats, false);
                    tr.a0(l3Var.x.a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    l3Var.E();
                    return;
                }
                return;
            case 16:
                hi.r7 r7Var = (hi.r7) this.b;
                ai.q qVar = (ai.q) this.c;
                long[] jArr = (long[]) this.d;
                if (r7Var.t == null || r7Var.x == null) {
                    return;
                }
                ai.q[] qVarArr = DictationAsr.a;
                if (qVar != null && qVar.j) {
                    DictationAsr.K(jArr);
                    r7Var.t.j(jArr[0], jArr[1], true);
                    return;
                } else {
                    if (DictationAsr.A(qVar)) {
                        r7Var.j();
                        return;
                    }
                    return;
                }
            case 17:
                String[] strArr = (String[]) this.b;
                int[][] iArr6 = (int[][]) this.c;
                ai.j jVar = (ai.j) this.d;
                for (int i21 = 0; i21 < strArr.length; i21++) {
                    String str4 = strArr[i21];
                    if (str4 != null) {
                        AnimatedFileNative.d(str4, iArr6[i21], 0L);
                    }
                }
                org.telegram.messenger.g0.g3(jVar);
                return;
            case 18:
                String str5 = (String) this.b;
                int[][] iArr7 = (int[][]) this.c;
                ai.j jVar2 = (ai.j) this.d;
                AnimatedFileNative.d(str5, iArr7[0], 0L);
                org.telegram.messenger.g0.g3(jVar2);
                return;
            case 19:
                hi.f9 f9Var2 = (hi.f9) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                mp mpVar2 = (mp) this.d;
                hi.k9 k9Var = f9Var2.a0;
                f9Var2.w.setLoading(false);
                if (tLObject6 != null) {
                    int i22 = hi.k9.Y1;
                    ArrayList P0 = k9Var.P0();
                    for (int i23 = 0; i23 < P0.size(); i23++) {
                        TLRPC.User user = (TLRPC.User) P0.get(i23);
                        if (user != null && (contains = f9Var2.c.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = contains;
                            user.flags2 = contains ? user.flags2 | 4 : user.flags2 & (-5);
                            mpVar2.e4(user, false, false);
                        }
                    }
                }
                k9Var.N0();
                if (k9Var.U1) {
                    k9Var.O0(new hi.i9(1, k9Var.a, (ArrayList) null), new fi.o3(k9Var, i12), false);
                    return;
                } else {
                    k9Var.N0();
                    k9Var.m1.C(0);
                    return;
                }
            case 20:
                hi.nb nbVar = (hi.nb) this.b;
                ((hi.x7) this.c).O0 = (File) this.d;
                hi.ga gaVar = nbVar.e1;
                if (gaVar != null) {
                    gaVar.b.g3.O(false);
                    return;
                }
                return;
            case 21:
                hi.nb nbVar2 = (hi.nb) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Runnable runnable3 = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), nbVar2.C0.getMatrix(), true);
                        bitmap2.recycle();
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                        if (createScaledBitmap != null) {
                            if (createScaledBitmap != createBitmap) {
                                createBitmap.recycle();
                            }
                            Utilities.blurBitmap(createScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "cthumb.jpg"));
                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            createScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                org.telegram.messenger.g0.g3(runnable3);
                return;
            case 22:
                jg.h0 h0Var = (jg.h0) this.b;
                HashSet hashSet2 = (HashSet) this.c;
                jg.t tVar = (jg.t) this.d;
                int i24 = h0Var.t0;
                mp u12 = mp.u1(i24);
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair3 = (Pair) it2.next();
                    boolean booleanValue = ((Boolean) pair3.first).booleanValue();
                    Long l10 = (Long) pair3.second;
                    long longValue = l10.longValue();
                    ConcurrentHashMap concurrentHashMap = booleanValue ? u12.Q : u12.P;
                    tr a02 = tr.a0(i24);
                    if (booleanValue) {
                        try {
                            sQLiteCursor = a02.b.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + longValue, new Object[0]);
                            try {
                                try {
                                    if (sQLiteCursor.next()) {
                                        i10 = sQLiteCursor.intValue(0);
                                        sQLiteCursor.dispose();
                                    }
                                    i10 = 0;
                                    sQLiteCursor.dispose();
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLiteCursor2 = sQLiteCursor;
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                a02.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                i10 = 0;
                                concurrentHashMap.put(l10, Integer.valueOf(i10));
                            }
                        } catch (Exception e15) {
                            e = e15;
                            sQLiteCursor = null;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else {
                        sQLiteCursor = a02.b.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + longValue, new Object[0]);
                        if (sQLiteCursor.next()) {
                            int intValue = sQLiteCursor.intValue(0);
                            int intValue2 = sQLiteCursor.intValue(1);
                            if (intValue2 <= intValue) {
                                i10 = intValue2;
                                sQLiteCursor.dispose();
                            }
                        }
                        i10 = 0;
                        sQLiteCursor.dispose();
                    }
                    concurrentHashMap.put(l10, Integer.valueOf(i10));
                }
                org.telegram.messenger.g0.g3(tVar);
                return;
            case 23:
                ((jg.f0) this.b).a((a0.h) this.d, (ArrayList) this.c);
                return;
            case 24:
                jg.h1 h1Var = (jg.h1) this.b;
                String str6 = (String) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                h1Var.F0 = 0;
                if (str6.equals(h1Var.E0) && (tLObject7 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject7;
                    ArrayList arrayList13 = h1Var.B0;
                    int size3 = arrayList13 != null ? arrayList13.size() : 0;
                    h1Var.F("sticker_search_".concat(str6), tL_messages_stickers2.stickers);
                    ArrayList arrayList14 = h1Var.B0;
                    int size4 = arrayList14 != null ? arrayList14.size() : 0;
                    if (!h1Var.p0 && (arrayList = h1Var.B0) != null && !arrayList.isEmpty()) {
                        h1Var.H();
                        h1Var.W.a(h1Var.K() > 0);
                        h1Var.p0 = true;
                    }
                    if (size3 != size4) {
                        h1Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 25:
                jg.h1 h1Var2 = (jg.h1) this.b;
                ArrayList arrayList15 = (ArrayList) this.c;
                a0.h hVar = (a0.h) this.d;
                h1Var2.q0 = null;
                h1Var2.Y(hVar, arrayList15, true);
                return;
            case 26:
                jg.z1 z1Var = (jg.z1) this.b;
                ArrayList arrayList16 = (ArrayList) this.c;
                HashMap hashMap2 = (HashMap) this.d;
                z1Var.q = arrayList16;
                z1Var.r = hashMap2;
                z1Var.s = true;
                z1Var.a.m2(arrayList16);
                return;
            case 27:
                jg.a2 a2Var = (jg.a2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str7 = tL_messages_searchStickerSets.q;
                jg.c2 c2Var = a2Var.a;
                String str8 = c2Var.S;
                x31 x31Var = c2Var.e;
                if (str7.equals(str8)) {
                    a2Var.a();
                    x31Var.b.h.getProgressDrawable().e = false;
                    c2Var.O = 0;
                    x31Var.b(true);
                    c2Var.F.addAll(tL_messages_foundStickerSets.sets);
                    c2Var.f();
                    return;
                }
                return;
            case 28:
                kg.c cVar = (kg.c) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                if (tL_error2 != null) {
                    cVar.a.b(false);
                    org.telegram.ui.Components.kc.e0(tL_error2);
                    return;
                } else if (!(tLObject8 instanceof TLRPC.TL_boolFalse)) {
                    cVar.finishFragment();
                    return;
                } else {
                    cVar.a.b(false);
                    org.telegram.messenger.f3.o(null, 2131743632, org.telegram.ui.Components.kc.b0(cVar), null);
                    return;
                }
            default:
                kg.n nVar = (kg.n) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                if (tL_error3 != null) {
                    nVar.f.b(false);
                    org.telegram.ui.Components.kc.e0(tL_error3);
                    return;
                } else if (tLObject9 instanceof TLRPC.TL_boolFalse) {
                    nVar.f.b(false);
                    org.telegram.messenger.f3.o(null, 2131743632, org.telegram.ui.Components.kc.b0(nVar), null);
                    return;
                } else {
                    if (nVar.F != null) {
                        nVar.getMessagesController().c3(nVar.getUserConfig().f(), 0, true, null);
                    }
                    nVar.finishFragment();
                    return;
                }
        }
    }
}
