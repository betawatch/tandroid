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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        kz kzVar = (kz) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        sy syVar = kzVar.O1;
        if (syVar == null || !(syVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            return;
        }
        ((CompoundEmoji.CompoundEmojiDrawable) kzVar.O1.getDrawable()).update(num.intValue(), num2.intValue());
        String str = (String) kzVar.O1.getTag();
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
        jy jyVar = (jy) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = jyVar.s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ay ayVar = (ay) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ayVar.b;
            if (tL_messages_stickerSet != null) {
                boolean z4 = tL_messages_stickerSet.set.id == jyVar.d;
                int i11 = ly.a;
                i51 J = i51.J(ly.class);
                long j10 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z4;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = ayVar.a;
                if (stickerSetCovered != null) {
                    arrayList.add(ly.a(stickerSetCovered, ayVar, stickerSetCovered.set.id == jyVar.d));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        fz fzVar = (fz) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = fzVar.B;
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
                boolean z4 = tL_messages_stickerSet.set.id == fzVar.d;
                int i11 = ly.a;
                i51 J = i51.J(ly.class);
                long j10 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z4;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = fzVar.G;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            ay ayVar = (ay) obj4;
            TLRPC.StickerSet stickerSet = ayVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(ly.a(ayVar.a, ayVar, stickerSet.id == fzVar.d));
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
        g40 g40Var = (g40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        g40Var.c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(g40Var.a).history);
        if (g40Var.c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < g40Var.c.size(); i10++) {
            String str = (String) g40Var.c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(i51.c(i10 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(i51.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        nh.f6 f6Var;
        h40 h40Var = (h40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = h40Var.L;
        int i10 = 0;
        boolean z4 = h40Var.M && (f6Var = h40Var.N) != null && f6Var.i.size() > 0;
        if (z4) {
            nh.f6 f6Var2 = h40Var.N;
            int i11 = tf.w0.a;
            i51 J = i51.J(tf.w0.class);
            J.G = f6Var2;
            arrayList.add(J);
        }
        h40Var.O = z4;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            i51 i51Var = new i51(33);
            i51Var.d = i12;
            i51Var.G = messageObject;
            arrayList.add(i51Var);
            i10 = i12;
        }
        if (h40Var.P || !h40Var.S) {
            arrayList.add(i51.o(-2, 1));
            arrayList.add(i51.o(-3, 1));
            arrayList.add(i51.o(-4, 1));
        }
        if (h40Var.O || !z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new up(h40Var, 20));
    }

    private final void g(Object obj, Object obj2) {
        n70 n70Var = (n70) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        p70 p70Var = n70Var.x;
        p70Var.f.setAlpha(1.0f);
        if (p70Var.u) {
            n70Var.c = bitmap;
        }
        sg.b bVar = p70Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            tg.c.c(p70Var.n, n70Var);
            ViewGroup viewGroup = p70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        fh0 fh0Var = (fh0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = fh0Var.e;
        ArrayList arrayList3 = fh0Var.n;
        int i10 = 0;
        if (fh0Var.d == null) {
            arrayList.add(i51.o(-1, 7));
            arrayList.add(i51.o(-2, 7));
            arrayList.add(i51.o(-3, 7));
            fh0Var.N = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(fh0Var.w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(i51.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                i51 i51Var = new i51(33);
                i51Var.G = (MessageObject) obj3;
                arrayList.add(i51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(i51.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                i51 i51Var2 = new i51(33);
                i51Var2.G = (MessageObject) obj4;
                arrayList.add(i51Var2);
            }
        }
        if (fh0Var.v || ((fh0Var.J && !fh0Var.K) || (!isEmpty && !arrayList3.isEmpty() && !fh0Var.s))) {
            arrayList.add(i51.o(fh0Var.I * 3, 7));
            arrayList.add(i51.o((fh0Var.I * 3) + 1, 7));
            arrayList.add(i51.o((fh0Var.I * 3) + 2, 7));
        }
        fh0Var.N = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        hm0 hm0Var = (hm0) this.b;
        hm0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        hm0Var.e = paint;
        Bitmap bitmap = hm0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        hm0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        hm0Var.f = new Matrix();
        sg.b bVar = hm0Var.h;
        bVar.a((Bitmap) obj2);
        tg.c.c(bVar, hm0Var.s);
        ViewGroup viewGroup = hm0Var.y;
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
        i51 a2;
        TL_iv.RichMessage richMessage;
        i51 a10;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        i51 a11;
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
                arrayList.add(i51.B(null));
                arrayList.add(i51.l(f0Var.s0));
                arrayList.add(i51.B(null));
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
                    arrayList.add(a41.a(5, str, vh.w2.k(D2, ""), substring, new b(f0Var, i12), f0Var.q0, new b(f0Var, i14), null));
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
                    arrayList.add(i51.k(e0Var));
                    if (e0Var.getSelectedTone() instanceof b0) {
                        arrayList.add(i51.j(10, f0Var.w0));
                        w51Var2.T();
                        arrayList.add(i51.A(11, null));
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
                arrayList.add(i51.B(null));
                break;
            case 1:
                r.R((r) obj3, (ArrayList) obj, (w51) obj2);
                break;
            case 2:
                z zVar = (z) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(i51.B(null));
                arrayList2.add(i51.l(zVar.U));
                arrayList2.add(i51.B(null));
                arrayList2.add(i51.k(zVar.X));
                arrayList2.add(i51.B(null));
                arrayList2.add(i51.k(zVar.Y));
                arrayList2.add(i51.B(null));
                if (zVar.g0 != null) {
                    i51 e = i51.e(1, LocaleController.getString(R.string.AIEditorDeleteStyle));
                    e.r = true;
                    arrayList2.add(e);
                    arrayList2.add(i51.B(null));
                }
                arrayList2.add(i51.l(zVar.Z));
                break;
            case 3:
                ((h0) obj3).Q((ArrayList) obj, (w51) obj2);
                break;
            case 4:
                ((ChatActivityEnterView) obj3).f0((Canvas) obj, (Utilities.Callback0Return) obj2);
                break;
            case 5:
                wi wiVar = (wi) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                w51 w51Var3 = (w51) obj2;
                int i16 = wiVar.N;
                ArrayList arrayList4 = wiVar.K;
                MessagesController.SavedMusicList savedMusicList = wiVar.H;
                ArrayList arrayList5 = wiVar.I;
                HashSet hashSet = wiVar.G;
                ArrayList arrayList6 = wiVar.J;
                arrayList3.add(i51.D(-100, AndroidUtilities.dp(1.0f)));
                int size = arrayList3.size();
                if (TextUtils.isEmpty(wiVar.B)) {
                    w51Var3.U();
                    int i17 = 0;
                    while (i17 < wiVar.F.size()) {
                        MediaController.AudioEntry audioEntry2 = (MediaController.AudioEntry) wiVar.F.get(i17);
                        audioEntry2.messageObject.setQuery(str3);
                        i51 a12 = org.telegram.ui.Cells.f7.a(audioEntry2, new ni(wiVar, 0));
                        a12.K(hashSet.contains(audioEntry2));
                        a12.d = -1;
                        arrayList3.add(a12);
                        i17++;
                        str3 = null;
                    }
                    if (wiVar.E) {
                        arrayList3.add(i51.o(11, 4));
                        arrayList3.add(i51.o(12, 4));
                        arrayList3.add(i51.o(13, 4));
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
                                int i19 = wiVar.j0;
                                wiVar.j0 = i19 - 1;
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
                            arrayList3.add(i51.A(-98, null));
                        }
                        w51Var4.U();
                        arrayList3.add(i51.s(45, LocaleController.getString(R.string.AudioSearchProfile)));
                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                            MediaController.AudioEntry audioEntry3 = (MediaController.AudioEntry) arrayList5.get(i20);
                            i51 a13 = org.telegram.ui.Cells.f7.a(audioEntry3, new ni(wiVar, 0));
                            a13.K(hashSet.contains(audioEntry3));
                            arrayList3.add(a13);
                        }
                        if (savedMusicList.loading) {
                            arrayList3.add(i51.o(41, 4));
                            arrayList3.add(i51.o(42, 4));
                            arrayList3.add(i51.o(43, 4));
                        }
                        if (!savedMusicList.loading && !savedMusicList.endReached) {
                            i51 c3 = i51.c(wiVar.P, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c3.q = true;
                            arrayList3.add(c3);
                        }
                        w51Var4.T();
                    }
                    if (arrayList6 != null && (!arrayList6.isEmpty() || wiVar.S >= 0 || wiVar.U)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(i51.A(-98, null));
                        }
                        w51Var4.U();
                        arrayList3.add(i51.s(((wiVar.S >= 0 || wiVar.U) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                            MediaController.AudioEntry audioEntry4 = (MediaController.AudioEntry) arrayList6.get(i21);
                            audioEntry4.messageObject.setQuery(wiVar.B);
                            i51 a14 = org.telegram.ui.Cells.f7.a(audioEntry4, new ni(wiVar, 0));
                            a14.K(hashSet.contains(audioEntry4));
                            arrayList3.add(a14);
                        }
                        if (wiVar.S >= 0 || wiVar.U) {
                            arrayList3.add(i51.o(21, 4));
                            arrayList3.add(i51.o(22, 4));
                            arrayList3.add(i51.o(23, 4));
                        }
                        if (wiVar.a0) {
                            i51 c10 = i51.c(i16, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c10.q = true;
                            arrayList3.add(c10);
                        }
                        w51Var4.T();
                    }
                } else {
                    String lowerCase = wiVar.B.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    boolean z17 = false;
                    for (int i22 = 0; i22 < wiVar.F.size(); i22++) {
                        MediaController.AudioEntry audioEntry5 = (MediaController.AudioEntry) wiVar.F.get(i22);
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
                                            arrayList3.add(i51.A(-97, null));
                                        }
                                        w51Var3.U();
                                        arrayList3.add(i51.s(10, LocaleController.getString(R.string.AudioSearchLocal)));
                                        z17 = true;
                                    }
                                    audioEntry5.messageObject.setQuery(wiVar.B);
                                    i51 a15 = org.telegram.ui.Cells.f7.a(audioEntry5, new ni(wiVar, 0));
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
                    if (arrayList6 != null && (!arrayList6.isEmpty() || wiVar.S >= 0 || wiVar.U)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(i51.A(-98, null));
                        }
                        w51Var3.U();
                        arrayList3.add(i51.s(((wiVar.S >= 0 || wiVar.U) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                            MediaController.AudioEntry audioEntry6 = (MediaController.AudioEntry) arrayList6.get(i23);
                            audioEntry6.messageObject.setQuery(wiVar.B);
                            i51 a16 = org.telegram.ui.Cells.f7.a(audioEntry6, new ni(wiVar, 0));
                            a16.K(hashSet.contains(audioEntry6));
                            arrayList3.add(a16);
                        }
                        if (wiVar.S >= 0 || wiVar.U) {
                            arrayList3.add(i51.o(21, 4));
                            arrayList3.add(i51.o(22, 4));
                            arrayList3.add(i51.o(23, 4));
                        }
                        if (wiVar.a0) {
                            i51 c11 = i51.c(i16, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c11.q = true;
                            arrayList3.add(c11);
                        }
                        w51Var3.T();
                    }
                    if (arrayList4 != null && (!arrayList4.isEmpty() || wiVar.b0 >= 0 || wiVar.k0)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(i51.A(-96, null));
                        }
                        w51Var3.U();
                        arrayList3.add(i51.s(((wiVar.b0 >= 0 || wiVar.k0) && arrayList4.isEmpty()) ? 35 : 30, LocaleController.getString(R.string.AudioSearchGlobal)));
                        int size3 = arrayList4.size();
                        for (int i24 = 0; i24 < size3; i24++) {
                            MediaController.AudioEntry audioEntry7 = (MediaController.AudioEntry) arrayList4.get(i24);
                            audioEntry7.messageObject.setQuery(wiVar.B);
                            i51 a17 = org.telegram.ui.Cells.f7.a(audioEntry7, new ni(wiVar, 0));
                            a17.K(hashSet.contains(audioEntry7));
                            arrayList3.add(a17);
                        }
                        if (wiVar.b0 >= 0 || wiVar.k0) {
                            arrayList3.add(i51.o(31, 4));
                            arrayList3.add(i51.o(32, 4));
                            arrayList3.add(i51.o(33, 4));
                        }
                        if (wiVar.e0) {
                            i51 c12 = i51.c(wiVar.O, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c12.q = true;
                            arrayList3.add(c12);
                        }
                        w51Var3.T();
                    }
                }
                if (arrayList3.size() <= size && !wiVar.E) {
                    if (TextUtils.isEmpty(wiVar.B)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFiles);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i25 = ui.a;
                        i51 J = i51.J(ui.class);
                        J.l = string3;
                        J.m = string4;
                        arrayList3.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(wiVar.B.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, wiVar.B));
                        int i26 = ui.a;
                        i51 J2 = i51.J(ui.class);
                        J2.l = string5;
                        J2.m = replaceTags;
                        arrayList3.add(J2);
                    }
                }
                arrayList3.add(i51.A(-99, null));
                break;
            case 6:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                boolean z19 = ChatAttachAlertPhotoLayout.n1;
                chatAttachAlertPhotoLayout.getClass();
                ((Runnable) obj2).run();
                chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
                break;
            case 7:
                ir.R((ir) obj3, (ArrayList) obj);
                break;
            case 8:
                final os osVar = (os) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                int i27 = osVar.K;
                v2 v2Var = osVar.e0;
                ArrayList arrayList8 = osVar.Q;
                ns nsVar = osVar.N;
                boolean z20 = osVar.M;
                HashSet hashSet2 = new HashSet();
                if (TextUtils.isEmpty(osVar.b0)) {
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
                    osVar.U = arrayList7.size();
                    if (!arrayList10.isEmpty() && !z20) {
                        if (arrayList10.size() > 5) {
                            final int i29 = 1;
                            arrayList7.add(i51.r(LocaleController.getString(R.string.SearchAppsMine), LocaleController.getString(osVar.R ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.ls
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i29) {
                                        case 0:
                                            os osVar2 = osVar;
                                            osVar2.S = !osVar2.S;
                                            osVar2.N(true);
                                            break;
                                        default:
                                            os osVar3 = osVar;
                                            osVar3.R = !osVar3.R;
                                            osVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList7.add(i51.q(LocaleController.getString(R.string.SearchAppsMine)));
                        }
                        for (int i30 = 0; i30 < arrayList10.size() && (i30 < 5 || osVar.R); i30++) {
                            TLRPC.User user2 = (TLRPC.User) arrayList10.get(i30);
                            if (!hashSet2.contains(Long.valueOf(user2.id))) {
                                hashSet2.add(Long.valueOf(user2.id));
                                i51 v = i51.v(user2);
                                v.q = true;
                                v.t = true;
                                v.H = v2Var;
                                arrayList7.add(v);
                            }
                        }
                    }
                    hashSet2.clear();
                    osVar.V = arrayList7.size();
                    ArrayList arrayList11 = nsVar.h;
                    if (arrayList11.isEmpty()) {
                        if (nsVar.c || !nsVar.e) {
                            if (!z20) {
                                arrayList7.add(i51.n(30));
                            }
                            arrayList7.add(i51.n(29));
                            arrayList7.add(i51.n(29));
                            arrayList7.add(i51.n(29));
                            arrayList7.add(i51.n(29));
                        }
                        z10 = false;
                    } else {
                        if (!z20) {
                            arrayList7.add(i51.q(LocaleController.getString(R.string.SearchAppsPopular)));
                        }
                        boolean z21 = false;
                        for (int i31 = 0; i31 < arrayList11.size(); i31++) {
                            TLRPC.User user3 = (TLRPC.User) arrayList11.get(i31);
                            if (!hashSet2.contains(Long.valueOf(user3.id))) {
                                hashSet2.add(Long.valueOf(user3.id));
                                i51 v10 = i51.v(user3);
                                v10.q = true;
                                v10.r = true;
                                v10.t = true;
                                v10.H = v2Var;
                                arrayList7.add(v10);
                                z21 = true;
                            }
                        }
                        if (nsVar.c || !nsVar.e) {
                            arrayList7.add(i51.n(29));
                            arrayList7.add(i51.n(29));
                            arrayList7.add(i51.n(29));
                        }
                        z10 = z21;
                    }
                    if (z10) {
                        arrayList7.add(i51.B(osVar.T));
                        break;
                    }
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.addAll(osVar.O);
                    arrayList12.addAll(osVar.P);
                    if (!arrayList12.isEmpty()) {
                        if (arrayList12.size() <= 5 || arrayList8.isEmpty() || z20) {
                            arrayList7.add(i51.q(LocaleController.getString(R.string.SearchApps)));
                        } else {
                            final int i32 = 0;
                            arrayList7.add(i51.r(LocaleController.getString(R.string.SearchApps), LocaleController.getString(osVar.S ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.ls
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i32) {
                                        case 0:
                                            os osVar2 = osVar;
                                            osVar2.S = !osVar2.S;
                                            osVar2.N(true);
                                            break;
                                        default:
                                            os osVar3 = osVar;
                                            osVar3.R = !osVar3.R;
                                            osVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        }
                        int size4 = arrayList12.size();
                        if (!osVar.S && !arrayList8.isEmpty() && !z20) {
                            size4 = Math.min(5, size4);
                        }
                        for (int i33 = 0; i33 < size4; i33++) {
                            i51 v11 = i51.v((TLObject) arrayList12.get(i33));
                            v11.t = true;
                            v11.H = v2Var;
                            arrayList7.add(v11);
                        }
                    }
                    if (!arrayList8.isEmpty() && !z20) {
                        arrayList7.add(i51.q(LocaleController.getString(R.string.SearchMessages)));
                        int size5 = arrayList8.size();
                        int i34 = 0;
                        while (i34 < size5) {
                            Object obj4 = arrayList8.get(i34);
                            i34++;
                            i51 i51Var = new i51(33);
                            i51Var.G = (MessageObject) obj4;
                            arrayList7.add(i51Var);
                        }
                        if (osVar.Y) {
                            arrayList7.add(i51.n(1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                final xn0 xn0Var = (xn0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                ArrayList arrayList14 = xn0Var.M;
                ArrayList arrayList15 = xn0Var.S;
                int i35 = xn0Var.K;
                if (TextUtils.isEmpty(xn0Var.Y)) {
                    if (arrayList15 != null && !arrayList15.isEmpty()) {
                        if (arrayList15.size() > 5) {
                            arrayList13.add(i51.r(LocaleController.getString(R.string.SearchMyChannels), LocaleController.getString(xn0Var.R ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.ps
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i13) {
                                        case 0:
                                            xn0 xn0Var2 = xn0Var;
                                            xn0Var2.R = !xn0Var2.R;
                                            xn0Var2.N(true);
                                            if (xn0Var2.R) {
                                                AndroidUtilities.hideKeyboard(xn0Var2.a0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            xn0 xn0Var3 = xn0Var;
                                            xn0Var3.Q = !xn0Var3.Q;
                                            xn0Var3.N(true);
                                            if (xn0Var3.Q) {
                                                AndroidUtilities.hideKeyboard(xn0Var3.a0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList13.add(i51.q(LocaleController.getString(R.string.SearchMyChannels)));
                        }
                        int size6 = arrayList15.size();
                        if (!xn0Var.R) {
                            size6 = Math.min(5, size6);
                        }
                        for (int i36 = 0; i36 < size6; i36++) {
                            i51 v12 = i51.v((TLObject) arrayList15.get(i36));
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
                            arrayList13.add(i51.q(LocaleController.getString(R.string.SearchRecommendedChannels)));
                        }
                        int size8 = arrayList16.size();
                        while (i13 < size8) {
                            Object obj5 = arrayList16.get(i13);
                            i13++;
                            arrayList13.add(i51.v((TLRPC.Chat) obj5));
                        }
                        break;
                    } else {
                        arrayList13.add(i51.n(30));
                        arrayList13.add(i51.n(29));
                        arrayList13.add(i51.n(29));
                        arrayList13.add(i51.n(29));
                        arrayList13.add(i51.n(29));
                        break;
                    }
                } else {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = xn0Var.N;
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
                    ArrayList arrayList20 = xn0Var.O;
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
                    ArrayList arrayList21 = xn0Var.P;
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
                            arrayList13.add(i51.q(LocaleController.getString(R.string.SearchChannels)));
                        } else {
                            final int i41 = 1;
                            arrayList13.add(i51.r(LocaleController.getString(R.string.SearchChannels), LocaleController.getString(xn0Var.Q ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.ps
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i41) {
                                        case 0:
                                            xn0 xn0Var2 = xn0Var;
                                            xn0Var2.R = !xn0Var2.R;
                                            xn0Var2.N(true);
                                            if (xn0Var2.R) {
                                                AndroidUtilities.hideKeyboard(xn0Var2.a0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            xn0 xn0Var3 = xn0Var;
                                            xn0Var3.Q = !xn0Var3.Q;
                                            xn0Var3.N(true);
                                            if (xn0Var3.Q) {
                                                AndroidUtilities.hideKeyboard(xn0Var3.a0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        }
                        int size12 = arrayList18.size();
                        if (!xn0Var.Q && !arrayList14.isEmpty()) {
                            size12 = Math.min(5, size12);
                        }
                        for (int i42 = 0; i42 < size12; i42++) {
                            arrayList13.add(i51.v((TLObject) arrayList18.get(i42)));
                        }
                    }
                    if (!arrayList14.isEmpty()) {
                        arrayList13.add(i51.q(LocaleController.getString(R.string.SearchMessages)));
                        int size13 = arrayList14.size();
                        int i43 = 0;
                        while (i43 < size13) {
                            Object obj9 = arrayList14.get(i43);
                            i43++;
                            i51 i51Var2 = new i51(33);
                            i51Var2.G = (MessageObject) obj9;
                            arrayList13.add(i51Var2);
                        }
                        if (xn0Var.V) {
                            arrayList13.add(i51.n(1));
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
                ((ArrayList) obj).add(i51.j(-1, ((z30) obj3).U));
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
