package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        mz mzVar = (mz) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        uy uyVar = mzVar.O1;
        if (uyVar == null || !(uyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            return;
        }
        ((CompoundEmoji.CompoundEmojiDrawable) mzVar.O1.getDrawable()).update(num.intValue(), num2.intValue());
        String str = (String) mzVar.O1.getTag();
        if (num.intValue() == -1 && num2.intValue() == -1) {
            Emoji.emojiColor.remove(str);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(num.intValue() >= 0 ? CompoundEmoji.skinTones.get(num.intValue()) : "");
            sb.append("\u200d");
            sb.append(num2.intValue() >= 0 ? CompoundEmoji.skinTones.get(num2.intValue()) : "");
            Emoji.emojiColor.put(str, sb.toString());
        }
        Emoji.saveEmojiColors();
    }

    private final void b(Object obj, Object obj2) {
        ly lyVar = (ly) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = lyVar.s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            dy dyVar = (dy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = dyVar.b;
            if (tL_messages_stickerSet != null) {
                boolean z4 = tL_messages_stickerSet.set.id == lyVar.d;
                int i11 = ny.a;
                h51 J = h51.J(ny.class);
                long j10 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z4;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = dyVar.a;
                if (stickerSetCovered != null) {
                    arrayList.add(ny.a(stickerSetCovered, dyVar, stickerSetCovered.set.id == lyVar.d));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        hz hzVar = (hz) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = hzVar.B;
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i10);
            i10++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.id, 1);
                boolean z4 = tL_messages_stickerSet.set.id == hzVar.d;
                int i11 = ny.a;
                h51 J = h51.J(ny.class);
                long j10 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z4;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = hzVar.G;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            dy dyVar = (dy) obj4;
            TLRPC.StickerSet stickerSet = dyVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(ny.a(dyVar.a, dyVar, stickerSet.id == hzVar.d));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        float[] fArr = FragmentContextView.J0;
        fragmentContextView.w0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z4 = fragmentContextView.S;
        org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.E;
        float floatValue = ((Float) obj).floatValue();
        c1Var.getClass();
        mediaController.setPlaybackSpeed(z4, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        h40 h40Var = (h40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        h40Var.c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(h40Var.a).history);
        if (h40Var.c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < h40Var.c.size(); i10++) {
            String str = (String) h40Var.c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(h51.c(i10 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(h51.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        oh.f6 f6Var;
        i40 i40Var = (i40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = i40Var.L;
        int i10 = 0;
        boolean z4 = i40Var.M && (f6Var = i40Var.N) != null && f6Var.i.size() > 0;
        if (z4) {
            oh.f6 f6Var2 = i40Var.N;
            int i11 = uf.w0.a;
            h51 J = h51.J(uf.w0.class);
            J.G = f6Var2;
            arrayList.add(J);
        }
        i40Var.O = z4;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            h51 h51Var = new h51(33);
            h51Var.d = i12;
            h51Var.G = messageObject;
            arrayList.add(h51Var);
            i10 = i12;
        }
        if (i40Var.P || !i40Var.S) {
            arrayList.add(h51.o(-2, 1));
            arrayList.add(h51.o(-3, 1));
            arrayList.add(h51.o(-4, 1));
        }
        if (i40Var.O || !z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new xp(i40Var, 20));
    }

    private final void g(Object obj, Object obj2) {
        o70 o70Var = (o70) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        q70 q70Var = o70Var.x;
        q70Var.f.setAlpha(1.0f);
        if (q70Var.u) {
            o70Var.c = bitmap;
        }
        tg.b bVar = q70Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ug.c.c(q70Var.n, o70Var);
            ViewGroup viewGroup = q70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        gh0 gh0Var = (gh0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = gh0Var.e;
        ArrayList arrayList3 = gh0Var.n;
        int i10 = 0;
        if (gh0Var.d == null) {
            arrayList.add(h51.o(-1, 7));
            arrayList.add(h51.o(-2, 7));
            arrayList.add(h51.o(-3, 7));
            gh0Var.N = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(gh0Var.w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(h51.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                h51 h51Var = new h51(33);
                h51Var.G = (MessageObject) obj3;
                arrayList.add(h51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(h51.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                h51 h51Var2 = new h51(33);
                h51Var2.G = (MessageObject) obj4;
                arrayList.add(h51Var2);
            }
        }
        if (gh0Var.v || ((gh0Var.J && !gh0Var.K) || (!isEmpty && !arrayList3.isEmpty() && !gh0Var.s))) {
            arrayList.add(h51.o(gh0Var.I * 3, 7));
            arrayList.add(h51.o((gh0Var.I * 3) + 1, 7));
            arrayList.add(h51.o((gh0Var.I * 3) + 2, 7));
        }
        gh0Var.N = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        im0 im0Var = (im0) this.b;
        im0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        im0Var.e = paint;
        Bitmap bitmap = im0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        im0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        im0Var.f = new Matrix();
        tg.b bVar = im0Var.h;
        bVar.a((Bitmap) obj2);
        ug.c.c(bVar, im0Var.s);
        ViewGroup viewGroup = im0Var.y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        xx0 xx0Var = (xx0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        xx0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(xx0Var.P.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new y1((Utilities.Callback) obj2, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:388:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0800 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x07b8  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        h51 a2;
        TL_iv.RichMessage richMessage;
        h51 a10;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        h51 a11;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        boolean z4;
        String str2;
        MediaController.AudioEntry audioEntry;
        w51 w51Var;
        int i10;
        boolean z10;
        int i11 = this.a;
        String str3 = null;
        int i12 = 5;
        final int i13 = 0;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                f0 f0Var = (f0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var2 = (w51) obj2;
                boolean[] zArr = f0Var.m0;
                boolean[] zArr2 = f0Var.n0;
                e0 e0Var = f0Var.u0;
                arrayList.add(h51.B(null));
                arrayList.add(h51.l(f0Var.s0));
                arrayList.add(h51.B(null));
                w51Var2.B = 1;
                w51Var2.U();
                e0 e0Var2 = f0Var.t0;
                int selectedTab = e0Var2 != null ? e0Var2.getSelectedTab() : 0;
                int i14 = 6;
                int i15 = 7;
                if (selectedTab == 0) {
                    String str4 = f0Var.o0;
                    if (str4 == null || str4.equalsIgnoreCase(TranslateController.UNKNOWN_LANGUAGE)) {
                        arrayList.add(a41.b(3, LocaleController.getString(R.string.AIEditorOriginalText), null, null, null));
                    } else {
                        String D = v31.D(f0Var.o0, null, zArr2);
                        String string = LocaleController.getString((zArr2 == null || !zArr2[0]) ? R.string.AIEditorFromOther : R.string.AIEditorFrom);
                        int indexOf = string.indexOf("%s");
                        if (indexOf < 0) {
                            substring3 = "";
                            substring2 = substring3;
                        } else {
                            substring2 = string.substring(0, indexOf);
                            substring3 = string.substring(indexOf + 2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            D = v31.y(D);
                        }
                        arrayList.add(a41.b(3, substring2, D, substring3, null));
                    }
                    arrayList.add(f0Var.i0() ? f0Var.j0(4, f0Var.V, false) : e41.a(4, f0Var.U, f0Var.M0, new b(f0Var, 4), null, null));
                    String D2 = v31.D(f0Var.p0, zArr, null);
                    String string2 = LocaleController.getString((zArr == null || !zArr[0]) ? R.string.AIEditorToOther : R.string.AIEditorTo);
                    int indexOf2 = string2.indexOf("%s");
                    if (indexOf2 < 0) {
                        str = "";
                        substring = str;
                    } else {
                        String substring4 = string2.substring(0, indexOf2);
                        substring = string2.substring(indexOf2 + 2);
                        str = substring4;
                    }
                    if (TextUtils.isEmpty(str)) {
                        D2 = v31.y(D2);
                    }
                    arrayList.add(a41.a(5, str, w.c.e(D2, ""), substring, new b(f0Var, i12), f0Var.q0, new b(f0Var, i14), null));
                    if (f0Var.i0()) {
                        boolean z11 = f0Var.W;
                        if (z11 || (richMessage3 = f0Var.Y) == null) {
                            richMessage3 = f0Var.V;
                        }
                        a11 = f0Var.j0(6, richMessage3, z11);
                    } else {
                        boolean z12 = f0Var.W;
                        a11 = e41.a(z12 ? 7 : 6, f0Var.X, false, null, null, !z12 ? new b(f0Var, i15) : null);
                    }
                    arrayList.add(a11);
                } else if (selectedTab == 1) {
                    arrayList.add(h51.k(e0Var));
                    if (e0Var.getSelectedTone() instanceof b0) {
                        arrayList.add(h51.j(10, f0Var.w0));
                        w51Var2.T();
                        arrayList.add(h51.A(11, null));
                        w51Var2.U();
                    }
                    if ((e0Var.getSelectedTab() >= 0 || f0Var.q0) && (!(e0Var.getSelectedTone() instanceof b0) || TextUtils.equals(f0Var.x0.getText().toString(), f0Var.F0))) {
                        arrayList.add(a41.a(7, LocaleController.getString(R.string.AIEditorResult), null, null, null, f0Var.q0, new b(f0Var, i14), null));
                        if (f0Var.i0()) {
                            boolean z13 = f0Var.Z;
                            if (z13 || (richMessage2 = f0Var.b0) == null) {
                                richMessage2 = f0Var.V;
                            }
                            a10 = f0Var.j0(8, richMessage2, z13);
                        } else {
                            boolean z14 = f0Var.Z;
                            a10 = e41.a(z14 ? 7 : 6, f0Var.a0, false, null, null, !z14 ? new b(f0Var, i15) : null);
                        }
                        arrayList.add(a10);
                    } else {
                        arrayList.add(a41.a(5, LocaleController.getString(R.string.AIEditorOriginal), null, null, null, f0Var.q0, new b(f0Var, i14), null));
                        arrayList.add(f0Var.i0() ? f0Var.j0(6, f0Var.V, false) : e41.a(f0Var.Z ? 7 : 6, f0Var.U, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(a41.b(3, LocaleController.getString(R.string.AIEditorOriginal), null, null, null));
                    arrayList.add(f0Var.i0() ? f0Var.j0(4, f0Var.V, false) : e41.a(4, f0Var.U, f0Var.M0, new b(f0Var, 4), null, null));
                    arrayList.add(a41.b(5, LocaleController.getString(R.string.AIEditorResult), null, null, null));
                    if (f0Var.i0()) {
                        boolean z15 = f0Var.c0;
                        if (z15 || (richMessage = f0Var.e0) == null) {
                            richMessage = f0Var.V;
                        }
                        a2 = f0Var.j0(6, richMessage, z15);
                    } else {
                        boolean z16 = f0Var.c0;
                        a2 = e41.a(z16 ? 7 : 6, f0Var.d0, false, null, null, !z16 ? new b(f0Var, i15) : null);
                    }
                    arrayList.add(a2);
                }
                w51Var2.T();
                arrayList.add(h51.B(null));
                break;
            case 1:
                r.R((r) obj3, (ArrayList) obj, (w51) obj2);
                break;
            case 2:
                z zVar = (z) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(h51.B(null));
                arrayList2.add(h51.l(zVar.U));
                arrayList2.add(h51.B(null));
                arrayList2.add(h51.k(zVar.X));
                arrayList2.add(h51.B(null));
                arrayList2.add(h51.k(zVar.Y));
                arrayList2.add(h51.B(null));
                if (zVar.g0 != null) {
                    h51 e6 = h51.e(1, LocaleController.getString(R.string.AIEditorDeleteStyle));
                    e6.r = true;
                    arrayList2.add(e6);
                    arrayList2.add(h51.B(null));
                }
                arrayList2.add(h51.l(zVar.Z));
                break;
            case 3:
                ((h0) obj3).Q((ArrayList) obj, (w51) obj2);
                break;
            case 4:
                ((ChatActivityEnterView) obj3).f0((Canvas) obj, (Utilities.Callback0Return) obj2);
                break;
            case 5:
                xi xiVar = (xi) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                w51 w51Var3 = (w51) obj2;
                int i16 = xiVar.N;
                ArrayList arrayList4 = xiVar.K;
                MessagesController.SavedMusicList savedMusicList = xiVar.H;
                ArrayList arrayList5 = xiVar.I;
                HashSet hashSet = xiVar.G;
                ArrayList arrayList6 = xiVar.J;
                arrayList3.add(h51.D(-100, AndroidUtilities.dp(1.0f)));
                int size = arrayList3.size();
                if (TextUtils.isEmpty(xiVar.B)) {
                    w51Var3.U();
                    int i17 = 0;
                    while (i17 < xiVar.F.size()) {
                        MediaController.AudioEntry audioEntry2 = (MediaController.AudioEntry) xiVar.F.get(i17);
                        audioEntry2.messageObject.setQuery(str3);
                        h51 a12 = org.telegram.ui.Cells.g7.a(audioEntry2, new oi(xiVar, 0));
                        a12.K(hashSet.contains(audioEntry2));
                        a12.d = -1;
                        arrayList3.add(a12);
                        i17++;
                        str3 = null;
                    }
                    if (xiVar.E) {
                        arrayList3.add(h51.o(11, 4));
                        arrayList3.add(h51.o(12, 4));
                        arrayList3.add(h51.o(13, 4));
                    }
                    w51Var3.T();
                    if (savedMusicList != null) {
                        int size2 = savedMusicList.list.size();
                        if (size2 < arrayList5.size()) {
                            arrayList5.subList(size2, arrayList5.size()).clear();
                        }
                        int i18 = 0;
                        while (i18 < size2) {
                            if (i18 >= arrayList5.size()) {
                                audioEntry = new MediaController.AudioEntry();
                                arrayList5.add(audioEntry);
                            } else {
                                audioEntry = (MediaController.AudioEntry) arrayList5.get(i18);
                            }
                            if (audioEntry.messageObject != savedMusicList.list.get(i18)) {
                                MessageObject messageObject = savedMusicList.list.get(i18);
                                int i19 = xiVar.j0;
                                xiVar.j0 = i19 - 1;
                                w51Var = w51Var3;
                                i10 = i18;
                                audioEntry.id = i19;
                                audioEntry.messageObject = messageObject;
                            } else {
                                w51Var = w51Var3;
                                i10 = i18;
                            }
                            i18 = i10 + 1;
                            w51Var3 = w51Var;
                        }
                    }
                    w51 w51Var4 = w51Var3;
                    if (savedMusicList != null && arrayList5 != null && !arrayList5.isEmpty()) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(h51.A(-98, null));
                        }
                        w51Var4.U();
                        arrayList3.add(h51.s(45, LocaleController.getString(R.string.AudioSearchProfile)));
                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                            MediaController.AudioEntry audioEntry3 = (MediaController.AudioEntry) arrayList5.get(i20);
                            h51 a13 = org.telegram.ui.Cells.g7.a(audioEntry3, new oi(xiVar, 0));
                            a13.K(hashSet.contains(audioEntry3));
                            arrayList3.add(a13);
                        }
                        if (savedMusicList.loading) {
                            arrayList3.add(h51.o(41, 4));
                            arrayList3.add(h51.o(42, 4));
                            arrayList3.add(h51.o(43, 4));
                        }
                        if (!savedMusicList.loading && !savedMusicList.endReached) {
                            h51 c3 = h51.c(xiVar.P, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c3.q = true;
                            arrayList3.add(c3);
                        }
                        w51Var4.T();
                    }
                    if (arrayList6 != null && (!arrayList6.isEmpty() || xiVar.S >= 0 || xiVar.U)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(h51.A(-98, null));
                        }
                        w51Var4.U();
                        arrayList3.add(h51.s(((xiVar.S >= 0 || xiVar.U) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                            MediaController.AudioEntry audioEntry4 = (MediaController.AudioEntry) arrayList6.get(i21);
                            audioEntry4.messageObject.setQuery(xiVar.B);
                            h51 a14 = org.telegram.ui.Cells.g7.a(audioEntry4, new oi(xiVar, 0));
                            a14.K(hashSet.contains(audioEntry4));
                            arrayList3.add(a14);
                        }
                        if (xiVar.S >= 0 || xiVar.U) {
                            arrayList3.add(h51.o(21, 4));
                            arrayList3.add(h51.o(22, 4));
                            arrayList3.add(h51.o(23, 4));
                        }
                        if (xiVar.a0) {
                            h51 c10 = h51.c(i16, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c10.q = true;
                            arrayList3.add(c10);
                        }
                        w51Var4.T();
                    }
                } else {
                    String lowerCase = xiVar.B.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    boolean z17 = false;
                    for (int i22 = 0; i22 < xiVar.F.size(); i22++) {
                        MediaController.AudioEntry audioEntry5 = (MediaController.AudioEntry) xiVar.F.get(i22);
                        String str5 = audioEntry5.author;
                        if (str5 != null) {
                            String lowerCase2 = str5.toLowerCase();
                            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.y3.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                                z4 = true;
                                str2 = audioEntry5.title;
                                if (str2 == null) {
                                    String lowerCase3 = str2.toLowerCase();
                                    boolean z18 = z4;
                                    String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                                    z4 = z18 || lowerCase3.startsWith(lowerCase) || org.telegram.messenger.y3.w(" ", lowerCase, lowerCase3) || translitSafe3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe3);
                                }
                                if (z4) {
                                    if (!z17) {
                                        if (arrayList3.size() > size) {
                                            arrayList3.add(h51.A(-97, null));
                                        }
                                        w51Var3.U();
                                        arrayList3.add(h51.s(10, LocaleController.getString(R.string.AudioSearchLocal)));
                                        z17 = true;
                                    }
                                    audioEntry5.messageObject.setQuery(xiVar.B);
                                    h51 a15 = org.telegram.ui.Cells.g7.a(audioEntry5, new oi(xiVar, 0));
                                    a15.K(hashSet.contains(audioEntry5));
                                    a15.d = 10;
                                    arrayList3.add(a15);
                                }
                            }
                        }
                        z4 = false;
                        str2 = audioEntry5.title;
                        if (str2 == null) {
                        }
                        if (z4) {
                        }
                    }
                    w51Var3.T();
                    if (arrayList6 != null && (!arrayList6.isEmpty() || xiVar.S >= 0 || xiVar.U)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(h51.A(-98, null));
                        }
                        w51Var3.U();
                        arrayList3.add(h51.s(((xiVar.S >= 0 || xiVar.U) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                            MediaController.AudioEntry audioEntry6 = (MediaController.AudioEntry) arrayList6.get(i23);
                            audioEntry6.messageObject.setQuery(xiVar.B);
                            h51 a16 = org.telegram.ui.Cells.g7.a(audioEntry6, new oi(xiVar, 0));
                            a16.K(hashSet.contains(audioEntry6));
                            arrayList3.add(a16);
                        }
                        if (xiVar.S >= 0 || xiVar.U) {
                            arrayList3.add(h51.o(21, 4));
                            arrayList3.add(h51.o(22, 4));
                            arrayList3.add(h51.o(23, 4));
                        }
                        if (xiVar.a0) {
                            h51 c11 = h51.c(i16, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c11.q = true;
                            arrayList3.add(c11);
                        }
                        w51Var3.T();
                    }
                    if (arrayList4 != null && (!arrayList4.isEmpty() || xiVar.b0 >= 0 || xiVar.k0)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(h51.A(-96, null));
                        }
                        w51Var3.U();
                        arrayList3.add(h51.s(((xiVar.b0 >= 0 || xiVar.k0) && arrayList4.isEmpty()) ? 35 : 30, LocaleController.getString(R.string.AudioSearchGlobal)));
                        int size3 = arrayList4.size();
                        for (int i24 = 0; i24 < size3; i24++) {
                            MediaController.AudioEntry audioEntry7 = (MediaController.AudioEntry) arrayList4.get(i24);
                            audioEntry7.messageObject.setQuery(xiVar.B);
                            h51 a17 = org.telegram.ui.Cells.g7.a(audioEntry7, new oi(xiVar, 0));
                            a17.K(hashSet.contains(audioEntry7));
                            arrayList3.add(a17);
                        }
                        if (xiVar.b0 >= 0 || xiVar.k0) {
                            arrayList3.add(h51.o(31, 4));
                            arrayList3.add(h51.o(32, 4));
                            arrayList3.add(h51.o(33, 4));
                        }
                        if (xiVar.e0) {
                            h51 c12 = h51.c(xiVar.O, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c12.q = true;
                            arrayList3.add(c12);
                        }
                        w51Var3.T();
                    }
                }
                if (arrayList3.size() <= size && !xiVar.E) {
                    if (TextUtils.isEmpty(xiVar.B)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFiles);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i25 = vi.a;
                        h51 J = h51.J(vi.class);
                        J.l = string3;
                        J.m = string4;
                        arrayList3.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(xiVar.B.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, xiVar.B));
                        int i26 = vi.a;
                        h51 J2 = h51.J(vi.class);
                        J2.l = string5;
                        J2.m = replaceTags;
                        arrayList3.add(J2);
                    }
                }
                arrayList3.add(h51.A(-99, null));
                break;
            case 6:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                boolean z19 = ChatAttachAlertPhotoLayout.n1;
                chatAttachAlertPhotoLayout.getClass();
                ((Runnable) obj2).run();
                chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
                break;
            case 7:
                lr.R((lr) obj3, (ArrayList) obj);
                break;
            case 8:
                final rs rsVar = (rs) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                int i27 = rsVar.K;
                v2 v2Var = rsVar.e0;
                ArrayList arrayList8 = rsVar.Q;
                qs qsVar = rsVar.N;
                boolean z20 = rsVar.M;
                HashSet hashSet2 = new HashSet();
                if (TextUtils.isEmpty(rsVar.b0)) {
                    ArrayList<TLRPC.TL_topPeer> arrayList9 = MediaDataController.getInstance(i27).webapps;
                    ArrayList arrayList10 = new ArrayList();
                    if (arrayList9 != null) {
                        for (int i28 = 0; i28 < arrayList9.size(); i28++) {
                            TLRPC.User user = MessagesController.getInstance(i27).getUser(Long.valueOf(DialogObject.getPeerDialogId(arrayList9.get(i28).peer)));
                            if (user != null && user.bot) {
                                arrayList10.add(user);
                            }
                        }
                    }
                    rsVar.U = arrayList7.size();
                    if (!arrayList10.isEmpty() && !z20) {
                        if (arrayList10.size() > 5) {
                            final int i29 = 1;
                            arrayList7.add(h51.r(LocaleController.getString(R.string.SearchAppsMine), LocaleController.getString(rsVar.R ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.os
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i29) {
                                        case 0:
                                            rs rsVar2 = rsVar;
                                            rsVar2.S = !rsVar2.S;
                                            rsVar2.N(true);
                                            break;
                                        default:
                                            rs rsVar3 = rsVar;
                                            rsVar3.R = !rsVar3.R;
                                            rsVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList7.add(h51.q(LocaleController.getString(R.string.SearchAppsMine)));
                        }
                        for (int i30 = 0; i30 < arrayList10.size() && (i30 < 5 || rsVar.R); i30++) {
                            TLRPC.User user2 = (TLRPC.User) arrayList10.get(i30);
                            if (!hashSet2.contains(Long.valueOf(user2.id))) {
                                hashSet2.add(Long.valueOf(user2.id));
                                h51 v = h51.v(user2);
                                v.q = true;
                                v.t = true;
                                v.H = v2Var;
                                arrayList7.add(v);
                            }
                        }
                    }
                    hashSet2.clear();
                    rsVar.V = arrayList7.size();
                    ArrayList arrayList11 = qsVar.h;
                    if (arrayList11.isEmpty()) {
                        if (qsVar.c || !qsVar.e) {
                            if (!z20) {
                                arrayList7.add(h51.n(30));
                            }
                            arrayList7.add(h51.n(29));
                            arrayList7.add(h51.n(29));
                            arrayList7.add(h51.n(29));
                            arrayList7.add(h51.n(29));
                        }
                        z10 = false;
                    } else {
                        if (!z20) {
                            arrayList7.add(h51.q(LocaleController.getString(R.string.SearchAppsPopular)));
                        }
                        boolean z21 = false;
                        for (int i31 = 0; i31 < arrayList11.size(); i31++) {
                            TLRPC.User user3 = (TLRPC.User) arrayList11.get(i31);
                            if (!hashSet2.contains(Long.valueOf(user3.id))) {
                                hashSet2.add(Long.valueOf(user3.id));
                                h51 v10 = h51.v(user3);
                                v10.q = true;
                                v10.r = true;
                                v10.t = true;
                                v10.H = v2Var;
                                arrayList7.add(v10);
                                z21 = true;
                            }
                        }
                        if (qsVar.c || !qsVar.e) {
                            arrayList7.add(h51.n(29));
                            arrayList7.add(h51.n(29));
                            arrayList7.add(h51.n(29));
                        }
                        z10 = z21;
                    }
                    if (z10) {
                        arrayList7.add(h51.B(rsVar.T));
                        break;
                    }
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.addAll(rsVar.O);
                    arrayList12.addAll(rsVar.P);
                    if (!arrayList12.isEmpty()) {
                        if (arrayList12.size() <= 5 || arrayList8.isEmpty() || z20) {
                            arrayList7.add(h51.q(LocaleController.getString(R.string.SearchApps)));
                        } else {
                            final int i32 = 0;
                            arrayList7.add(h51.r(LocaleController.getString(R.string.SearchApps), LocaleController.getString(rsVar.S ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.os
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i32) {
                                        case 0:
                                            rs rsVar2 = rsVar;
                                            rsVar2.S = !rsVar2.S;
                                            rsVar2.N(true);
                                            break;
                                        default:
                                            rs rsVar3 = rsVar;
                                            rsVar3.R = !rsVar3.R;
                                            rsVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        }
                        int size4 = arrayList12.size();
                        if (!rsVar.S && !arrayList8.isEmpty() && !z20) {
                            size4 = Math.min(5, size4);
                        }
                        for (int i33 = 0; i33 < size4; i33++) {
                            h51 v11 = h51.v((TLObject) arrayList12.get(i33));
                            v11.t = true;
                            v11.H = v2Var;
                            arrayList7.add(v11);
                        }
                    }
                    if (!arrayList8.isEmpty() && !z20) {
                        arrayList7.add(h51.q(LocaleController.getString(R.string.SearchMessages)));
                        int size5 = arrayList8.size();
                        int i34 = 0;
                        while (i34 < size5) {
                            Object obj4 = arrayList8.get(i34);
                            i34++;
                            h51 h51Var = new h51(33);
                            h51Var.G = (MessageObject) obj4;
                            arrayList7.add(h51Var);
                        }
                        if (rsVar.Y) {
                            arrayList7.add(h51.n(1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                final yn0 yn0Var = (yn0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                ArrayList arrayList14 = yn0Var.M;
                ArrayList arrayList15 = yn0Var.S;
                int i35 = yn0Var.K;
                if (TextUtils.isEmpty(yn0Var.Y)) {
                    if (arrayList15 != null && !arrayList15.isEmpty()) {
                        if (arrayList15.size() > 5) {
                            arrayList13.add(h51.r(LocaleController.getString(R.string.SearchMyChannels), LocaleController.getString(yn0Var.R ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.ss
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i13) {
                                        case 0:
                                            yn0 yn0Var2 = yn0Var;
                                            yn0Var2.R = !yn0Var2.R;
                                            yn0Var2.N(true);
                                            if (yn0Var2.R) {
                                                AndroidUtilities.hideKeyboard(yn0Var2.a0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            yn0 yn0Var3 = yn0Var;
                                            yn0Var3.Q = !yn0Var3.Q;
                                            yn0Var3.N(true);
                                            if (yn0Var3.Q) {
                                                AndroidUtilities.hideKeyboard(yn0Var3.a0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList13.add(h51.q(LocaleController.getString(R.string.SearchMyChannels)));
                        }
                        int size6 = arrayList15.size();
                        if (!yn0Var.R) {
                            size6 = Math.min(5, size6);
                        }
                        for (int i36 = 0; i36 < size6; i36++) {
                            h51 v12 = h51.v((TLObject) arrayList15.get(i36));
                            v12.I = true;
                            arrayList13.add(v12);
                        }
                    }
                    MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i35).getCachedChannelRecommendations(0L);
                    if (cachedChannelRecommendations != null) {
                        ArrayList arrayList16 = new ArrayList();
                        ArrayList<TLObject> arrayList17 = cachedChannelRecommendations.chats;
                        int size7 = arrayList17.size();
                        int i37 = 0;
                        while (i37 < size7) {
                            TLObject tLObject = arrayList17.get(i37);
                            i37++;
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                TLRPC.Chat chat2 = MessagesController.getInstance(i35).getChat(Long.valueOf(chat.id));
                                if (ChatObject.isNotInChat(chat) && (chat2 == null || ChatObject.isNotInChat(chat2))) {
                                    arrayList16.add(chat);
                                }
                            }
                        }
                        if (!arrayList16.isEmpty()) {
                            arrayList13.add(h51.q(LocaleController.getString(R.string.SearchRecommendedChannels)));
                        }
                        int size8 = arrayList16.size();
                        while (i13 < size8) {
                            Object obj5 = arrayList16.get(i13);
                            i13++;
                            arrayList13.add(h51.v((TLRPC.Chat) obj5));
                        }
                        break;
                    } else {
                        arrayList13.add(h51.n(30));
                        arrayList13.add(h51.n(29));
                        arrayList13.add(h51.n(29));
                        arrayList13.add(h51.n(29));
                        arrayList13.add(h51.n(29));
                        break;
                    }
                } else {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = yn0Var.N;
                    int size9 = arrayList19.size();
                    int i38 = 0;
                    while (i38 < size9) {
                        Object obj6 = arrayList19.get(i38);
                        i38++;
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
                        TLRPC.Chat chat4 = MessagesController.getInstance(i35).getChat(Long.valueOf(chat3.id));
                        if (ChatObject.isNotInChat(chat3) && (chat4 == null || ChatObject.isNotInChat(chat4))) {
                            arrayList18.add(chat3);
                        }
                    }
                    ArrayList arrayList20 = yn0Var.O;
                    int size10 = arrayList20.size();
                    int i39 = 0;
                    while (i39 < size10) {
                        Object obj7 = arrayList20.get(i39);
                        i39++;
                        TLRPC.Chat chat5 = (TLRPC.Chat) obj7;
                        TLRPC.Chat chat6 = MessagesController.getInstance(i35).getChat(Long.valueOf(chat5.id));
                        if (ChatObject.isNotInChat(chat5) && (chat6 == null || ChatObject.isNotInChat(chat6))) {
                            arrayList18.add(chat5);
                        }
                    }
                    ArrayList arrayList21 = yn0Var.P;
                    int size11 = arrayList21.size();
                    int i40 = 0;
                    while (i40 < size11) {
                        Object obj8 = arrayList21.get(i40);
                        i40++;
                        TLRPC.Chat chat7 = (TLRPC.Chat) obj8;
                        TLRPC.Chat chat8 = MessagesController.getInstance(i35).getChat(Long.valueOf(chat7.id));
                        if (ChatObject.isNotInChat(chat7) && (chat8 == null || ChatObject.isNotInChat(chat8))) {
                            arrayList18.add(chat7);
                        }
                    }
                    if (!arrayList18.isEmpty()) {
                        if (arrayList18.size() <= 5 || arrayList14.isEmpty()) {
                            arrayList13.add(h51.q(LocaleController.getString(R.string.SearchChannels)));
                        } else {
                            final int i41 = 1;
                            arrayList13.add(h51.r(LocaleController.getString(R.string.SearchChannels), LocaleController.getString(yn0Var.Q ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.ss
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i41) {
                                        case 0:
                                            yn0 yn0Var2 = yn0Var;
                                            yn0Var2.R = !yn0Var2.R;
                                            yn0Var2.N(true);
                                            if (yn0Var2.R) {
                                                AndroidUtilities.hideKeyboard(yn0Var2.a0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            yn0 yn0Var3 = yn0Var;
                                            yn0Var3.Q = !yn0Var3.Q;
                                            yn0Var3.N(true);
                                            if (yn0Var3.Q) {
                                                AndroidUtilities.hideKeyboard(yn0Var3.a0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        }
                        int size12 = arrayList18.size();
                        if (!yn0Var.Q && !arrayList14.isEmpty()) {
                            size12 = Math.min(5, size12);
                        }
                        for (int i42 = 0; i42 < size12; i42++) {
                            arrayList13.add(h51.v((TLObject) arrayList18.get(i42)));
                        }
                    }
                    if (!arrayList14.isEmpty()) {
                        arrayList13.add(h51.q(LocaleController.getString(R.string.SearchMessages)));
                        int size13 = arrayList14.size();
                        int i43 = 0;
                        while (i43 < size13) {
                            Object obj9 = arrayList14.get(i43);
                            i43++;
                            h51 h51Var2 = new h51(33);
                            h51Var2.G = (MessageObject) obj9;
                            arrayList13.add(h51Var2);
                        }
                        if (yn0Var.V) {
                            arrayList13.add(h51.n(1));
                            break;
                        }
                    }
                }
                break;
            case 10:
                a(obj, obj2);
                break;
            case 11:
                b(obj, obj2);
                break;
            case 12:
                c(obj, obj2);
                break;
            case 13:
                d(obj, obj2);
                break;
            case 14:
                ((ArrayList) obj).add(h51.j(-1, ((a40) obj3).U));
                break;
            case 15:
                e(obj, obj2);
                break;
            case 16:
                f(obj, obj2);
                break;
            case 17:
                g(obj, obj2);
                break;
            case 18:
                h(obj, obj2);
                break;
            case 19:
                i(obj, obj2);
                break;
            case 20:
                j(obj, obj2);
                break;
            case 21:
                v31.p((v31) obj3, (String) obj, (Boolean) obj2);
                break;
            default:
                ((b61) obj3).U((ArrayList) obj, (w51) obj2);
                break;
        }
    }
}
