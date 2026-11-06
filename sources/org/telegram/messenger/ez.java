package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class ez {
    public int A;
    public int B;
    public int C;
    public Object D;
    public ej E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public org.telegram.ui.qm J;
    public hw K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public nj T;
    public boolean U;
    public long V;
    public long W;
    public long X;
    public TL_iv.RichMessage Y;
    public ArrayList Z;
    public String a;
    public String b;
    public TLRPC.MessageMedia c;
    public TLRPC.TL_photo d;
    public j20 e;
    public TLRPC.User f;
    public TLRPC.TL_document g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll i;
    public sh.f j;
    public int k;
    public TLRPC.TL_messageMediaToDo l;
    public TLRPC.TL_messageMediaInvoice m;
    public TLRPC.TL_messageMediaWebPage n;
    public TLRPC.PhotoSize o;
    public long p;
    public String q;
    public ij r;
    public ij s;
    public TLRPC.WebPage t;
    public boolean u;
    public ij v;
    public ArrayList w;
    public TLRPC.ReplyMarkup x;
    public HashMap y;
    public boolean z;

    public static ez a(long j3, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static ez b(String str, long j3, ij ijVar, ij ijVar2, TLRPC.WebPage webPage, boolean z9, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10, ej ejVar, boolean z11) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, ijVar, ijVar2, webPage, z9, null, arrayList, replyMarkup, hashMap, z10, i7, i10, 0, null, ejVar, z11, false);
    }

    public static ez c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, j20 j20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j3, String str3, ij ijVar, ij ijVar2, TLRPC.WebPage webPage, boolean z9, ij ijVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, ej ejVar, boolean z11, boolean z12) {
        ez ezVar = new ez();
        ezVar.a = str;
        ezVar.b = str2;
        ezVar.c = messageMedia;
        ezVar.d = tL_photo;
        ezVar.e = j20Var;
        ezVar.f = user;
        ezVar.g = tL_document;
        ezVar.h = tL_game;
        ezVar.i = tL_messageMediaPoll;
        ezVar.m = tL_messageMediaInvoice;
        ezVar.p = j3;
        ezVar.q = str3;
        ezVar.r = ijVar;
        ezVar.s = ijVar2;
        ezVar.t = webPage;
        ezVar.u = z9;
        ezVar.v = ijVar3;
        ezVar.w = arrayList;
        ezVar.x = replyMarkup;
        ezVar.y = hashMap;
        ezVar.z = z10;
        ezVar.A = i7;
        ezVar.B = i10;
        ezVar.C = i11;
        ezVar.D = obj;
        ezVar.E = ejVar;
        ezVar.F = z11;
        ezVar.G = z12;
        return ezVar;
    }

    public static ez d(TLRPC.MessageMedia messageMedia, long j3, ij ijVar, ij ijVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z9, int i7) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j3, null, ijVar, ijVar2, null, true, null, null, replyMarkup, hashMap, z9, i7, 0, 0, null, null, false, false);
    }

    public static ez e(TLRPC.TL_document tL_document, j20 j20Var, String str, long j3, ij ijVar, ij ijVar2, String str2, ArrayList arrayList, HashMap hashMap, boolean z9, int i7, int i10, int i11, Object obj, boolean z10) {
        return c(null, str2, null, null, j20Var, null, tL_document, null, null, null, j3, str, ijVar, ijVar2, null, true, null, arrayList, null, hashMap, z9, i7, i10, i11, obj, null, false, z10);
    }

    public static ez f(TLRPC.TL_document tL_document, j20 j20Var, String str, long j3, ij ijVar, ij ijVar2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z9, int i7, int i10, int i11, Object obj, ej ejVar, boolean z10) {
        return c(null, str2, null, null, j20Var, null, tL_document, null, null, null, j3, str, ijVar, ijVar2, null, true, null, arrayList, replyMarkup, hashMap, z9, i7, i10, i11, obj, ejVar, z10, false);
    }

    public static ez g(TLRPC.User user, long j3, ij ijVar, ij ijVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z9, int i7, int i10) {
        return c(null, null, null, null, null, user, null, null, null, null, j3, null, ijVar, ijVar2, null, true, null, null, replyMarkup, hashMap, z9, i7, i10, 0, null, null, false, false);
    }
}
