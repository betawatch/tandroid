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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        yy yyVar = (yy) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        gy gyVar = yyVar.N1;
        if (gyVar == null || !(gyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            return;
        }
        ((CompoundEmoji.CompoundEmojiDrawable) yyVar.N1.getDrawable()).update(num.intValue(), num2.intValue());
        String str = (String) yyVar.N1.getTag();
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
        wx wxVar = (wx) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = wxVar.s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            px pxVar = (px) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = pxVar.b;
            if (tL_messages_stickerSet != null) {
                boolean z10 = tL_messages_stickerSet.set.id == wxVar.d;
                int i11 = yx.a;
                n41 J = n41.J(yx.class);
                long j10 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = pxVar.a;
                if (stickerSetCovered != null) {
                    arrayList.add(yx.a(stickerSetCovered, pxVar, stickerSetCovered.set.id == wxVar.d));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        ty tyVar = (ty) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = tyVar.A;
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
                boolean z10 = tL_messages_stickerSet.set.id == tyVar.d;
                int i11 = yx.a;
                n41 J = n41.J(yx.class);
                long j10 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = tyVar.F;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            px pxVar = (px) obj4;
            TLRPC.StickerSet stickerSet = pxVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(yx.a(pxVar.a, pxVar, stickerSet.id == tyVar.d));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        float[] fArr = FragmentContextView.I0;
        fragmentContextView.v0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.R;
        org.telegram.ui.ActionBar.b1 b1Var = fragmentContextView.D;
        float floatValue = ((Float) obj).floatValue();
        b1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        s30 s30Var = (s30) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        s30Var.c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(s30Var.a).history);
        if (s30Var.c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < s30Var.c.size(); i10++) {
            String str = (String) s30Var.c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(n41.c(i10 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(n41.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        jh.d6 d6Var;
        t30 t30Var = (t30) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = t30Var.K;
        int i10 = 0;
        boolean z10 = t30Var.L && (d6Var = t30Var.M) != null && d6Var.i.size() > 0;
        if (z10) {
            jh.d6 d6Var2 = t30Var.M;
            int i11 = pf.w0.a;
            n41 J = n41.J(pf.w0.class);
            J.G = d6Var2;
            arrayList.add(J);
        }
        t30Var.N = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            n41 n41Var = new n41(33);
            n41Var.d = i12;
            n41Var.G = messageObject;
            arrayList.add(n41Var);
            i10 = i12;
        }
        if (t30Var.O || !t30Var.R) {
            arrayList.add(n41.o(-2, 1));
            arrayList.add(n41.o(-3, 1));
            arrayList.add(n41.o(-4, 1));
        }
        if (t30Var.N || !z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new lp(t30Var, 20));
    }

    private final void g(Object obj, Object obj2) {
        z60 z60Var = (z60) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        b70 b70Var = z60Var.x;
        b70Var.f.setAlpha(1.0f);
        if (b70Var.u) {
            z60Var.c = bitmap;
        }
        og.b bVar = b70Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            pg.c.c(b70Var.n, z60Var);
            ViewGroup viewGroup = b70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        mg0 mg0Var = (mg0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = mg0Var.e;
        ArrayList arrayList3 = mg0Var.n;
        int i10 = 0;
        if (mg0Var.d == null) {
            arrayList.add(n41.o(-1, 7));
            arrayList.add(n41.o(-2, 7));
            arrayList.add(n41.o(-3, 7));
            mg0Var.M = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(mg0Var.w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(n41.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                n41 n41Var = new n41(33);
                n41Var.G = (MessageObject) obj3;
                arrayList.add(n41Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(n41.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                n41 n41Var2 = new n41(33);
                n41Var2.G = (MessageObject) obj4;
                arrayList.add(n41Var2);
            }
        }
        if (mg0Var.v || ((mg0Var.I && !mg0Var.J) || (!isEmpty && !arrayList3.isEmpty() && !mg0Var.s))) {
            arrayList.add(n41.o(mg0Var.H * 3, 7));
            arrayList.add(n41.o((mg0Var.H * 3) + 1, 7));
            arrayList.add(n41.o((mg0Var.H * 3) + 2, 7));
        }
        mg0Var.M = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        ol0 ol0Var = (ol0) this.b;
        ol0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        ol0Var.e = paint;
        Bitmap bitmap = ol0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        ol0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        ol0Var.f = new Matrix();
        og.b bVar = ol0Var.h;
        bVar.a((Bitmap) obj2);
        pg.c.c(bVar, ol0Var.s);
        ViewGroup viewGroup = ol0Var.y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        ex0 ex0Var = (ex0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        ex0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(ex0Var.O.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new w1((Utilities.Callback) obj2, 14));
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
        n41 a2;
        TL_iv.RichMessage richMessage;
        n41 a3;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        n41 a10;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        boolean z10;
        String str2;
        MediaController.AudioEntry audioEntry;
        b51 b51Var;
        int i10;
        boolean z11;
        int i11 = this.a;
        String str3 = null;
        int i12 = 5;
        final int i13 = 0;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                e0 e0Var = (e0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                b51 b51Var2 = (b51) obj2;
                boolean[] zArr = e0Var.l0;
                boolean[] zArr2 = e0Var.m0;
                d0 d0Var = e0Var.t0;
                arrayList.add(n41.B(null));
                arrayList.add(n41.l(e0Var.r0));
                arrayList.add(n41.B(null));
                b51Var2.A = 1;
                b51Var2.U();
                d0 d0Var2 = e0Var.s0;
                int selectedTab = d0Var2 != null ? d0Var2.getSelectedTab() : 0;
                int i14 = 6;
                int i15 = 7;
                if (selectedTab == 0) {
                    String str4 = e0Var.n0;
                    if (str4 == null || str4.equalsIgnoreCase(TranslateController.UNKNOWN_LANGUAGE)) {
                        arrayList.add(g31.b(3, LocaleController.getString(R.string.AIEditorOriginalText), null, null, null));
                    } else {
                        String E = b31.E(e0Var.n0, null, zArr2);
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
                            E = b31.z(E);
                        }
                        arrayList.add(g31.b(3, substring2, E, substring3, null));
                    }
                    arrayList.add(e0Var.i0() ? e0Var.j0(4, e0Var.U, false) : k31.a(4, e0Var.T, e0Var.L0, new b(e0Var, 4), null, null));
                    String E2 = b31.E(e0Var.o0, zArr, null);
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
                        E2 = b31.z(E2);
                    }
                    arrayList.add(g31.a(5, str, s3.c.l(E2, ""), substring, new b(e0Var, i12), e0Var.p0, new b(e0Var, i14), null));
                    if (e0Var.i0()) {
                        boolean z12 = e0Var.V;
                        if (z12 || (richMessage3 = e0Var.X) == null) {
                            richMessage3 = e0Var.U;
                        }
                        a10 = e0Var.j0(6, richMessage3, z12);
                    } else {
                        boolean z13 = e0Var.V;
                        a10 = k31.a(z13 ? 7 : 6, e0Var.W, false, null, null, !z13 ? new b(e0Var, i15) : null);
                    }
                    arrayList.add(a10);
                } else if (selectedTab == 1) {
                    arrayList.add(n41.k(d0Var));
                    if (d0Var.getSelectedTone() instanceof a0) {
                        arrayList.add(n41.j(10, e0Var.v0));
                        b51Var2.T();
                        arrayList.add(n41.A(11, null));
                        b51Var2.U();
                    }
                    if ((d0Var.getSelectedTab() >= 0 || e0Var.p0) && (!(d0Var.getSelectedTone() instanceof a0) || TextUtils.equals(e0Var.w0.getText().toString(), e0Var.E0))) {
                        arrayList.add(g31.a(7, LocaleController.getString(R.string.AIEditorResult), null, null, null, e0Var.p0, new b(e0Var, i14), null));
                        if (e0Var.i0()) {
                            boolean z14 = e0Var.Y;
                            if (z14 || (richMessage2 = e0Var.a0) == null) {
                                richMessage2 = e0Var.U;
                            }
                            a3 = e0Var.j0(8, richMessage2, z14);
                        } else {
                            boolean z15 = e0Var.Y;
                            a3 = k31.a(z15 ? 7 : 6, e0Var.Z, false, null, null, !z15 ? new b(e0Var, i15) : null);
                        }
                        arrayList.add(a3);
                    } else {
                        arrayList.add(g31.a(5, LocaleController.getString(R.string.AIEditorOriginal), null, null, null, e0Var.p0, new b(e0Var, i14), null));
                        arrayList.add(e0Var.i0() ? e0Var.j0(6, e0Var.U, false) : k31.a(e0Var.Y ? 7 : 6, e0Var.T, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(g31.b(3, LocaleController.getString(R.string.AIEditorOriginal), null, null, null));
                    arrayList.add(e0Var.i0() ? e0Var.j0(4, e0Var.U, false) : k31.a(4, e0Var.T, e0Var.L0, new b(e0Var, 4), null, null));
                    arrayList.add(g31.b(5, LocaleController.getString(R.string.AIEditorResult), null, null, null));
                    if (e0Var.i0()) {
                        boolean z16 = e0Var.b0;
                        if (z16 || (richMessage = e0Var.d0) == null) {
                            richMessage = e0Var.U;
                        }
                        a2 = e0Var.j0(6, richMessage, z16);
                    } else {
                        boolean z17 = e0Var.b0;
                        a2 = k31.a(z17 ? 7 : 6, e0Var.c0, false, null, null, !z17 ? new b(e0Var, i15) : null);
                    }
                    arrayList.add(a2);
                }
                b51Var2.T();
                arrayList.add(n41.B(null));
                break;
            case 1:
                q.R((q) obj3, (ArrayList) obj, (b51) obj2);
                break;
            case 2:
                y yVar = (y) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(n41.B(null));
                arrayList2.add(n41.l(yVar.T));
                arrayList2.add(n41.B(null));
                arrayList2.add(n41.k(yVar.W));
                arrayList2.add(n41.B(null));
                arrayList2.add(n41.k(yVar.X));
                arrayList2.add(n41.B(null));
                if (yVar.f0 != null) {
                    n41 e9 = n41.e(1, LocaleController.getString(R.string.AIEditorDeleteStyle));
                    e9.r = true;
                    arrayList2.add(e9);
                    arrayList2.add(n41.B(null));
                }
                arrayList2.add(n41.l(yVar.Y));
                break;
            case 3:
                ((g0) obj3).Q((ArrayList) obj, (b51) obj2);
                break;
            case 4:
                ((ChatActivityEnterView) obj3).f0((Canvas) obj, (Utilities.Callback0Return) obj2);
                break;
            case 5:
                ri riVar = (ri) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                b51 b51Var3 = (b51) obj2;
                int i16 = riVar.M;
                ArrayList arrayList4 = riVar.J;
                MessagesController.SavedMusicList savedMusicList = riVar.G;
                ArrayList arrayList5 = riVar.H;
                HashSet hashSet = riVar.F;
                ArrayList arrayList6 = riVar.I;
                arrayList3.add(n41.D(-100, AndroidUtilities.dp(1.0f)));
                int size = arrayList3.size();
                if (TextUtils.isEmpty(riVar.A)) {
                    b51Var3.U();
                    int i17 = 0;
                    while (i17 < riVar.E.size()) {
                        MediaController.AudioEntry audioEntry2 = (MediaController.AudioEntry) riVar.E.get(i17);
                        audioEntry2.messageObject.setQuery(str3);
                        n41 a11 = org.telegram.ui.Cells.d7.a(audioEntry2, new ii(riVar, 0));
                        a11.K(hashSet.contains(audioEntry2));
                        a11.d = -1;
                        arrayList3.add(a11);
                        i17++;
                        str3 = null;
                    }
                    if (riVar.D) {
                        arrayList3.add(n41.o(11, 4));
                        arrayList3.add(n41.o(12, 4));
                        arrayList3.add(n41.o(13, 4));
                    }
                    b51Var3.T();
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
                                int i19 = riVar.i0;
                                riVar.i0 = i19 - 1;
                                b51Var = b51Var3;
                                i10 = i18;
                                audioEntry.id = i19;
                                audioEntry.messageObject = messageObject;
                            } else {
                                b51Var = b51Var3;
                                i10 = i18;
                            }
                            i18 = i10 + 1;
                            b51Var3 = b51Var;
                        }
                    }
                    b51 b51Var4 = b51Var3;
                    if (savedMusicList != null && arrayList5 != null && !arrayList5.isEmpty()) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(n41.A(-98, null));
                        }
                        b51Var4.U();
                        arrayList3.add(n41.s(45, LocaleController.getString(R.string.AudioSearchProfile)));
                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                            MediaController.AudioEntry audioEntry3 = (MediaController.AudioEntry) arrayList5.get(i20);
                            n41 a12 = org.telegram.ui.Cells.d7.a(audioEntry3, new ii(riVar, 0));
                            a12.K(hashSet.contains(audioEntry3));
                            arrayList3.add(a12);
                        }
                        if (savedMusicList.loading) {
                            arrayList3.add(n41.o(41, 4));
                            arrayList3.add(n41.o(42, 4));
                            arrayList3.add(n41.o(43, 4));
                        }
                        if (!savedMusicList.loading && !savedMusicList.endReached) {
                            n41 c10 = n41.c(riVar.O, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c10.q = true;
                            arrayList3.add(c10);
                        }
                        b51Var4.T();
                    }
                    if (arrayList6 != null && (!arrayList6.isEmpty() || riVar.R >= 0 || riVar.T)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(n41.A(-98, null));
                        }
                        b51Var4.U();
                        arrayList3.add(n41.s(((riVar.R >= 0 || riVar.T) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                            MediaController.AudioEntry audioEntry4 = (MediaController.AudioEntry) arrayList6.get(i21);
                            audioEntry4.messageObject.setQuery(riVar.A);
                            n41 a13 = org.telegram.ui.Cells.d7.a(audioEntry4, new ii(riVar, 0));
                            a13.K(hashSet.contains(audioEntry4));
                            arrayList3.add(a13);
                        }
                        if (riVar.R >= 0 || riVar.T) {
                            arrayList3.add(n41.o(21, 4));
                            arrayList3.add(n41.o(22, 4));
                            arrayList3.add(n41.o(23, 4));
                        }
                        if (riVar.W) {
                            n41 c11 = n41.c(i16, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c11.q = true;
                            arrayList3.add(c11);
                        }
                        b51Var4.T();
                    }
                } else {
                    String lowerCase = riVar.A.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    boolean z18 = false;
                    for (int i22 = 0; i22 < riVar.E.size(); i22++) {
                        MediaController.AudioEntry audioEntry5 = (MediaController.AudioEntry) riVar.E.get(i22);
                        String str5 = audioEntry5.author;
                        if (str5 != null) {
                            String lowerCase2 = str5.toLowerCase();
                            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.y1.x(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y1.x(" ", translitSafe, translitSafe2)) {
                                z10 = true;
                                str2 = audioEntry5.title;
                                if (str2 == null) {
                                    String lowerCase3 = str2.toLowerCase();
                                    boolean z19 = z10;
                                    String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                                    z10 = z19 || lowerCase3.startsWith(lowerCase) || org.telegram.messenger.y1.x(" ", lowerCase, lowerCase3) || translitSafe3.startsWith(translitSafe) || org.telegram.messenger.y1.x(" ", translitSafe, translitSafe3);
                                }
                                if (z10) {
                                    if (!z18) {
                                        if (arrayList3.size() > size) {
                                            arrayList3.add(n41.A(-97, null));
                                        }
                                        b51Var3.U();
                                        arrayList3.add(n41.s(10, LocaleController.getString(R.string.AudioSearchLocal)));
                                        z18 = true;
                                    }
                                    audioEntry5.messageObject.setQuery(riVar.A);
                                    n41 a14 = org.telegram.ui.Cells.d7.a(audioEntry5, new ii(riVar, 0));
                                    a14.K(hashSet.contains(audioEntry5));
                                    a14.d = 10;
                                    arrayList3.add(a14);
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
                    b51Var3.T();
                    if (arrayList6 != null && (!arrayList6.isEmpty() || riVar.R >= 0 || riVar.T)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(n41.A(-98, null));
                        }
                        b51Var3.U();
                        arrayList3.add(n41.s(((riVar.R >= 0 || riVar.T) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                            MediaController.AudioEntry audioEntry6 = (MediaController.AudioEntry) arrayList6.get(i23);
                            audioEntry6.messageObject.setQuery(riVar.A);
                            n41 a15 = org.telegram.ui.Cells.d7.a(audioEntry6, new ii(riVar, 0));
                            a15.K(hashSet.contains(audioEntry6));
                            arrayList3.add(a15);
                        }
                        if (riVar.R >= 0 || riVar.T) {
                            arrayList3.add(n41.o(21, 4));
                            arrayList3.add(n41.o(22, 4));
                            arrayList3.add(n41.o(23, 4));
                        }
                        if (riVar.W) {
                            n41 c12 = n41.c(i16, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c12.q = true;
                            arrayList3.add(c12);
                        }
                        b51Var3.T();
                    }
                    if (arrayList4 != null && (!arrayList4.isEmpty() || riVar.a0 >= 0 || riVar.j0)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(n41.A(-96, null));
                        }
                        b51Var3.U();
                        arrayList3.add(n41.s(((riVar.a0 >= 0 || riVar.j0) && arrayList4.isEmpty()) ? 35 : 30, LocaleController.getString(R.string.AudioSearchGlobal)));
                        int size3 = arrayList4.size();
                        for (int i24 = 0; i24 < size3; i24++) {
                            MediaController.AudioEntry audioEntry7 = (MediaController.AudioEntry) arrayList4.get(i24);
                            audioEntry7.messageObject.setQuery(riVar.A);
                            n41 a16 = org.telegram.ui.Cells.d7.a(audioEntry7, new ii(riVar, 0));
                            a16.K(hashSet.contains(audioEntry7));
                            arrayList3.add(a16);
                        }
                        if (riVar.a0 >= 0 || riVar.j0) {
                            arrayList3.add(n41.o(31, 4));
                            arrayList3.add(n41.o(32, 4));
                            arrayList3.add(n41.o(33, 4));
                        }
                        if (riVar.d0) {
                            n41 c13 = n41.c(riVar.N, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c13.q = true;
                            arrayList3.add(c13);
                        }
                        b51Var3.T();
                    }
                }
                if (arrayList3.size() <= size && !riVar.D) {
                    if (TextUtils.isEmpty(riVar.A)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFiles);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i25 = pi.a;
                        n41 J = n41.J(pi.class);
                        J.l = string3;
                        J.m = string4;
                        arrayList3.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(riVar.A.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, riVar.A));
                        int i26 = pi.a;
                        n41 J2 = n41.J(pi.class);
                        J2.l = string5;
                        J2.m = replaceTags;
                        arrayList3.add(J2);
                    }
                }
                arrayList3.add(n41.A(-99, null));
                break;
            case 6:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                boolean z20 = ChatAttachAlertPhotoLayout.m1;
                chatAttachAlertPhotoLayout.getClass();
                ((Runnable) obj2).run();
                chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
                break;
            case 7:
                ar.R((ar) obj3, (ArrayList) obj);
                break;
            case 8:
                final fs fsVar = (fs) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                int i27 = fsVar.J;
                v2 v2Var = fsVar.d0;
                ArrayList arrayList8 = fsVar.P;
                es esVar = fsVar.M;
                boolean z21 = fsVar.L;
                HashSet hashSet2 = new HashSet();
                if (TextUtils.isEmpty(fsVar.a0)) {
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
                    fsVar.T = arrayList7.size();
                    if (!arrayList10.isEmpty() && !z21) {
                        if (arrayList10.size() > 5) {
                            final int i29 = 1;
                            arrayList7.add(n41.r(LocaleController.getString(R.string.SearchAppsMine), LocaleController.getString(fsVar.Q ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.cs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i29) {
                                        case 0:
                                            fs fsVar2 = fsVar;
                                            fsVar2.R = !fsVar2.R;
                                            fsVar2.N(true);
                                            break;
                                        default:
                                            fs fsVar3 = fsVar;
                                            fsVar3.Q = !fsVar3.Q;
                                            fsVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList7.add(n41.q(LocaleController.getString(R.string.SearchAppsMine)));
                        }
                        for (int i30 = 0; i30 < arrayList10.size() && (i30 < 5 || fsVar.Q); i30++) {
                            TLRPC.User user2 = (TLRPC.User) arrayList10.get(i30);
                            if (!hashSet2.contains(Long.valueOf(user2.id))) {
                                hashSet2.add(Long.valueOf(user2.id));
                                n41 v = n41.v(user2);
                                v.q = true;
                                v.t = true;
                                v.H = v2Var;
                                arrayList7.add(v);
                            }
                        }
                    }
                    hashSet2.clear();
                    fsVar.U = arrayList7.size();
                    ArrayList arrayList11 = esVar.h;
                    if (arrayList11.isEmpty()) {
                        if (esVar.c || !esVar.e) {
                            if (!z21) {
                                arrayList7.add(n41.n(30));
                            }
                            arrayList7.add(n41.n(29));
                            arrayList7.add(n41.n(29));
                            arrayList7.add(n41.n(29));
                            arrayList7.add(n41.n(29));
                        }
                        z11 = false;
                    } else {
                        if (!z21) {
                            arrayList7.add(n41.q(LocaleController.getString(R.string.SearchAppsPopular)));
                        }
                        boolean z22 = false;
                        for (int i31 = 0; i31 < arrayList11.size(); i31++) {
                            TLRPC.User user3 = (TLRPC.User) arrayList11.get(i31);
                            if (!hashSet2.contains(Long.valueOf(user3.id))) {
                                hashSet2.add(Long.valueOf(user3.id));
                                n41 v4 = n41.v(user3);
                                v4.q = true;
                                v4.r = true;
                                v4.t = true;
                                v4.H = v2Var;
                                arrayList7.add(v4);
                                z22 = true;
                            }
                        }
                        if (esVar.c || !esVar.e) {
                            arrayList7.add(n41.n(29));
                            arrayList7.add(n41.n(29));
                            arrayList7.add(n41.n(29));
                        }
                        z11 = z22;
                    }
                    if (z11) {
                        arrayList7.add(n41.B(fsVar.S));
                        break;
                    }
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.addAll(fsVar.N);
                    arrayList12.addAll(fsVar.O);
                    if (!arrayList12.isEmpty()) {
                        if (arrayList12.size() <= 5 || arrayList8.isEmpty() || z21) {
                            arrayList7.add(n41.q(LocaleController.getString(R.string.SearchApps)));
                        } else {
                            final int i32 = 0;
                            arrayList7.add(n41.r(LocaleController.getString(R.string.SearchApps), LocaleController.getString(fsVar.R ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.cs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i32) {
                                        case 0:
                                            fs fsVar2 = fsVar;
                                            fsVar2.R = !fsVar2.R;
                                            fsVar2.N(true);
                                            break;
                                        default:
                                            fs fsVar3 = fsVar;
                                            fsVar3.Q = !fsVar3.Q;
                                            fsVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        }
                        int size4 = arrayList12.size();
                        if (!fsVar.R && !arrayList8.isEmpty() && !z21) {
                            size4 = Math.min(5, size4);
                        }
                        for (int i33 = 0; i33 < size4; i33++) {
                            n41 v10 = n41.v((TLObject) arrayList12.get(i33));
                            v10.t = true;
                            v10.H = v2Var;
                            arrayList7.add(v10);
                        }
                    }
                    if (!arrayList8.isEmpty() && !z21) {
                        arrayList7.add(n41.q(LocaleController.getString(R.string.SearchMessages)));
                        int size5 = arrayList8.size();
                        int i34 = 0;
                        while (i34 < size5) {
                            Object obj4 = arrayList8.get(i34);
                            i34++;
                            n41 n41Var = new n41(33);
                            n41Var.G = (MessageObject) obj4;
                            arrayList7.add(n41Var);
                        }
                        if (fsVar.X) {
                            arrayList7.add(n41.n(1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                final en0 en0Var = (en0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                ArrayList arrayList14 = en0Var.L;
                ArrayList arrayList15 = en0Var.R;
                int i35 = en0Var.J;
                if (TextUtils.isEmpty(en0Var.X)) {
                    if (arrayList15 != null && !arrayList15.isEmpty()) {
                        if (arrayList15.size() > 5) {
                            arrayList13.add(n41.r(LocaleController.getString(R.string.SearchMyChannels), LocaleController.getString(en0Var.Q ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.gs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i13) {
                                        case 0:
                                            en0 en0Var2 = en0Var;
                                            en0Var2.Q = !en0Var2.Q;
                                            en0Var2.N(true);
                                            if (en0Var2.Q) {
                                                AndroidUtilities.hideKeyboard(en0Var2.Z.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            en0 en0Var3 = en0Var;
                                            en0Var3.P = !en0Var3.P;
                                            en0Var3.N(true);
                                            if (en0Var3.P) {
                                                AndroidUtilities.hideKeyboard(en0Var3.Z.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList13.add(n41.q(LocaleController.getString(R.string.SearchMyChannels)));
                        }
                        int size6 = arrayList15.size();
                        if (!en0Var.Q) {
                            size6 = Math.min(5, size6);
                        }
                        for (int i36 = 0; i36 < size6; i36++) {
                            n41 v11 = n41.v((TLObject) arrayList15.get(i36));
                            v11.I = true;
                            arrayList13.add(v11);
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
                            arrayList13.add(n41.q(LocaleController.getString(R.string.SearchRecommendedChannels)));
                        }
                        int size8 = arrayList16.size();
                        while (i13 < size8) {
                            Object obj5 = arrayList16.get(i13);
                            i13++;
                            arrayList13.add(n41.v((TLRPC.Chat) obj5));
                        }
                        break;
                    } else {
                        arrayList13.add(n41.n(30));
                        arrayList13.add(n41.n(29));
                        arrayList13.add(n41.n(29));
                        arrayList13.add(n41.n(29));
                        arrayList13.add(n41.n(29));
                        break;
                    }
                } else {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = en0Var.M;
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
                    ArrayList arrayList20 = en0Var.N;
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
                    ArrayList arrayList21 = en0Var.O;
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
                            arrayList13.add(n41.q(LocaleController.getString(R.string.SearchChannels)));
                        } else {
                            final int i41 = 1;
                            arrayList13.add(n41.r(LocaleController.getString(R.string.SearchChannels), LocaleController.getString(en0Var.P ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.gs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i41) {
                                        case 0:
                                            en0 en0Var2 = en0Var;
                                            en0Var2.Q = !en0Var2.Q;
                                            en0Var2.N(true);
                                            if (en0Var2.Q) {
                                                AndroidUtilities.hideKeyboard(en0Var2.Z.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            en0 en0Var3 = en0Var;
                                            en0Var3.P = !en0Var3.P;
                                            en0Var3.N(true);
                                            if (en0Var3.P) {
                                                AndroidUtilities.hideKeyboard(en0Var3.Z.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        }
                        int size12 = arrayList18.size();
                        if (!en0Var.P && !arrayList14.isEmpty()) {
                            size12 = Math.min(5, size12);
                        }
                        for (int i42 = 0; i42 < size12; i42++) {
                            arrayList13.add(n41.v((TLObject) arrayList18.get(i42)));
                        }
                    }
                    if (!arrayList14.isEmpty()) {
                        arrayList13.add(n41.q(LocaleController.getString(R.string.SearchMessages)));
                        int size13 = arrayList14.size();
                        int i43 = 0;
                        while (i43 < size13) {
                            Object obj9 = arrayList14.get(i43);
                            i43++;
                            n41 n41Var2 = new n41(33);
                            n41Var2.G = (MessageObject) obj9;
                            arrayList13.add(n41Var2);
                        }
                        if (en0Var.U) {
                            arrayList13.add(n41.n(1));
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
                ((ArrayList) obj).add(n41.j(-1, ((l30) obj3).T));
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
                b31.q((b31) obj3, (String) obj, (Boolean) obj2);
                break;
            default:
                ((f51) obj3).U((ArrayList) obj, (b51) obj2);
                break;
        }
    }
}
