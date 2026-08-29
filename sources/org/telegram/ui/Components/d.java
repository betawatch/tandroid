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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        fz fzVar = (fz) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        ny nyVar = fzVar.N1;
        if (nyVar == null || !(nyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            return;
        }
        ((CompoundEmoji.CompoundEmojiDrawable) fzVar.N1.getDrawable()).update(num.intValue(), num2.intValue());
        String str = (String) fzVar.N1.getTag();
        if (num.intValue() == -1 && num2.intValue() == -1) {
            Emoji.emojiColor.remove(str);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(num.intValue() >= 0 ? CompoundEmoji.skinTones.get(num.intValue()) : "");
            sb2.append("\u200d");
            sb2.append(num2.intValue() >= 0 ? CompoundEmoji.skinTones.get(num2.intValue()) : "");
            Emoji.emojiColor.put(str, sb2.toString());
        }
        Emoji.saveEmojiColors();
    }

    private final void b(Object obj, Object obj2) {
        ey eyVar = (ey) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = eyVar.s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            wx wxVar = (wx) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = wxVar.b;
            if (tL_messages_stickerSet != null) {
                boolean z10 = tL_messages_stickerSet.set.id == eyVar.d;
                int i11 = gy.a;
                w41 J = w41.J(gy.class);
                long j10 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = wxVar.a;
                if (stickerSetCovered != null) {
                    arrayList.add(gy.a(stickerSetCovered, wxVar, stickerSetCovered.set.id == eyVar.d));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        az azVar = (az) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = azVar.A;
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
                boolean z10 = tL_messages_stickerSet.set.id == azVar.d;
                int i11 = gy.a;
                w41 J = w41.J(gy.class);
                long j10 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = azVar.F;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            wx wxVar = (wx) obj4;
            TLRPC.StickerSet stickerSet = wxVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(gy.a(wxVar.a, wxVar, stickerSet.id == azVar.d));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        float[] fArr = FragmentContextView.I0;
        fragmentContextView.v0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.R;
        org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.D;
        float floatValue = ((Float) obj).floatValue();
        c1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        b40 b40Var = (b40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        b40Var.c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(b40Var.a).history);
        if (b40Var.c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < b40Var.c.size(); i10++) {
            String str = (String) b40Var.c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(w41.c(i10 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(w41.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        lh.e6 e6Var;
        c40 c40Var = (c40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = c40Var.K;
        int i10 = 0;
        boolean z10 = c40Var.L && (e6Var = c40Var.M) != null && e6Var.i.size() > 0;
        if (z10) {
            lh.e6 e6Var2 = c40Var.M;
            int i11 = rf.x0.a;
            w41 J = w41.J(rf.x0.class);
            J.G = e6Var2;
            arrayList.add(J);
        }
        c40Var.N = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            w41 w41Var = new w41(33);
            w41Var.d = i12;
            w41Var.G = messageObject;
            arrayList.add(w41Var);
            i10 = i12;
        }
        if (c40Var.O || !c40Var.R) {
            arrayList.add(w41.o(-2, 1));
            arrayList.add(w41.o(-3, 1));
            arrayList.add(w41.o(-4, 1));
        }
        if (c40Var.N || !z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new rp(c40Var, 20));
    }

    private final void g(Object obj, Object obj2) {
        h70 h70Var = (h70) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        j70 j70Var = h70Var.x;
        j70Var.f.setAlpha(1.0f);
        if (j70Var.u) {
            h70Var.c = bitmap;
        }
        qg.b bVar = j70Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            rg.c.c(j70Var.n, h70Var);
            ViewGroup viewGroup = j70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        ug0 ug0Var = (ug0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = ug0Var.e;
        ArrayList arrayList3 = ug0Var.n;
        int i10 = 0;
        if (ug0Var.d == null) {
            arrayList.add(w41.o(-1, 7));
            arrayList.add(w41.o(-2, 7));
            arrayList.add(w41.o(-3, 7));
            ug0Var.M = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(ug0Var.w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(w41.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                w41 w41Var = new w41(33);
                w41Var.G = (MessageObject) obj3;
                arrayList.add(w41Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(w41.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                w41 w41Var2 = new w41(33);
                w41Var2.G = (MessageObject) obj4;
                arrayList.add(w41Var2);
            }
        }
        if (ug0Var.v || ((ug0Var.I && !ug0Var.J) || (!isEmpty && !arrayList3.isEmpty() && !ug0Var.s))) {
            arrayList.add(w41.o(ug0Var.H * 3, 7));
            arrayList.add(w41.o((ug0Var.H * 3) + 1, 7));
            arrayList.add(w41.o((ug0Var.H * 3) + 2, 7));
        }
        ug0Var.M = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        yl0 yl0Var = (yl0) this.b;
        yl0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        yl0Var.e = paint;
        Bitmap bitmap = yl0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        yl0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        yl0Var.f = new Matrix();
        qg.b bVar = yl0Var.h;
        bVar.a((Bitmap) obj2);
        rg.c.c(bVar, yl0Var.s);
        ViewGroup viewGroup = yl0Var.y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        nx0 nx0Var = (nx0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        nx0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(nx0Var.O.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new a2((Utilities.Callback) obj2, 14));
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
        w41 a2;
        TL_iv.RichMessage richMessage;
        w41 a10;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        w41 a11;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        boolean z10;
        String str2;
        MediaController.AudioEntry audioEntry;
        k51 k51Var;
        int i10;
        boolean z11;
        int i11 = this.a;
        String str3 = null;
        int i12 = 5;
        final int i13 = 0;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                g0 g0Var = (g0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                k51 k51Var2 = (k51) obj2;
                boolean[] zArr = g0Var.l0;
                boolean[] zArr2 = g0Var.m0;
                f0 f0Var = g0Var.t0;
                arrayList.add(w41.B(null));
                arrayList.add(w41.l(g0Var.r0));
                arrayList.add(w41.B(null));
                k51Var2.A = 1;
                k51Var2.U();
                f0 f0Var2 = g0Var.s0;
                int selectedTab = f0Var2 != null ? f0Var2.getSelectedTab() : 0;
                int i14 = 6;
                int i15 = 7;
                if (selectedTab == 0) {
                    String str4 = g0Var.n0;
                    if (str4 == null || str4.equalsIgnoreCase(TranslateController.UNKNOWN_LANGUAGE)) {
                        arrayList.add(p31.b(3, LocaleController.getString(R.string.AIEditorOriginalText), null, null, null));
                    } else {
                        String D = k31.D(g0Var.n0, null, zArr2);
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
                            D = k31.y(D);
                        }
                        arrayList.add(p31.b(3, substring2, D, substring3, null));
                    }
                    arrayList.add(g0Var.i0() ? g0Var.j0(4, g0Var.U, false) : t31.a(4, g0Var.T, g0Var.L0, new b(g0Var, 4), null, null));
                    String D2 = k31.D(g0Var.o0, zArr, null);
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
                        D2 = k31.y(D2);
                    }
                    arrayList.add(p31.a(5, str, u3.c.k(D2, ""), substring, new b(g0Var, i12), g0Var.p0, new b(g0Var, i14), null));
                    if (g0Var.i0()) {
                        boolean z12 = g0Var.V;
                        if (z12 || (richMessage3 = g0Var.X) == null) {
                            richMessage3 = g0Var.U;
                        }
                        a11 = g0Var.j0(6, richMessage3, z12);
                    } else {
                        boolean z13 = g0Var.V;
                        a11 = t31.a(z13 ? 7 : 6, g0Var.W, false, null, null, !z13 ? new b(g0Var, i15) : null);
                    }
                    arrayList.add(a11);
                } else if (selectedTab == 1) {
                    arrayList.add(w41.k(f0Var));
                    if (f0Var.getSelectedTone() instanceof c0) {
                        arrayList.add(w41.j(10, g0Var.v0));
                        k51Var2.T();
                        arrayList.add(w41.A(11, null));
                        k51Var2.U();
                    }
                    if ((f0Var.getSelectedTab() >= 0 || g0Var.p0) && (!(f0Var.getSelectedTone() instanceof c0) || TextUtils.equals(g0Var.w0.getText().toString(), g0Var.E0))) {
                        arrayList.add(p31.a(7, LocaleController.getString(R.string.AIEditorResult), null, null, null, g0Var.p0, new b(g0Var, i14), null));
                        if (g0Var.i0()) {
                            boolean z14 = g0Var.Y;
                            if (z14 || (richMessage2 = g0Var.a0) == null) {
                                richMessage2 = g0Var.U;
                            }
                            a10 = g0Var.j0(8, richMessage2, z14);
                        } else {
                            boolean z15 = g0Var.Y;
                            a10 = t31.a(z15 ? 7 : 6, g0Var.Z, false, null, null, !z15 ? new b(g0Var, i15) : null);
                        }
                        arrayList.add(a10);
                    } else {
                        arrayList.add(p31.a(5, LocaleController.getString(R.string.AIEditorOriginal), null, null, null, g0Var.p0, new b(g0Var, i14), null));
                        arrayList.add(g0Var.i0() ? g0Var.j0(6, g0Var.U, false) : t31.a(g0Var.Y ? 7 : 6, g0Var.T, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(p31.b(3, LocaleController.getString(R.string.AIEditorOriginal), null, null, null));
                    arrayList.add(g0Var.i0() ? g0Var.j0(4, g0Var.U, false) : t31.a(4, g0Var.T, g0Var.L0, new b(g0Var, 4), null, null));
                    arrayList.add(p31.b(5, LocaleController.getString(R.string.AIEditorResult), null, null, null));
                    if (g0Var.i0()) {
                        boolean z16 = g0Var.b0;
                        if (z16 || (richMessage = g0Var.d0) == null) {
                            richMessage = g0Var.U;
                        }
                        a2 = g0Var.j0(6, richMessage, z16);
                    } else {
                        boolean z17 = g0Var.b0;
                        a2 = t31.a(z17 ? 7 : 6, g0Var.c0, false, null, null, !z17 ? new b(g0Var, i15) : null);
                    }
                    arrayList.add(a2);
                }
                k51Var2.T();
                arrayList.add(w41.B(null));
                break;
            case 1:
                s.R((s) obj3, (ArrayList) obj, (k51) obj2);
                break;
            case 2:
                a0 a0Var = (a0) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(w41.B(null));
                arrayList2.add(w41.l(a0Var.T));
                arrayList2.add(w41.B(null));
                arrayList2.add(w41.k(a0Var.W));
                arrayList2.add(w41.B(null));
                arrayList2.add(w41.k(a0Var.X));
                arrayList2.add(w41.B(null));
                if (a0Var.f0 != null) {
                    w41 e10 = w41.e(1, LocaleController.getString(R.string.AIEditorDeleteStyle));
                    e10.r = true;
                    arrayList2.add(e10);
                    arrayList2.add(w41.B(null));
                }
                arrayList2.add(w41.l(a0Var.Y));
                break;
            case 3:
                ((i0) obj3).Q((ArrayList) obj, (k51) obj2);
                break;
            case 4:
                ((ChatActivityEnterView) obj3).f0((Canvas) obj, (Utilities.Callback0Return) obj2);
                break;
            case 5:
                yi yiVar = (yi) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                k51 k51Var3 = (k51) obj2;
                int i16 = yiVar.M;
                ArrayList arrayList4 = yiVar.J;
                MessagesController.SavedMusicList savedMusicList = yiVar.G;
                ArrayList arrayList5 = yiVar.H;
                HashSet hashSet = yiVar.F;
                ArrayList arrayList6 = yiVar.I;
                arrayList3.add(w41.D(-100, AndroidUtilities.dp(1.0f)));
                int size = arrayList3.size();
                if (TextUtils.isEmpty(yiVar.A)) {
                    k51Var3.U();
                    int i17 = 0;
                    while (i17 < yiVar.E.size()) {
                        MediaController.AudioEntry audioEntry2 = (MediaController.AudioEntry) yiVar.E.get(i17);
                        audioEntry2.messageObject.setQuery(str3);
                        w41 a12 = org.telegram.ui.Cells.e7.a(audioEntry2, new pi(yiVar, 0));
                        a12.K(hashSet.contains(audioEntry2));
                        a12.d = -1;
                        arrayList3.add(a12);
                        i17++;
                        str3 = null;
                    }
                    if (yiVar.D) {
                        arrayList3.add(w41.o(11, 4));
                        arrayList3.add(w41.o(12, 4));
                        arrayList3.add(w41.o(13, 4));
                    }
                    k51Var3.T();
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
                                int i19 = yiVar.i0;
                                yiVar.i0 = i19 - 1;
                                k51Var = k51Var3;
                                i10 = i18;
                                audioEntry.id = i19;
                                audioEntry.messageObject = messageObject;
                            } else {
                                k51Var = k51Var3;
                                i10 = i18;
                            }
                            i18 = i10 + 1;
                            k51Var3 = k51Var;
                        }
                    }
                    k51 k51Var4 = k51Var3;
                    if (savedMusicList != null && arrayList5 != null && !arrayList5.isEmpty()) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(w41.A(-98, null));
                        }
                        k51Var4.U();
                        arrayList3.add(w41.s(45, LocaleController.getString(R.string.AudioSearchProfile)));
                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                            MediaController.AudioEntry audioEntry3 = (MediaController.AudioEntry) arrayList5.get(i20);
                            w41 a13 = org.telegram.ui.Cells.e7.a(audioEntry3, new pi(yiVar, 0));
                            a13.K(hashSet.contains(audioEntry3));
                            arrayList3.add(a13);
                        }
                        if (savedMusicList.loading) {
                            arrayList3.add(w41.o(41, 4));
                            arrayList3.add(w41.o(42, 4));
                            arrayList3.add(w41.o(43, 4));
                        }
                        if (!savedMusicList.loading && !savedMusicList.endReached) {
                            w41 c3 = w41.c(yiVar.O, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c3.q = true;
                            arrayList3.add(c3);
                        }
                        k51Var4.T();
                    }
                    if (arrayList6 != null && (!arrayList6.isEmpty() || yiVar.R >= 0 || yiVar.T)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(w41.A(-98, null));
                        }
                        k51Var4.U();
                        arrayList3.add(w41.s(((yiVar.R >= 0 || yiVar.T) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                            MediaController.AudioEntry audioEntry4 = (MediaController.AudioEntry) arrayList6.get(i21);
                            audioEntry4.messageObject.setQuery(yiVar.A);
                            w41 a14 = org.telegram.ui.Cells.e7.a(audioEntry4, new pi(yiVar, 0));
                            a14.K(hashSet.contains(audioEntry4));
                            arrayList3.add(a14);
                        }
                        if (yiVar.R >= 0 || yiVar.T) {
                            arrayList3.add(w41.o(21, 4));
                            arrayList3.add(w41.o(22, 4));
                            arrayList3.add(w41.o(23, 4));
                        }
                        if (yiVar.W) {
                            w41 c6 = w41.c(i16, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c6.q = true;
                            arrayList3.add(c6);
                        }
                        k51Var4.T();
                    }
                } else {
                    String lowerCase = yiVar.A.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    boolean z18 = false;
                    for (int i22 = 0; i22 < yiVar.E.size(); i22++) {
                        MediaController.AudioEntry audioEntry5 = (MediaController.AudioEntry) yiVar.E.get(i22);
                        String str5 = audioEntry5.author;
                        if (str5 != null) {
                            String lowerCase2 = str5.toLowerCase();
                            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.x3.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, translitSafe2)) {
                                z10 = true;
                                str2 = audioEntry5.title;
                                if (str2 == null) {
                                    String lowerCase3 = str2.toLowerCase();
                                    boolean z19 = z10;
                                    String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                                    z10 = z19 || lowerCase3.startsWith(lowerCase) || org.telegram.messenger.x3.w(" ", lowerCase, lowerCase3) || translitSafe3.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, translitSafe3);
                                }
                                if (z10) {
                                    if (!z18) {
                                        if (arrayList3.size() > size) {
                                            arrayList3.add(w41.A(-97, null));
                                        }
                                        k51Var3.U();
                                        arrayList3.add(w41.s(10, LocaleController.getString(R.string.AudioSearchLocal)));
                                        z18 = true;
                                    }
                                    audioEntry5.messageObject.setQuery(yiVar.A);
                                    w41 a15 = org.telegram.ui.Cells.e7.a(audioEntry5, new pi(yiVar, 0));
                                    a15.K(hashSet.contains(audioEntry5));
                                    a15.d = 10;
                                    arrayList3.add(a15);
                                }
                            }
                        }
                        z10 = false;
                        str2 = audioEntry5.title;
                        if (str2 == null) {
                        }
                        if (z10) {
                        }
                    }
                    k51Var3.T();
                    if (arrayList6 != null && (!arrayList6.isEmpty() || yiVar.R >= 0 || yiVar.T)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(w41.A(-98, null));
                        }
                        k51Var3.U();
                        arrayList3.add(w41.s(((yiVar.R >= 0 || yiVar.T) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                            MediaController.AudioEntry audioEntry6 = (MediaController.AudioEntry) arrayList6.get(i23);
                            audioEntry6.messageObject.setQuery(yiVar.A);
                            w41 a16 = org.telegram.ui.Cells.e7.a(audioEntry6, new pi(yiVar, 0));
                            a16.K(hashSet.contains(audioEntry6));
                            arrayList3.add(a16);
                        }
                        if (yiVar.R >= 0 || yiVar.T) {
                            arrayList3.add(w41.o(21, 4));
                            arrayList3.add(w41.o(22, 4));
                            arrayList3.add(w41.o(23, 4));
                        }
                        if (yiVar.W) {
                            w41 c10 = w41.c(i16, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c10.q = true;
                            arrayList3.add(c10);
                        }
                        k51Var3.T();
                    }
                    if (arrayList4 != null && (!arrayList4.isEmpty() || yiVar.a0 >= 0 || yiVar.j0)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(w41.A(-96, null));
                        }
                        k51Var3.U();
                        arrayList3.add(w41.s(((yiVar.a0 >= 0 || yiVar.j0) && arrayList4.isEmpty()) ? 35 : 30, LocaleController.getString(R.string.AudioSearchGlobal)));
                        int size3 = arrayList4.size();
                        for (int i24 = 0; i24 < size3; i24++) {
                            MediaController.AudioEntry audioEntry7 = (MediaController.AudioEntry) arrayList4.get(i24);
                            audioEntry7.messageObject.setQuery(yiVar.A);
                            w41 a17 = org.telegram.ui.Cells.e7.a(audioEntry7, new pi(yiVar, 0));
                            a17.K(hashSet.contains(audioEntry7));
                            arrayList3.add(a17);
                        }
                        if (yiVar.a0 >= 0 || yiVar.j0) {
                            arrayList3.add(w41.o(31, 4));
                            arrayList3.add(w41.o(32, 4));
                            arrayList3.add(w41.o(33, 4));
                        }
                        if (yiVar.d0) {
                            w41 c11 = w41.c(yiVar.N, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c11.q = true;
                            arrayList3.add(c11);
                        }
                        k51Var3.T();
                    }
                }
                if (arrayList3.size() <= size && !yiVar.D) {
                    if (TextUtils.isEmpty(yiVar.A)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFiles);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i25 = wi.a;
                        w41 J = w41.J(wi.class);
                        J.l = string3;
                        J.m = string4;
                        arrayList3.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(yiVar.A.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, yiVar.A));
                        int i26 = wi.a;
                        w41 J2 = w41.J(wi.class);
                        J2.l = string5;
                        J2.m = replaceTags;
                        arrayList3.add(J2);
                    }
                }
                arrayList3.add(w41.A(-99, null));
                break;
            case 6:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                boolean z20 = ChatAttachAlertPhotoLayout.m1;
                chatAttachAlertPhotoLayout.getClass();
                ((Runnable) obj2).run();
                chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
                break;
            case 7:
                fr.R((fr) obj3, (ArrayList) obj);
                break;
            case 8:
                final ls lsVar = (ls) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                int i27 = lsVar.J;
                y2 y2Var = lsVar.d0;
                ArrayList arrayList8 = lsVar.P;
                ks ksVar = lsVar.M;
                boolean z21 = lsVar.L;
                HashSet hashSet2 = new HashSet();
                if (TextUtils.isEmpty(lsVar.a0)) {
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
                    lsVar.T = arrayList7.size();
                    if (!arrayList10.isEmpty() && !z21) {
                        if (arrayList10.size() > 5) {
                            final int i29 = 1;
                            arrayList7.add(w41.r(LocaleController.getString(R.string.SearchAppsMine), LocaleController.getString(lsVar.Q ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.is
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i29) {
                                        case 0:
                                            ls lsVar2 = lsVar;
                                            lsVar2.R = !lsVar2.R;
                                            lsVar2.N(true);
                                            break;
                                        default:
                                            ls lsVar3 = lsVar;
                                            lsVar3.Q = !lsVar3.Q;
                                            lsVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList7.add(w41.q(LocaleController.getString(R.string.SearchAppsMine)));
                        }
                        for (int i30 = 0; i30 < arrayList10.size() && (i30 < 5 || lsVar.Q); i30++) {
                            TLRPC.User user2 = (TLRPC.User) arrayList10.get(i30);
                            if (!hashSet2.contains(Long.valueOf(user2.id))) {
                                hashSet2.add(Long.valueOf(user2.id));
                                w41 v = w41.v(user2);
                                v.q = true;
                                v.t = true;
                                v.H = y2Var;
                                arrayList7.add(v);
                            }
                        }
                    }
                    hashSet2.clear();
                    lsVar.U = arrayList7.size();
                    ArrayList arrayList11 = ksVar.h;
                    if (arrayList11.isEmpty()) {
                        if (ksVar.c || !ksVar.e) {
                            if (!z21) {
                                arrayList7.add(w41.n(30));
                            }
                            arrayList7.add(w41.n(29));
                            arrayList7.add(w41.n(29));
                            arrayList7.add(w41.n(29));
                            arrayList7.add(w41.n(29));
                        }
                        z11 = false;
                    } else {
                        if (!z21) {
                            arrayList7.add(w41.q(LocaleController.getString(R.string.SearchAppsPopular)));
                        }
                        boolean z22 = false;
                        for (int i31 = 0; i31 < arrayList11.size(); i31++) {
                            TLRPC.User user3 = (TLRPC.User) arrayList11.get(i31);
                            if (!hashSet2.contains(Long.valueOf(user3.id))) {
                                hashSet2.add(Long.valueOf(user3.id));
                                w41 v10 = w41.v(user3);
                                v10.q = true;
                                v10.r = true;
                                v10.t = true;
                                v10.H = y2Var;
                                arrayList7.add(v10);
                                z22 = true;
                            }
                        }
                        if (ksVar.c || !ksVar.e) {
                            arrayList7.add(w41.n(29));
                            arrayList7.add(w41.n(29));
                            arrayList7.add(w41.n(29));
                        }
                        z11 = z22;
                    }
                    if (z11) {
                        arrayList7.add(w41.B(lsVar.S));
                        break;
                    }
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.addAll(lsVar.N);
                    arrayList12.addAll(lsVar.O);
                    if (!arrayList12.isEmpty()) {
                        if (arrayList12.size() <= 5 || arrayList8.isEmpty() || z21) {
                            arrayList7.add(w41.q(LocaleController.getString(R.string.SearchApps)));
                        } else {
                            final int i32 = 0;
                            arrayList7.add(w41.r(LocaleController.getString(R.string.SearchApps), LocaleController.getString(lsVar.R ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.is
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i32) {
                                        case 0:
                                            ls lsVar2 = lsVar;
                                            lsVar2.R = !lsVar2.R;
                                            lsVar2.N(true);
                                            break;
                                        default:
                                            ls lsVar3 = lsVar;
                                            lsVar3.Q = !lsVar3.Q;
                                            lsVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        }
                        int size4 = arrayList12.size();
                        if (!lsVar.R && !arrayList8.isEmpty() && !z21) {
                            size4 = Math.min(5, size4);
                        }
                        for (int i33 = 0; i33 < size4; i33++) {
                            w41 v11 = w41.v((TLObject) arrayList12.get(i33));
                            v11.t = true;
                            v11.H = y2Var;
                            arrayList7.add(v11);
                        }
                    }
                    if (!arrayList8.isEmpty() && !z21) {
                        arrayList7.add(w41.q(LocaleController.getString(R.string.SearchMessages)));
                        int size5 = arrayList8.size();
                        int i34 = 0;
                        while (i34 < size5) {
                            Object obj4 = arrayList8.get(i34);
                            i34++;
                            w41 w41Var = new w41(33);
                            w41Var.G = (MessageObject) obj4;
                            arrayList7.add(w41Var);
                        }
                        if (lsVar.X) {
                            arrayList7.add(w41.n(1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                final on0 on0Var = (on0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                ArrayList arrayList14 = on0Var.L;
                ArrayList arrayList15 = on0Var.R;
                int i35 = on0Var.J;
                if (TextUtils.isEmpty(on0Var.X)) {
                    if (arrayList15 != null && !arrayList15.isEmpty()) {
                        if (arrayList15.size() > 5) {
                            arrayList13.add(w41.r(LocaleController.getString(R.string.SearchMyChannels), LocaleController.getString(on0Var.Q ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.ms
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i13) {
                                        case 0:
                                            on0 on0Var2 = on0Var;
                                            on0Var2.Q = !on0Var2.Q;
                                            on0Var2.N(true);
                                            if (on0Var2.Q) {
                                                AndroidUtilities.hideKeyboard(on0Var2.Z.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            on0 on0Var3 = on0Var;
                                            on0Var3.P = !on0Var3.P;
                                            on0Var3.N(true);
                                            if (on0Var3.P) {
                                                AndroidUtilities.hideKeyboard(on0Var3.Z.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList13.add(w41.q(LocaleController.getString(R.string.SearchMyChannels)));
                        }
                        int size6 = arrayList15.size();
                        if (!on0Var.Q) {
                            size6 = Math.min(5, size6);
                        }
                        for (int i36 = 0; i36 < size6; i36++) {
                            w41 v12 = w41.v((TLObject) arrayList15.get(i36));
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
                            arrayList13.add(w41.q(LocaleController.getString(R.string.SearchRecommendedChannels)));
                        }
                        int size8 = arrayList16.size();
                        while (i13 < size8) {
                            Object obj5 = arrayList16.get(i13);
                            i13++;
                            arrayList13.add(w41.v((TLRPC.Chat) obj5));
                        }
                        break;
                    } else {
                        arrayList13.add(w41.n(30));
                        arrayList13.add(w41.n(29));
                        arrayList13.add(w41.n(29));
                        arrayList13.add(w41.n(29));
                        arrayList13.add(w41.n(29));
                        break;
                    }
                } else {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = on0Var.M;
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
                    ArrayList arrayList20 = on0Var.N;
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
                    ArrayList arrayList21 = on0Var.O;
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
                            arrayList13.add(w41.q(LocaleController.getString(R.string.SearchChannels)));
                        } else {
                            final int i41 = 1;
                            arrayList13.add(w41.r(LocaleController.getString(R.string.SearchChannels), LocaleController.getString(on0Var.P ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.ms
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i41) {
                                        case 0:
                                            on0 on0Var2 = on0Var;
                                            on0Var2.Q = !on0Var2.Q;
                                            on0Var2.N(true);
                                            if (on0Var2.Q) {
                                                AndroidUtilities.hideKeyboard(on0Var2.Z.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            on0 on0Var3 = on0Var;
                                            on0Var3.P = !on0Var3.P;
                                            on0Var3.N(true);
                                            if (on0Var3.P) {
                                                AndroidUtilities.hideKeyboard(on0Var3.Z.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        }
                        int size12 = arrayList18.size();
                        if (!on0Var.P && !arrayList14.isEmpty()) {
                            size12 = Math.min(5, size12);
                        }
                        for (int i42 = 0; i42 < size12; i42++) {
                            arrayList13.add(w41.v((TLObject) arrayList18.get(i42)));
                        }
                    }
                    if (!arrayList14.isEmpty()) {
                        arrayList13.add(w41.q(LocaleController.getString(R.string.SearchMessages)));
                        int size13 = arrayList14.size();
                        int i43 = 0;
                        while (i43 < size13) {
                            Object obj9 = arrayList14.get(i43);
                            i43++;
                            w41 w41Var2 = new w41(33);
                            w41Var2.G = (MessageObject) obj9;
                            arrayList13.add(w41Var2);
                        }
                        if (on0Var.U) {
                            arrayList13.add(w41.n(1));
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
                ((ArrayList) obj).add(w41.j(-1, ((u30) obj3).T));
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
                k31.p((k31) obj3, (String) obj, (Boolean) obj2);
                break;
            default:
                ((p51) obj3).U((ArrayList) obj, (k51) obj2);
                break;
        }
    }
}
