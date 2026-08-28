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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        wy wyVar = (wy) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        fy fyVar = wyVar.N1;
        if (fyVar == null || !(fyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            return;
        }
        ((CompoundEmoji.CompoundEmojiDrawable) wyVar.N1.getDrawable()).update(num.intValue(), num2.intValue());
        String str = (String) wyVar.N1.getTag();
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
        vx vxVar = (vx) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = vxVar.s;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj3 = arrayList2.get(i9);
            i9++;
            ox oxVar = (ox) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = oxVar.b;
            if (tL_messages_stickerSet != null) {
                boolean z10 = tL_messages_stickerSet.set.id == vxVar.d;
                int i10 = xx.a;
                l41 J = l41.J(xx.class);
                long j10 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = oxVar.a;
                if (stickerSetCovered != null) {
                    arrayList.add(xx.a(stickerSetCovered, oxVar, stickerSetCovered.set.id == vxVar.d));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        ry ryVar = (ry) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = ryVar.A;
        int size = arrayList2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i9);
            i9++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.id, 1);
                boolean z10 = tL_messages_stickerSet.set.id == ryVar.d;
                int i10 = xx.a;
                l41 J = l41.J(xx.class);
                long j10 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = ryVar.F;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            ox oxVar = (ox) obj4;
            TLRPC.StickerSet stickerSet = oxVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(xx.a(oxVar.a, oxVar, stickerSet.id == ryVar.d));
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
        n30 n30Var = (n30) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        n30Var.c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(n30Var.a).history);
        if (n30Var.c.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < n30Var.c.size(); i9++) {
            String str = (String) n30Var.c.get(i9);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(l41.c(i9 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(l41.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        ih.h6 h6Var;
        o30 o30Var = (o30) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = o30Var.K;
        int i9 = 0;
        boolean z10 = o30Var.L && (h6Var = o30Var.M) != null && h6Var.i.size() > 0;
        if (z10) {
            ih.h6 h6Var2 = o30Var.M;
            int i10 = of.h1.a;
            l41 J = l41.J(of.h1.class);
            J.G = h6Var2;
            arrayList.add(J);
        }
        o30Var.N = z10;
        while (i9 < arrayList2.size()) {
            int i11 = i9 + 1;
            MessageObject messageObject = (MessageObject) arrayList2.get(i9);
            l41 l41Var = new l41(33);
            l41Var.d = i11;
            l41Var.G = messageObject;
            arrayList.add(l41Var);
            i9 = i11;
        }
        if (o30Var.O || !o30Var.R) {
            arrayList.add(l41.o(-2, 1));
            arrayList.add(l41.o(-3, 1));
            arrayList.add(l41.o(-4, 1));
        }
        if (o30Var.N || !z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new np(o30Var, 20));
    }

    private final void g(Object obj, Object obj2) {
        v60 v60Var = (v60) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        x60 x60Var = v60Var.x;
        x60Var.f.setAlpha(1.0f);
        if (x60Var.u) {
            v60Var.c = bitmap;
        }
        ng.b bVar = x60Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            og.d.c(x60Var.n, v60Var);
            ViewGroup viewGroup = x60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        kg0 kg0Var = (kg0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = kg0Var.e;
        ArrayList arrayList3 = kg0Var.n;
        int i9 = 0;
        if (kg0Var.d == null) {
            arrayList.add(l41.o(-1, 7));
            arrayList.add(l41.o(-2, 7));
            arrayList.add(l41.o(-3, 7));
            kg0Var.M = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(kg0Var.w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(l41.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i9 < size) {
                Object obj3 = arrayList2.get(i9);
                i9++;
                l41 l41Var = new l41(33);
                l41Var.G = (MessageObject) obj3;
                arrayList.add(l41Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(l41.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i9 < size2) {
                Object obj4 = arrayList3.get(i9);
                i9++;
                l41 l41Var2 = new l41(33);
                l41Var2.G = (MessageObject) obj4;
                arrayList.add(l41Var2);
            }
        }
        if (kg0Var.v || ((kg0Var.I && !kg0Var.J) || (!isEmpty && !arrayList3.isEmpty() && !kg0Var.s))) {
            arrayList.add(l41.o(kg0Var.H * 3, 7));
            arrayList.add(l41.o((kg0Var.H * 3) + 1, 7));
            arrayList.add(l41.o((kg0Var.H * 3) + 2, 7));
        }
        kg0Var.M = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        ll0 ll0Var = (ll0) this.b;
        ll0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        ll0Var.e = paint;
        Bitmap bitmap = ll0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        ll0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        ll0Var.f = new Matrix();
        ng.b bVar = ll0Var.h;
        bVar.a((Bitmap) obj2);
        og.d.c(bVar, ll0Var.s);
        ViewGroup viewGroup = ll0Var.y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        cx0 cx0Var = (cx0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        cx0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(cx0Var.O.set);
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
        l41 a2;
        TL_iv.RichMessage richMessage;
        l41 a3;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        l41 a10;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        boolean z10;
        String str2;
        MediaController.AudioEntry audioEntry;
        z41 z41Var;
        int i9;
        boolean z11;
        int i10 = this.a;
        String str3 = null;
        int i11 = 5;
        final int i12 = 0;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                e0 e0Var = (e0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var2 = (z41) obj2;
                boolean[] zArr = e0Var.l0;
                boolean[] zArr2 = e0Var.m0;
                d0 d0Var = e0Var.t0;
                arrayList.add(l41.B(null));
                arrayList.add(l41.l(e0Var.r0));
                arrayList.add(l41.B(null));
                z41Var2.A = 1;
                z41Var2.U();
                d0 d0Var2 = e0Var.s0;
                int selectedTab = d0Var2 != null ? d0Var2.getSelectedTab() : 0;
                int i13 = 6;
                int i14 = 7;
                if (selectedTab == 0) {
                    String str4 = e0Var.n0;
                    if (str4 == null || str4.equalsIgnoreCase(TranslateController.UNKNOWN_LANGUAGE)) {
                        arrayList.add(e31.b(3, LocaleController.getString(R.string.AIEditorOriginalText), null, null, null));
                    } else {
                        String D = z21.D(e0Var.n0, null, zArr2);
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
                            D = z21.y(D);
                        }
                        arrayList.add(e31.b(3, substring2, D, substring3, null));
                    }
                    arrayList.add(e0Var.h0() ? e0Var.i0(4, e0Var.U, false) : i31.a(4, e0Var.T, e0Var.L0, new b(e0Var, 4), null, null));
                    String D2 = z21.D(e0Var.o0, zArr, null);
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
                        D2 = z21.y(D2);
                    }
                    arrayList.add(e31.a(5, str, ta.b.j(D2, ""), substring, new b(e0Var, i11), e0Var.p0, new b(e0Var, i13), null));
                    if (e0Var.h0()) {
                        boolean z12 = e0Var.V;
                        if (z12 || (richMessage3 = e0Var.X) == null) {
                            richMessage3 = e0Var.U;
                        }
                        a10 = e0Var.i0(6, richMessage3, z12);
                    } else {
                        boolean z13 = e0Var.V;
                        a10 = i31.a(z13 ? 7 : 6, e0Var.W, false, null, null, !z13 ? new b(e0Var, i14) : null);
                    }
                    arrayList.add(a10);
                } else if (selectedTab == 1) {
                    arrayList.add(l41.k(d0Var));
                    if (d0Var.getSelectedTone() instanceof a0) {
                        arrayList.add(l41.j(10, e0Var.v0));
                        z41Var2.T();
                        arrayList.add(l41.A(11, null));
                        z41Var2.U();
                    }
                    if ((d0Var.getSelectedTab() >= 0 || e0Var.p0) && (!(d0Var.getSelectedTone() instanceof a0) || TextUtils.equals(e0Var.w0.getText().toString(), e0Var.E0))) {
                        arrayList.add(e31.a(7, LocaleController.getString(R.string.AIEditorResult), null, null, null, e0Var.p0, new b(e0Var, i13), null));
                        if (e0Var.h0()) {
                            boolean z14 = e0Var.Y;
                            if (z14 || (richMessage2 = e0Var.a0) == null) {
                                richMessage2 = e0Var.U;
                            }
                            a3 = e0Var.i0(8, richMessage2, z14);
                        } else {
                            boolean z15 = e0Var.Y;
                            a3 = i31.a(z15 ? 7 : 6, e0Var.Z, false, null, null, !z15 ? new b(e0Var, i14) : null);
                        }
                        arrayList.add(a3);
                    } else {
                        arrayList.add(e31.a(5, LocaleController.getString(R.string.AIEditorOriginal), null, null, null, e0Var.p0, new b(e0Var, i13), null));
                        arrayList.add(e0Var.h0() ? e0Var.i0(6, e0Var.U, false) : i31.a(e0Var.Y ? 7 : 6, e0Var.T, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(e31.b(3, LocaleController.getString(R.string.AIEditorOriginal), null, null, null));
                    arrayList.add(e0Var.h0() ? e0Var.i0(4, e0Var.U, false) : i31.a(4, e0Var.T, e0Var.L0, new b(e0Var, 4), null, null));
                    arrayList.add(e31.b(5, LocaleController.getString(R.string.AIEditorResult), null, null, null));
                    if (e0Var.h0()) {
                        boolean z16 = e0Var.b0;
                        if (z16 || (richMessage = e0Var.d0) == null) {
                            richMessage = e0Var.U;
                        }
                        a2 = e0Var.i0(6, richMessage, z16);
                    } else {
                        boolean z17 = e0Var.b0;
                        a2 = i31.a(z17 ? 7 : 6, e0Var.c0, false, null, null, !z17 ? new b(e0Var, i14) : null);
                    }
                    arrayList.add(a2);
                }
                z41Var2.T();
                arrayList.add(l41.B(null));
                break;
            case 1:
                q.Q((q) obj3, (ArrayList) obj, (z41) obj2);
                break;
            case 2:
                y yVar = (y) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(l41.B(null));
                arrayList2.add(l41.l(yVar.T));
                arrayList2.add(l41.B(null));
                arrayList2.add(l41.k(yVar.W));
                arrayList2.add(l41.B(null));
                arrayList2.add(l41.k(yVar.X));
                arrayList2.add(l41.B(null));
                if (yVar.f0 != null) {
                    l41 e10 = l41.e(1, LocaleController.getString(R.string.AIEditorDeleteStyle));
                    e10.r = true;
                    arrayList2.add(e10);
                    arrayList2.add(l41.B(null));
                }
                arrayList2.add(l41.l(yVar.Y));
                break;
            case 3:
                ((g0) obj3).P((ArrayList) obj, (z41) obj2);
                break;
            case 4:
                ((ChatActivityEnterView) obj3).e0((Canvas) obj, (Utilities.Callback0Return) obj2);
                break;
            case 5:
                vi viVar = (vi) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                z41 z41Var3 = (z41) obj2;
                int i15 = viVar.M;
                ArrayList arrayList4 = viVar.J;
                MessagesController.SavedMusicList savedMusicList = viVar.G;
                ArrayList arrayList5 = viVar.H;
                HashSet hashSet = viVar.F;
                ArrayList arrayList6 = viVar.I;
                arrayList3.add(l41.D(-100, AndroidUtilities.dp(1.0f)));
                int size = arrayList3.size();
                if (TextUtils.isEmpty(viVar.A)) {
                    z41Var3.U();
                    int i16 = 0;
                    while (i16 < viVar.E.size()) {
                        MediaController.AudioEntry audioEntry2 = (MediaController.AudioEntry) viVar.E.get(i16);
                        audioEntry2.messageObject.setQuery(str3);
                        l41 a11 = org.telegram.ui.Cells.g7.a(audioEntry2, new mi(viVar, 0));
                        a11.K(hashSet.contains(audioEntry2));
                        a11.d = -1;
                        arrayList3.add(a11);
                        i16++;
                        str3 = null;
                    }
                    if (viVar.D) {
                        arrayList3.add(l41.o(11, 4));
                        arrayList3.add(l41.o(12, 4));
                        arrayList3.add(l41.o(13, 4));
                    }
                    z41Var3.T();
                    if (savedMusicList != null) {
                        int size2 = savedMusicList.list.size();
                        if (size2 < arrayList5.size()) {
                            arrayList5.subList(size2, arrayList5.size()).clear();
                        }
                        int i17 = 0;
                        while (i17 < size2) {
                            if (i17 >= arrayList5.size()) {
                                audioEntry = new MediaController.AudioEntry();
                                arrayList5.add(audioEntry);
                            } else {
                                audioEntry = (MediaController.AudioEntry) arrayList5.get(i17);
                            }
                            if (audioEntry.messageObject != savedMusicList.list.get(i17)) {
                                MessageObject messageObject = savedMusicList.list.get(i17);
                                int i18 = viVar.i0;
                                viVar.i0 = i18 - 1;
                                z41Var = z41Var3;
                                i9 = i17;
                                audioEntry.id = i18;
                                audioEntry.messageObject = messageObject;
                            } else {
                                z41Var = z41Var3;
                                i9 = i17;
                            }
                            i17 = i9 + 1;
                            z41Var3 = z41Var;
                        }
                    }
                    z41 z41Var4 = z41Var3;
                    if (savedMusicList != null && arrayList5 != null && !arrayList5.isEmpty()) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(l41.A(-98, null));
                        }
                        z41Var4.U();
                        arrayList3.add(l41.s(45, LocaleController.getString(R.string.AudioSearchProfile)));
                        for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                            MediaController.AudioEntry audioEntry3 = (MediaController.AudioEntry) arrayList5.get(i19);
                            l41 a12 = org.telegram.ui.Cells.g7.a(audioEntry3, new mi(viVar, 0));
                            a12.K(hashSet.contains(audioEntry3));
                            arrayList3.add(a12);
                        }
                        if (savedMusicList.loading) {
                            arrayList3.add(l41.o(41, 4));
                            arrayList3.add(l41.o(42, 4));
                            arrayList3.add(l41.o(43, 4));
                        }
                        if (!savedMusicList.loading && !savedMusicList.endReached) {
                            l41 c10 = l41.c(viVar.O, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c10.q = true;
                            arrayList3.add(c10);
                        }
                        z41Var4.T();
                    }
                    if (arrayList6 != null && (!arrayList6.isEmpty() || viVar.R >= 0 || viVar.T)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(l41.A(-98, null));
                        }
                        z41Var4.U();
                        arrayList3.add(l41.s(((viVar.R >= 0 || viVar.T) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                            MediaController.AudioEntry audioEntry4 = (MediaController.AudioEntry) arrayList6.get(i20);
                            audioEntry4.messageObject.setQuery(viVar.A);
                            l41 a13 = org.telegram.ui.Cells.g7.a(audioEntry4, new mi(viVar, 0));
                            a13.K(hashSet.contains(audioEntry4));
                            arrayList3.add(a13);
                        }
                        if (viVar.R >= 0 || viVar.T) {
                            arrayList3.add(l41.o(21, 4));
                            arrayList3.add(l41.o(22, 4));
                            arrayList3.add(l41.o(23, 4));
                        }
                        if (viVar.W) {
                            l41 c11 = l41.c(i15, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c11.q = true;
                            arrayList3.add(c11);
                        }
                        z41Var4.T();
                    }
                } else {
                    String lowerCase = viVar.A.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    boolean z18 = false;
                    for (int i21 = 0; i21 < viVar.E.size(); i21++) {
                        MediaController.AudioEntry audioEntry5 = (MediaController.AudioEntry) viVar.E.get(i21);
                        String str5 = audioEntry5.author;
                        if (str5 != null) {
                            String lowerCase2 = str5.toLowerCase();
                            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.l0.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, translitSafe2)) {
                                z10 = true;
                                str2 = audioEntry5.title;
                                if (str2 == null) {
                                    String lowerCase3 = str2.toLowerCase();
                                    boolean z19 = z10;
                                    String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                                    z10 = z19 || lowerCase3.startsWith(lowerCase) || org.telegram.messenger.l0.w(" ", lowerCase, lowerCase3) || translitSafe3.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, translitSafe3);
                                }
                                if (z10) {
                                    if (!z18) {
                                        if (arrayList3.size() > size) {
                                            arrayList3.add(l41.A(-97, null));
                                        }
                                        z41Var3.U();
                                        arrayList3.add(l41.s(10, LocaleController.getString(R.string.AudioSearchLocal)));
                                        z18 = true;
                                    }
                                    audioEntry5.messageObject.setQuery(viVar.A);
                                    l41 a14 = org.telegram.ui.Cells.g7.a(audioEntry5, new mi(viVar, 0));
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
                    z41Var3.T();
                    if (arrayList6 != null && (!arrayList6.isEmpty() || viVar.R >= 0 || viVar.T)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(l41.A(-98, null));
                        }
                        z41Var3.U();
                        arrayList3.add(l41.s(((viVar.R >= 0 || viVar.T) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                            MediaController.AudioEntry audioEntry6 = (MediaController.AudioEntry) arrayList6.get(i22);
                            audioEntry6.messageObject.setQuery(viVar.A);
                            l41 a15 = org.telegram.ui.Cells.g7.a(audioEntry6, new mi(viVar, 0));
                            a15.K(hashSet.contains(audioEntry6));
                            arrayList3.add(a15);
                        }
                        if (viVar.R >= 0 || viVar.T) {
                            arrayList3.add(l41.o(21, 4));
                            arrayList3.add(l41.o(22, 4));
                            arrayList3.add(l41.o(23, 4));
                        }
                        if (viVar.W) {
                            l41 c12 = l41.c(i15, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c12.q = true;
                            arrayList3.add(c12);
                        }
                        z41Var3.T();
                    }
                    if (arrayList4 != null && (!arrayList4.isEmpty() || viVar.a0 >= 0 || viVar.j0)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(l41.A(-96, null));
                        }
                        z41Var3.U();
                        arrayList3.add(l41.s(((viVar.a0 >= 0 || viVar.j0) && arrayList4.isEmpty()) ? 35 : 30, LocaleController.getString(R.string.AudioSearchGlobal)));
                        int size3 = arrayList4.size();
                        for (int i23 = 0; i23 < size3; i23++) {
                            MediaController.AudioEntry audioEntry7 = (MediaController.AudioEntry) arrayList4.get(i23);
                            audioEntry7.messageObject.setQuery(viVar.A);
                            l41 a16 = org.telegram.ui.Cells.g7.a(audioEntry7, new mi(viVar, 0));
                            a16.K(hashSet.contains(audioEntry7));
                            arrayList3.add(a16);
                        }
                        if (viVar.a0 >= 0 || viVar.j0) {
                            arrayList3.add(l41.o(31, 4));
                            arrayList3.add(l41.o(32, 4));
                            arrayList3.add(l41.o(33, 4));
                        }
                        if (viVar.d0) {
                            l41 c13 = l41.c(viVar.N, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c13.q = true;
                            arrayList3.add(c13);
                        }
                        z41Var3.T();
                    }
                }
                if (arrayList3.size() <= size && !viVar.D) {
                    if (TextUtils.isEmpty(viVar.A)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFiles);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i24 = ti.a;
                        l41 J = l41.J(ti.class);
                        J.l = string3;
                        J.m = string4;
                        arrayList3.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(viVar.A.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, viVar.A));
                        int i25 = ti.a;
                        l41 J2 = l41.J(ti.class);
                        J2.l = string5;
                        J2.m = replaceTags;
                        arrayList3.add(J2);
                    }
                }
                arrayList3.add(l41.A(-99, null));
                break;
            case 6:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                boolean z20 = ChatAttachAlertPhotoLayout.m1;
                chatAttachAlertPhotoLayout.getClass();
                ((Runnable) obj2).run();
                chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
                break;
            case 7:
                cr.Q((cr) obj3, (ArrayList) obj);
                break;
            case 8:
                final hs hsVar = (hs) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                int i26 = hsVar.J;
                v2 v2Var = hsVar.d0;
                ArrayList arrayList8 = hsVar.P;
                gs gsVar = hsVar.M;
                boolean z21 = hsVar.L;
                HashSet hashSet2 = new HashSet();
                if (TextUtils.isEmpty(hsVar.a0)) {
                    ArrayList<TLRPC.TL_topPeer> arrayList9 = MediaDataController.getInstance(i26).webapps;
                    ArrayList arrayList10 = new ArrayList();
                    if (arrayList9 != null) {
                        for (int i27 = 0; i27 < arrayList9.size(); i27++) {
                            TLRPC.User user = MessagesController.getInstance(i26).getUser(Long.valueOf(DialogObject.getPeerDialogId(arrayList9.get(i27).peer)));
                            if (user != null && user.bot) {
                                arrayList10.add(user);
                            }
                        }
                    }
                    hsVar.T = arrayList7.size();
                    if (!arrayList10.isEmpty() && !z21) {
                        if (arrayList10.size() > 5) {
                            final int i28 = 1;
                            arrayList7.add(l41.r(LocaleController.getString(R.string.SearchAppsMine), LocaleController.getString(hsVar.Q ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.es
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i28) {
                                        case 0:
                                            hs hsVar2 = hsVar;
                                            hsVar2.R = !hsVar2.R;
                                            hsVar2.N(true);
                                            break;
                                        default:
                                            hs hsVar3 = hsVar;
                                            hsVar3.Q = !hsVar3.Q;
                                            hsVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList7.add(l41.q(LocaleController.getString(R.string.SearchAppsMine)));
                        }
                        for (int i29 = 0; i29 < arrayList10.size() && (i29 < 5 || hsVar.Q); i29++) {
                            TLRPC.User user2 = (TLRPC.User) arrayList10.get(i29);
                            if (!hashSet2.contains(Long.valueOf(user2.id))) {
                                hashSet2.add(Long.valueOf(user2.id));
                                l41 v = l41.v(user2);
                                v.q = true;
                                v.t = true;
                                v.H = v2Var;
                                arrayList7.add(v);
                            }
                        }
                    }
                    hashSet2.clear();
                    hsVar.U = arrayList7.size();
                    ArrayList arrayList11 = gsVar.h;
                    if (arrayList11.isEmpty()) {
                        if (gsVar.c || !gsVar.e) {
                            if (!z21) {
                                arrayList7.add(l41.n(30));
                            }
                            arrayList7.add(l41.n(29));
                            arrayList7.add(l41.n(29));
                            arrayList7.add(l41.n(29));
                            arrayList7.add(l41.n(29));
                        }
                        z11 = false;
                    } else {
                        if (!z21) {
                            arrayList7.add(l41.q(LocaleController.getString(R.string.SearchAppsPopular)));
                        }
                        boolean z22 = false;
                        for (int i30 = 0; i30 < arrayList11.size(); i30++) {
                            TLRPC.User user3 = (TLRPC.User) arrayList11.get(i30);
                            if (!hashSet2.contains(Long.valueOf(user3.id))) {
                                hashSet2.add(Long.valueOf(user3.id));
                                l41 v4 = l41.v(user3);
                                v4.q = true;
                                v4.r = true;
                                v4.t = true;
                                v4.H = v2Var;
                                arrayList7.add(v4);
                                z22 = true;
                            }
                        }
                        if (gsVar.c || !gsVar.e) {
                            arrayList7.add(l41.n(29));
                            arrayList7.add(l41.n(29));
                            arrayList7.add(l41.n(29));
                        }
                        z11 = z22;
                    }
                    if (z11) {
                        arrayList7.add(l41.B(hsVar.S));
                        break;
                    }
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.addAll(hsVar.N);
                    arrayList12.addAll(hsVar.O);
                    if (!arrayList12.isEmpty()) {
                        if (arrayList12.size() <= 5 || arrayList8.isEmpty() || z21) {
                            arrayList7.add(l41.q(LocaleController.getString(R.string.SearchApps)));
                        } else {
                            final int i31 = 0;
                            arrayList7.add(l41.r(LocaleController.getString(R.string.SearchApps), LocaleController.getString(hsVar.R ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.es
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i31) {
                                        case 0:
                                            hs hsVar2 = hsVar;
                                            hsVar2.R = !hsVar2.R;
                                            hsVar2.N(true);
                                            break;
                                        default:
                                            hs hsVar3 = hsVar;
                                            hsVar3.Q = !hsVar3.Q;
                                            hsVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        }
                        int size4 = arrayList12.size();
                        if (!hsVar.R && !arrayList8.isEmpty() && !z21) {
                            size4 = Math.min(5, size4);
                        }
                        for (int i32 = 0; i32 < size4; i32++) {
                            l41 v10 = l41.v((TLObject) arrayList12.get(i32));
                            v10.t = true;
                            v10.H = v2Var;
                            arrayList7.add(v10);
                        }
                    }
                    if (!arrayList8.isEmpty() && !z21) {
                        arrayList7.add(l41.q(LocaleController.getString(R.string.SearchMessages)));
                        int size5 = arrayList8.size();
                        int i33 = 0;
                        while (i33 < size5) {
                            Object obj4 = arrayList8.get(i33);
                            i33++;
                            l41 l41Var = new l41(33);
                            l41Var.G = (MessageObject) obj4;
                            arrayList7.add(l41Var);
                        }
                        if (hsVar.X) {
                            arrayList7.add(l41.n(1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                final cn0 cn0Var = (cn0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                ArrayList arrayList14 = cn0Var.L;
                ArrayList arrayList15 = cn0Var.R;
                int i34 = cn0Var.J;
                if (TextUtils.isEmpty(cn0Var.X)) {
                    if (arrayList15 != null && !arrayList15.isEmpty()) {
                        if (arrayList15.size() > 5) {
                            arrayList13.add(l41.r(LocaleController.getString(R.string.SearchMyChannels), LocaleController.getString(cn0Var.Q ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.is
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i12) {
                                        case 0:
                                            cn0 cn0Var2 = cn0Var;
                                            cn0Var2.Q = !cn0Var2.Q;
                                            cn0Var2.N(true);
                                            if (cn0Var2.Q) {
                                                AndroidUtilities.hideKeyboard(cn0Var2.Z.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            cn0 cn0Var3 = cn0Var;
                                            cn0Var3.P = !cn0Var3.P;
                                            cn0Var3.N(true);
                                            if (cn0Var3.P) {
                                                AndroidUtilities.hideKeyboard(cn0Var3.Z.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList13.add(l41.q(LocaleController.getString(R.string.SearchMyChannels)));
                        }
                        int size6 = arrayList15.size();
                        if (!cn0Var.Q) {
                            size6 = Math.min(5, size6);
                        }
                        for (int i35 = 0; i35 < size6; i35++) {
                            l41 v11 = l41.v((TLObject) arrayList15.get(i35));
                            v11.I = true;
                            arrayList13.add(v11);
                        }
                    }
                    MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i34).getCachedChannelRecommendations(0L);
                    if (cachedChannelRecommendations != null) {
                        ArrayList arrayList16 = new ArrayList();
                        ArrayList<TLObject> arrayList17 = cachedChannelRecommendations.chats;
                        int size7 = arrayList17.size();
                        int i36 = 0;
                        while (i36 < size7) {
                            TLObject tLObject = arrayList17.get(i36);
                            i36++;
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                TLRPC.Chat chat2 = MessagesController.getInstance(i34).getChat(Long.valueOf(chat.id));
                                if (ChatObject.isNotInChat(chat) && (chat2 == null || ChatObject.isNotInChat(chat2))) {
                                    arrayList16.add(chat);
                                }
                            }
                        }
                        if (!arrayList16.isEmpty()) {
                            arrayList13.add(l41.q(LocaleController.getString(R.string.SearchRecommendedChannels)));
                        }
                        int size8 = arrayList16.size();
                        while (i12 < size8) {
                            Object obj5 = arrayList16.get(i12);
                            i12++;
                            arrayList13.add(l41.v((TLRPC.Chat) obj5));
                        }
                        break;
                    } else {
                        arrayList13.add(l41.n(30));
                        arrayList13.add(l41.n(29));
                        arrayList13.add(l41.n(29));
                        arrayList13.add(l41.n(29));
                        arrayList13.add(l41.n(29));
                        break;
                    }
                } else {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = cn0Var.M;
                    int size9 = arrayList19.size();
                    int i37 = 0;
                    while (i37 < size9) {
                        Object obj6 = arrayList19.get(i37);
                        i37++;
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
                        TLRPC.Chat chat4 = MessagesController.getInstance(i34).getChat(Long.valueOf(chat3.id));
                        if (ChatObject.isNotInChat(chat3) && (chat4 == null || ChatObject.isNotInChat(chat4))) {
                            arrayList18.add(chat3);
                        }
                    }
                    ArrayList arrayList20 = cn0Var.N;
                    int size10 = arrayList20.size();
                    int i38 = 0;
                    while (i38 < size10) {
                        Object obj7 = arrayList20.get(i38);
                        i38++;
                        TLRPC.Chat chat5 = (TLRPC.Chat) obj7;
                        TLRPC.Chat chat6 = MessagesController.getInstance(i34).getChat(Long.valueOf(chat5.id));
                        if (ChatObject.isNotInChat(chat5) && (chat6 == null || ChatObject.isNotInChat(chat6))) {
                            arrayList18.add(chat5);
                        }
                    }
                    ArrayList arrayList21 = cn0Var.O;
                    int size11 = arrayList21.size();
                    int i39 = 0;
                    while (i39 < size11) {
                        Object obj8 = arrayList21.get(i39);
                        i39++;
                        TLRPC.Chat chat7 = (TLRPC.Chat) obj8;
                        TLRPC.Chat chat8 = MessagesController.getInstance(i34).getChat(Long.valueOf(chat7.id));
                        if (ChatObject.isNotInChat(chat7) && (chat8 == null || ChatObject.isNotInChat(chat8))) {
                            arrayList18.add(chat7);
                        }
                    }
                    if (!arrayList18.isEmpty()) {
                        if (arrayList18.size() <= 5 || arrayList14.isEmpty()) {
                            arrayList13.add(l41.q(LocaleController.getString(R.string.SearchChannels)));
                        } else {
                            final int i40 = 1;
                            arrayList13.add(l41.r(LocaleController.getString(R.string.SearchChannels), LocaleController.getString(cn0Var.P ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.is
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i40) {
                                        case 0:
                                            cn0 cn0Var2 = cn0Var;
                                            cn0Var2.Q = !cn0Var2.Q;
                                            cn0Var2.N(true);
                                            if (cn0Var2.Q) {
                                                AndroidUtilities.hideKeyboard(cn0Var2.Z.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            cn0 cn0Var3 = cn0Var;
                                            cn0Var3.P = !cn0Var3.P;
                                            cn0Var3.N(true);
                                            if (cn0Var3.P) {
                                                AndroidUtilities.hideKeyboard(cn0Var3.Z.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        }
                        int size12 = arrayList18.size();
                        if (!cn0Var.P && !arrayList14.isEmpty()) {
                            size12 = Math.min(5, size12);
                        }
                        for (int i41 = 0; i41 < size12; i41++) {
                            arrayList13.add(l41.v((TLObject) arrayList18.get(i41)));
                        }
                    }
                    if (!arrayList14.isEmpty()) {
                        arrayList13.add(l41.q(LocaleController.getString(R.string.SearchMessages)));
                        int size13 = arrayList14.size();
                        int i42 = 0;
                        while (i42 < size13) {
                            Object obj9 = arrayList14.get(i42);
                            i42++;
                            l41 l41Var2 = new l41(33);
                            l41Var2.G = (MessageObject) obj9;
                            arrayList13.add(l41Var2);
                        }
                        if (cn0Var.U) {
                            arrayList13.add(l41.n(1));
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
                ((ArrayList) obj).add(l41.j(-1, ((g30) obj3).T));
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
                z21.p((z21) obj3, (String) obj, (Boolean) obj2);
                break;
            default:
                ((d51) obj3).T((ArrayList) obj, (z41) obj2);
                break;
        }
    }
}
