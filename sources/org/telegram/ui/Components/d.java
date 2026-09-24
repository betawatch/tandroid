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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        lz lzVar = (lz) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        uy uyVar = lzVar.R1;
        if (uyVar == null || !(uyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            return;
        }
        ((CompoundEmoji.CompoundEmojiDrawable) lzVar.R1.getDrawable()).update(num.intValue(), num2.intValue());
        String str = (String) lzVar.R1.getTag();
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
        ly lyVar = (ly) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = lyVar.s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ey eyVar = (ey) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = eyVar.b;
            if (tL_messages_stickerSet != null) {
                boolean z10 = tL_messages_stickerSet.set.id == lyVar.d;
                int i11 = ny.a;
                v51 J = v51.J(ny.class);
                long j3 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = eyVar.a;
                if (stickerSetCovered != null) {
                    arrayList.add(ny.a(stickerSetCovered, eyVar, stickerSetCovered.set.id == lyVar.d));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        gz gzVar = (gz) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = gzVar.E;
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
                boolean z10 = tL_messages_stickerSet.set.id == gzVar.d;
                int i11 = ny.a;
                v51 J = v51.J(ny.class);
                long j3 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = gzVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            ey eyVar = (ey) obj4;
            TLRPC.StickerSet stickerSet = eyVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(ny.a(eyVar.a, eyVar, stickerSet.id == gzVar.d));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        float[] fArr = FragmentContextView.O0;
        fragmentContextView.z0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.V;
        org.telegram.ui.ActionBar.a1 a1Var = fragmentContextView.H;
        float floatValue = ((Float) obj).floatValue();
        a1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        e40 e40Var = (e40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        e40Var.c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(e40Var.a).history);
        if (e40Var.c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < e40Var.c.size(); i10++) {
            String str = (String) e40Var.c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(v51.c(i10 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(v51.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        ai.v8 v8Var;
        f40 f40Var = (f40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = f40Var.O;
        int i10 = 0;
        boolean z10 = f40Var.P && (v8Var = f40Var.Q) != null && v8Var.i.size() > 0;
        if (z10) {
            ai.v8 v8Var2 = f40Var.Q;
            int i11 = gg.m1.a;
            v51 J = v51.J(gg.m1.class);
            J.G = v8Var2;
            arrayList.add(J);
        }
        f40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            v51 v51Var = new v51(33);
            v51Var.d = i12;
            v51Var.G = messageObject;
            arrayList.add(v51Var);
            i10 = i12;
        }
        if (f40Var.S || !f40Var.V) {
            arrayList.add(v51.o(-2, 1));
            arrayList.add(v51.o(-3, 1));
            arrayList.add(v51.o(-4, 1));
        }
        if (f40Var.R || !z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new yp(f40Var, 20));
    }

    private final void g(Object obj, Object obj2) {
        w70 w70Var = (w70) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        y70 y70Var = w70Var.x;
        y70Var.f.setAlpha(1.0f);
        if (y70Var.u) {
            w70Var.c = bitmap;
        }
        fh.b bVar = y70Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            gh.d.c(y70Var.n, w70Var);
            ViewGroup viewGroup = y70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        jh0 jh0Var = (jh0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = jh0Var.e;
        ArrayList arrayList3 = jh0Var.n;
        int i10 = 0;
        if (jh0Var.d == null) {
            arrayList.add(v51.o(-1, 7));
            arrayList.add(v51.o(-2, 7));
            arrayList.add(v51.o(-3, 7));
            jh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(jh0Var.w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(v51.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                v51 v51Var = new v51(33);
                v51Var.G = (MessageObject) obj3;
                arrayList.add(v51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(v51.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                v51 v51Var2 = new v51(33);
                v51Var2.G = (MessageObject) obj4;
                arrayList.add(v51Var2);
            }
        }
        if (jh0Var.v || ((jh0Var.M && !jh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !jh0Var.s))) {
            arrayList.add(v51.o(jh0Var.L * 3, 7));
            arrayList.add(v51.o((jh0Var.L * 3) + 1, 7));
            arrayList.add(v51.o((jh0Var.L * 3) + 2, 7));
        }
        jh0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        mm0 mm0Var = (mm0) this.b;
        mm0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        mm0Var.e = paint;
        Bitmap bitmap = mm0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        mm0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        mm0Var.f = new Matrix();
        fh.b bVar = mm0Var.h;
        bVar.a((Bitmap) obj2);
        gh.d.c(bVar, mm0Var.s);
        ViewGroup viewGroup = mm0Var.y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        fy0 fy0Var = (fy0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        fy0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(fy0Var.S.set);
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
        v51 a2;
        TL_iv.RichMessage richMessage;
        v51 a10;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        v51 a11;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        boolean z10;
        String str2;
        MediaController.AudioEntry audioEntry;
        j61 j61Var;
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
                j61 j61Var2 = (j61) obj2;
                boolean[] zArr = e0Var.p0;
                boolean[] zArr2 = e0Var.q0;
                d0 d0Var = e0Var.x0;
                arrayList.add(v51.B(null));
                arrayList.add(v51.l(e0Var.v0));
                arrayList.add(v51.B(null));
                j61Var2.E = 1;
                j61Var2.U();
                d0 d0Var2 = e0Var.w0;
                int selectedTab = d0Var2 != null ? d0Var2.getSelectedTab() : 0;
                int i14 = 6;
                int i15 = 7;
                if (selectedTab == 0) {
                    String str4 = e0Var.r0;
                    if (str4 == null || str4.equalsIgnoreCase(TranslateController.UNKNOWN_LANGUAGE)) {
                        arrayList.add(n41.b(3, LocaleController.getString(R.string.AIEditorOriginalText), null, null, null));
                    } else {
                        String E = i41.E(e0Var.r0, null, zArr2);
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
                            E = i41.y(E);
                        }
                        arrayList.add(n41.b(3, substring2, E, substring3, null));
                    }
                    arrayList.add(e0Var.i0() ? e0Var.j0(4, e0Var.Y, false) : r41.a(4, e0Var.X, e0Var.P0, new b(e0Var, 4), null, null));
                    String E2 = i41.E(e0Var.s0, zArr, null);
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
                        E2 = i41.y(E2);
                    }
                    arrayList.add(n41.a(5, str, v7.j.t(E2, ""), substring, new b(e0Var, i12), e0Var.t0, new b(e0Var, i14), null));
                    if (e0Var.i0()) {
                        boolean z12 = e0Var.Z;
                        if (z12 || (richMessage3 = e0Var.b0) == null) {
                            richMessage3 = e0Var.Y;
                        }
                        a11 = e0Var.j0(6, richMessage3, z12);
                    } else {
                        boolean z13 = e0Var.Z;
                        a11 = r41.a(z13 ? 7 : 6, e0Var.a0, false, null, null, !z13 ? new b(e0Var, i15) : null);
                    }
                    arrayList.add(a11);
                } else if (selectedTab == 1) {
                    arrayList.add(v51.k(d0Var));
                    if (d0Var.getSelectedTone() instanceof z) {
                        arrayList.add(v51.j(10, e0Var.z0));
                        j61Var2.T();
                        arrayList.add(v51.A(11, null));
                        j61Var2.U();
                    }
                    if ((d0Var.getSelectedTab() >= 0 || e0Var.t0) && (!(d0Var.getSelectedTone() instanceof z) || TextUtils.equals(e0Var.A0.getText().toString(), e0Var.I0))) {
                        arrayList.add(n41.a(7, LocaleController.getString(R.string.AIEditorResult), null, null, null, e0Var.t0, new b(e0Var, i14), null));
                        if (e0Var.i0()) {
                            boolean z14 = e0Var.c0;
                            if (z14 || (richMessage2 = e0Var.e0) == null) {
                                richMessage2 = e0Var.Y;
                            }
                            a10 = e0Var.j0(8, richMessage2, z14);
                        } else {
                            boolean z15 = e0Var.c0;
                            a10 = r41.a(z15 ? 7 : 6, e0Var.d0, false, null, null, !z15 ? new b(e0Var, i15) : null);
                        }
                        arrayList.add(a10);
                    } else {
                        arrayList.add(n41.a(5, LocaleController.getString(R.string.AIEditorOriginal), null, null, null, e0Var.t0, new b(e0Var, i14), null));
                        arrayList.add(e0Var.i0() ? e0Var.j0(6, e0Var.Y, false) : r41.a(e0Var.c0 ? 7 : 6, e0Var.X, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(n41.b(3, LocaleController.getString(R.string.AIEditorOriginal), null, null, null));
                    arrayList.add(e0Var.i0() ? e0Var.j0(4, e0Var.Y, false) : r41.a(4, e0Var.X, e0Var.P0, new b(e0Var, 4), null, null));
                    arrayList.add(n41.b(5, LocaleController.getString(R.string.AIEditorResult), null, null, null));
                    if (e0Var.i0()) {
                        boolean z16 = e0Var.f0;
                        if (z16 || (richMessage = e0Var.h0) == null) {
                            richMessage = e0Var.Y;
                        }
                        a2 = e0Var.j0(6, richMessage, z16);
                    } else {
                        boolean z17 = e0Var.f0;
                        a2 = r41.a(z17 ? 7 : 6, e0Var.g0, false, null, null, !z17 ? new b(e0Var, i15) : null);
                    }
                    arrayList.add(a2);
                }
                j61Var2.T();
                arrayList.add(v51.B(null));
                break;
            case 1:
                q.R((q) obj3, (ArrayList) obj, (j61) obj2);
                break;
            case 2:
                y yVar = (y) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(v51.B(null));
                arrayList2.add(v51.l(yVar.X));
                arrayList2.add(v51.B(null));
                arrayList2.add(v51.k(yVar.a0));
                arrayList2.add(v51.B(null));
                arrayList2.add(v51.k(yVar.b0));
                arrayList2.add(v51.B(null));
                if (yVar.j0 != null) {
                    v51 e = v51.e(1, LocaleController.getString(R.string.AIEditorDeleteStyle));
                    e.r = true;
                    arrayList2.add(e);
                    arrayList2.add(v51.B(null));
                }
                arrayList2.add(v51.l(yVar.c0));
                break;
            case 3:
                ((g0) obj3).Q((ArrayList) obj, (j61) obj2);
                break;
            case 4:
                ((ChatActivityEnterView) obj3).f0((Canvas) obj, (Utilities.Callback0Return) obj2);
                break;
            case 5:
                hj hjVar = (hj) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                j61 j61Var3 = (j61) obj2;
                int i16 = hjVar.Q;
                ArrayList arrayList4 = hjVar.N;
                MessagesController.SavedMusicList savedMusicList = hjVar.K;
                ArrayList arrayList5 = hjVar.L;
                HashSet hashSet = hjVar.J;
                ArrayList arrayList6 = hjVar.M;
                arrayList3.add(v51.D(-100, AndroidUtilities.dp(1.0f)));
                int size = arrayList3.size();
                if (TextUtils.isEmpty(hjVar.E)) {
                    j61Var3.U();
                    int i17 = 0;
                    while (i17 < hjVar.I.size()) {
                        MediaController.AudioEntry audioEntry2 = (MediaController.AudioEntry) hjVar.I.get(i17);
                        audioEntry2.messageObject.setQuery(str3);
                        v51 a12 = org.telegram.ui.Cells.i7.a(audioEntry2, new yi(hjVar, 0));
                        a12.K(hashSet.contains(audioEntry2));
                        a12.d = -1;
                        arrayList3.add(a12);
                        i17++;
                        str3 = null;
                    }
                    if (hjVar.H) {
                        arrayList3.add(v51.o(11, 4));
                        arrayList3.add(v51.o(12, 4));
                        arrayList3.add(v51.o(13, 4));
                    }
                    j61Var3.T();
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
                                int i19 = hjVar.m0;
                                hjVar.m0 = i19 - 1;
                                j61Var = j61Var3;
                                i10 = i18;
                                audioEntry.id = i19;
                                audioEntry.messageObject = messageObject;
                            } else {
                                j61Var = j61Var3;
                                i10 = i18;
                            }
                            i18 = i10 + 1;
                            j61Var3 = j61Var;
                        }
                    }
                    j61 j61Var4 = j61Var3;
                    if (savedMusicList != null && arrayList5 != null && !arrayList5.isEmpty()) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(v51.A(-98, null));
                        }
                        j61Var4.U();
                        arrayList3.add(v51.s(45, LocaleController.getString(R.string.AudioSearchProfile)));
                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                            MediaController.AudioEntry audioEntry3 = (MediaController.AudioEntry) arrayList5.get(i20);
                            v51 a13 = org.telegram.ui.Cells.i7.a(audioEntry3, new yi(hjVar, 0));
                            a13.K(hashSet.contains(audioEntry3));
                            arrayList3.add(a13);
                        }
                        if (savedMusicList.loading) {
                            arrayList3.add(v51.o(41, 4));
                            arrayList3.add(v51.o(42, 4));
                            arrayList3.add(v51.o(43, 4));
                        }
                        if (!savedMusicList.loading && !savedMusicList.endReached) {
                            v51 c10 = v51.c(hjVar.S, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c10.q = true;
                            arrayList3.add(c10);
                        }
                        j61Var4.T();
                    }
                    if (arrayList6 != null && (!arrayList6.isEmpty() || hjVar.V >= 0 || hjVar.a0)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(v51.A(-98, null));
                        }
                        j61Var4.U();
                        arrayList3.add(v51.s(((hjVar.V >= 0 || hjVar.a0) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                            MediaController.AudioEntry audioEntry4 = (MediaController.AudioEntry) arrayList6.get(i21);
                            audioEntry4.messageObject.setQuery(hjVar.E);
                            v51 a14 = org.telegram.ui.Cells.i7.a(audioEntry4, new yi(hjVar, 0));
                            a14.K(hashSet.contains(audioEntry4));
                            arrayList3.add(a14);
                        }
                        if (hjVar.V >= 0 || hjVar.a0) {
                            arrayList3.add(v51.o(21, 4));
                            arrayList3.add(v51.o(22, 4));
                            arrayList3.add(v51.o(23, 4));
                        }
                        if (hjVar.d0) {
                            v51 c11 = v51.c(i16, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c11.q = true;
                            arrayList3.add(c11);
                        }
                        j61Var4.T();
                    }
                } else {
                    String lowerCase = hjVar.E.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    boolean z18 = false;
                    for (int i22 = 0; i22 < hjVar.I.size(); i22++) {
                        MediaController.AudioEntry audioEntry5 = (MediaController.AudioEntry) hjVar.I.get(i22);
                        String str5 = audioEntry5.author;
                        if (str5 != null) {
                            String lowerCase2 = str5.toLowerCase();
                            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.f0.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                                z10 = true;
                                str2 = audioEntry5.title;
                                if (str2 == null) {
                                    String lowerCase3 = str2.toLowerCase();
                                    boolean z19 = z10;
                                    String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                                    z10 = z19 || lowerCase3.startsWith(lowerCase) || org.telegram.messenger.f0.w(" ", lowerCase, lowerCase3) || translitSafe3.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe3);
                                }
                                if (z10) {
                                    if (!z18) {
                                        if (arrayList3.size() > size) {
                                            arrayList3.add(v51.A(-97, null));
                                        }
                                        j61Var3.U();
                                        arrayList3.add(v51.s(10, LocaleController.getString(R.string.AudioSearchLocal)));
                                        z18 = true;
                                    }
                                    audioEntry5.messageObject.setQuery(hjVar.E);
                                    v51 a15 = org.telegram.ui.Cells.i7.a(audioEntry5, new yi(hjVar, 0));
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
                    j61Var3.T();
                    if (arrayList6 != null && (!arrayList6.isEmpty() || hjVar.V >= 0 || hjVar.a0)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(v51.A(-98, null));
                        }
                        j61Var3.U();
                        arrayList3.add(v51.s(((hjVar.V >= 0 || hjVar.a0) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                            MediaController.AudioEntry audioEntry6 = (MediaController.AudioEntry) arrayList6.get(i23);
                            audioEntry6.messageObject.setQuery(hjVar.E);
                            v51 a16 = org.telegram.ui.Cells.i7.a(audioEntry6, new yi(hjVar, 0));
                            a16.K(hashSet.contains(audioEntry6));
                            arrayList3.add(a16);
                        }
                        if (hjVar.V >= 0 || hjVar.a0) {
                            arrayList3.add(v51.o(21, 4));
                            arrayList3.add(v51.o(22, 4));
                            arrayList3.add(v51.o(23, 4));
                        }
                        if (hjVar.d0) {
                            v51 c12 = v51.c(i16, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c12.q = true;
                            arrayList3.add(c12);
                        }
                        j61Var3.T();
                    }
                    if (arrayList4 != null && (!arrayList4.isEmpty() || hjVar.e0 >= 0 || hjVar.n0)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(v51.A(-96, null));
                        }
                        j61Var3.U();
                        arrayList3.add(v51.s(((hjVar.e0 >= 0 || hjVar.n0) && arrayList4.isEmpty()) ? 35 : 30, LocaleController.getString(R.string.AudioSearchGlobal)));
                        int size3 = arrayList4.size();
                        for (int i24 = 0; i24 < size3; i24++) {
                            MediaController.AudioEntry audioEntry7 = (MediaController.AudioEntry) arrayList4.get(i24);
                            audioEntry7.messageObject.setQuery(hjVar.E);
                            v51 a17 = org.telegram.ui.Cells.i7.a(audioEntry7, new yi(hjVar, 0));
                            a17.K(hashSet.contains(audioEntry7));
                            arrayList3.add(a17);
                        }
                        if (hjVar.e0 >= 0 || hjVar.n0) {
                            arrayList3.add(v51.o(31, 4));
                            arrayList3.add(v51.o(32, 4));
                            arrayList3.add(v51.o(33, 4));
                        }
                        if (hjVar.h0) {
                            v51 c13 = v51.c(hjVar.R, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c13.q = true;
                            arrayList3.add(c13);
                        }
                        j61Var3.T();
                    }
                }
                if (arrayList3.size() <= size && !hjVar.H) {
                    if (TextUtils.isEmpty(hjVar.E)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFiles);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i25 = fj.a;
                        v51 J = v51.J(fj.class);
                        J.l = string3;
                        J.m = string4;
                        arrayList3.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(hjVar.E.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, hjVar.E));
                        int i26 = fj.a;
                        v51 J2 = v51.J(fj.class);
                        J2.l = string5;
                        J2.m = replaceTags;
                        arrayList3.add(J2);
                    }
                }
                arrayList3.add(v51.A(-99, null));
                break;
            case 6:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                boolean z20 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.getClass();
                ((Runnable) obj2).run();
                chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
                break;
            case 7:
                nr.R((nr) obj3, (ArrayList) obj);
                break;
            case 8:
                final ss ssVar = (ss) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                int i27 = ssVar.N;
                y2 y2Var = ssVar.h0;
                ArrayList arrayList8 = ssVar.T;
                rs rsVar = ssVar.Q;
                boolean z21 = ssVar.P;
                HashSet hashSet2 = new HashSet();
                if (TextUtils.isEmpty(ssVar.e0)) {
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
                    ssVar.X = arrayList7.size();
                    if (!arrayList10.isEmpty() && !z21) {
                        if (arrayList10.size() > 5) {
                            final int i29 = 1;
                            arrayList7.add(v51.r(LocaleController.getString(R.string.SearchAppsMine), LocaleController.getString(ssVar.U ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.ps
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i29) {
                                        case 0:
                                            ss ssVar2 = ssVar;
                                            ssVar2.V = !ssVar2.V;
                                            ssVar2.N(true);
                                            break;
                                        default:
                                            ss ssVar3 = ssVar;
                                            ssVar3.U = !ssVar3.U;
                                            ssVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList7.add(v51.q(LocaleController.getString(R.string.SearchAppsMine)));
                        }
                        for (int i30 = 0; i30 < arrayList10.size() && (i30 < 5 || ssVar.U); i30++) {
                            TLRPC.User user2 = (TLRPC.User) arrayList10.get(i30);
                            if (!hashSet2.contains(Long.valueOf(user2.id))) {
                                hashSet2.add(Long.valueOf(user2.id));
                                v51 v = v51.v(user2);
                                v.q = true;
                                v.t = true;
                                v.H = y2Var;
                                arrayList7.add(v);
                            }
                        }
                    }
                    hashSet2.clear();
                    ssVar.Y = arrayList7.size();
                    ArrayList arrayList11 = rsVar.h;
                    if (arrayList11.isEmpty()) {
                        if (rsVar.c || !rsVar.e) {
                            if (!z21) {
                                arrayList7.add(v51.n(30));
                            }
                            arrayList7.add(v51.n(29));
                            arrayList7.add(v51.n(29));
                            arrayList7.add(v51.n(29));
                            arrayList7.add(v51.n(29));
                        }
                        z11 = false;
                    } else {
                        if (!z21) {
                            arrayList7.add(v51.q(LocaleController.getString(R.string.SearchAppsPopular)));
                        }
                        boolean z22 = false;
                        for (int i31 = 0; i31 < arrayList11.size(); i31++) {
                            TLRPC.User user3 = (TLRPC.User) arrayList11.get(i31);
                            if (!hashSet2.contains(Long.valueOf(user3.id))) {
                                hashSet2.add(Long.valueOf(user3.id));
                                v51 v9 = v51.v(user3);
                                v9.q = true;
                                v9.r = true;
                                v9.t = true;
                                v9.H = y2Var;
                                arrayList7.add(v9);
                                z22 = true;
                            }
                        }
                        if (rsVar.c || !rsVar.e) {
                            arrayList7.add(v51.n(29));
                            arrayList7.add(v51.n(29));
                            arrayList7.add(v51.n(29));
                        }
                        z11 = z22;
                    }
                    if (z11) {
                        arrayList7.add(v51.B(ssVar.W));
                        break;
                    }
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.addAll(ssVar.R);
                    arrayList12.addAll(ssVar.S);
                    if (!arrayList12.isEmpty()) {
                        if (arrayList12.size() <= 5 || arrayList8.isEmpty() || z21) {
                            arrayList7.add(v51.q(LocaleController.getString(R.string.SearchApps)));
                        } else {
                            final int i32 = 0;
                            arrayList7.add(v51.r(LocaleController.getString(R.string.SearchApps), LocaleController.getString(ssVar.V ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.ps
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i32) {
                                        case 0:
                                            ss ssVar2 = ssVar;
                                            ssVar2.V = !ssVar2.V;
                                            ssVar2.N(true);
                                            break;
                                        default:
                                            ss ssVar3 = ssVar;
                                            ssVar3.U = !ssVar3.U;
                                            ssVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        }
                        int size4 = arrayList12.size();
                        if (!ssVar.V && !arrayList8.isEmpty() && !z21) {
                            size4 = Math.min(5, size4);
                        }
                        for (int i33 = 0; i33 < size4; i33++) {
                            v51 v10 = v51.v((TLObject) arrayList12.get(i33));
                            v10.t = true;
                            v10.H = y2Var;
                            arrayList7.add(v10);
                        }
                    }
                    if (!arrayList8.isEmpty() && !z21) {
                        arrayList7.add(v51.q(LocaleController.getString(R.string.SearchMessages)));
                        int size5 = arrayList8.size();
                        int i34 = 0;
                        while (i34 < size5) {
                            Object obj4 = arrayList8.get(i34);
                            i34++;
                            v51 v51Var = new v51(33);
                            v51Var.G = (MessageObject) obj4;
                            arrayList7.add(v51Var);
                        }
                        if (ssVar.b0) {
                            arrayList7.add(v51.n(1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                final go0 go0Var = (go0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                ArrayList arrayList14 = go0Var.P;
                ArrayList arrayList15 = go0Var.V;
                int i35 = go0Var.N;
                if (TextUtils.isEmpty(go0Var.b0)) {
                    if (arrayList15 != null && !arrayList15.isEmpty()) {
                        if (arrayList15.size() > 5) {
                            arrayList13.add(v51.r(LocaleController.getString(R.string.SearchMyChannels), LocaleController.getString(go0Var.U ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.ts
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i13) {
                                        case 0:
                                            go0 go0Var2 = go0Var;
                                            go0Var2.U = !go0Var2.U;
                                            go0Var2.N(true);
                                            if (go0Var2.U) {
                                                AndroidUtilities.hideKeyboard(go0Var2.d0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            go0 go0Var3 = go0Var;
                                            go0Var3.T = !go0Var3.T;
                                            go0Var3.N(true);
                                            if (go0Var3.T) {
                                                AndroidUtilities.hideKeyboard(go0Var3.d0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList13.add(v51.q(LocaleController.getString(R.string.SearchMyChannels)));
                        }
                        int size6 = arrayList15.size();
                        if (!go0Var.U) {
                            size6 = Math.min(5, size6);
                        }
                        for (int i36 = 0; i36 < size6; i36++) {
                            v51 v11 = v51.v((TLObject) arrayList15.get(i36));
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
                            arrayList13.add(v51.q(LocaleController.getString(R.string.SearchRecommendedChannels)));
                        }
                        int size8 = arrayList16.size();
                        while (i13 < size8) {
                            Object obj5 = arrayList16.get(i13);
                            i13++;
                            arrayList13.add(v51.v((TLRPC.Chat) obj5));
                        }
                        break;
                    } else {
                        arrayList13.add(v51.n(30));
                        arrayList13.add(v51.n(29));
                        arrayList13.add(v51.n(29));
                        arrayList13.add(v51.n(29));
                        arrayList13.add(v51.n(29));
                        break;
                    }
                } else {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = go0Var.Q;
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
                    ArrayList arrayList20 = go0Var.R;
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
                    ArrayList arrayList21 = go0Var.S;
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
                            arrayList13.add(v51.q(LocaleController.getString(R.string.SearchChannels)));
                        } else {
                            final int i41 = 1;
                            arrayList13.add(v51.r(LocaleController.getString(R.string.SearchChannels), LocaleController.getString(go0Var.T ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.ts
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i41) {
                                        case 0:
                                            go0 go0Var2 = go0Var;
                                            go0Var2.U = !go0Var2.U;
                                            go0Var2.N(true);
                                            if (go0Var2.U) {
                                                AndroidUtilities.hideKeyboard(go0Var2.d0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            go0 go0Var3 = go0Var;
                                            go0Var3.T = !go0Var3.T;
                                            go0Var3.N(true);
                                            if (go0Var3.T) {
                                                AndroidUtilities.hideKeyboard(go0Var3.d0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        }
                        int size12 = arrayList18.size();
                        if (!go0Var.T && !arrayList14.isEmpty()) {
                            size12 = Math.min(5, size12);
                        }
                        for (int i42 = 0; i42 < size12; i42++) {
                            arrayList13.add(v51.v((TLObject) arrayList18.get(i42)));
                        }
                    }
                    if (!arrayList14.isEmpty()) {
                        arrayList13.add(v51.q(LocaleController.getString(R.string.SearchMessages)));
                        int size13 = arrayList14.size();
                        int i43 = 0;
                        while (i43 < size13) {
                            Object obj9 = arrayList14.get(i43);
                            i43++;
                            v51 v51Var2 = new v51(33);
                            v51Var2.G = (MessageObject) obj9;
                            arrayList13.add(v51Var2);
                        }
                        if (go0Var.Y) {
                            arrayList13.add(v51.n(1));
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
                ((ArrayList) obj).add(v51.j(-1, ((x30) obj3).X));
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
                i41.p((i41) obj3, (String) obj, (Boolean) obj2);
                break;
            default:
                ((m61) obj3).U((ArrayList) obj, (j61) obj2);
                break;
        }
    }
}
