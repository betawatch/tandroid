// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bac implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cac b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ bac(cac cacVar, String str, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = cacVar;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c3, code lost:
    
        if (r3 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d3, code lost:
    
        if (r0 == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0177 A[LOOP:1: B:29:0x00f8->B:47:0x0177, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                cac cacVar = this.b;
                String str2 = this.c;
                boolean z3 = this.d;
                boolean z4 = this.e;
                cacVar.getClass();
                gm.c3(new bac(cacVar, str2, z3, z4, (byte) 1));
                break;
            case 1:
                cac cacVar2 = this.b;
                String str3 = this.c;
                boolean z5 = this.d;
                boolean z6 = this.e;
                cacVar2.f.g(str3, true, z5, z6, cacVar2.w.H, 0L, false, 0, 0);
                mp3 mp3Var = Utilities.g;
                bac bacVar = new bac(cacVar2, str3, z6, z5, (byte) 2);
                cacVar2.h = bacVar;
                mp3Var.c(bacVar);
                break;
            default:
                cac cacVar3 = this.b;
                String str4 = this.c;
                boolean z7 = this.d;
                boolean z8 = this.e;
                ArrayList arrayList = cacVar3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    gm.c3(new j2b(cacVar3, new ArrayList(), new ArrayList(), (byte) 25));
                    break;
                } else {
                    boolean z9 = false;
                    String S0 = jb6.D0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i = (S0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i];
                    strArr[0] = lowerCase;
                    if (S0 != null) {
                        strArr[1] = S0;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        TLObject tLObject = (TLObject) arrayList.get(i2);
                        String[] strArr2 = new String[3];
                        boolean z10 = tLObject instanceof TLRPC.User;
                        if (!z10) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            strArr2[z9 ? 1 : 0] = chat.title.toLowerCase();
                            str = chat.username;
                            break;
                        } else {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            strArr2[z9 ? 1 : 0] = bw2.m(z9 ? 1 : 0, user.first_name, user.last_name).toLowerCase();
                            str = m9c.p(user);
                            if (m9c.B(user)) {
                                strArr2[2] = jb6.M0(2131745999, null).toLowerCase();
                            } else if (m9c.D(user)) {
                                if (cacVar3.w.H) {
                                    strArr2[2] = jb6.M0(2131745635, null).toLowerCase();
                                }
                                z = z8;
                                z2 = z7;
                            } else if (user.bot) {
                            }
                            z = z8;
                            String S02 = jb6.D0().S0(strArr2[z9 ? 1 : 0], true, z9);
                            strArr2[1] = S02;
                            if (strArr2[z9 ? 1 : 0].equals(S02)) {
                                strArr2[1] = null;
                            }
                            int i3 = z9 ? 1 : 0;
                            int i4 = i3;
                            boolean z11 = z9;
                            while (i4 < i) {
                                String str5 = strArr[i4];
                                int i5 = i3;
                                for (?? r8 = z11; r8 < 3; r8++) {
                                    String str6 = strArr2[r8];
                                    if (str6 != null) {
                                        if (str6.startsWith(str5)) {
                                            z2 = z7;
                                        } else {
                                            z2 = z7;
                                            if (hg9.s(" ", str5, str6)) {
                                            }
                                        }
                                        i3 = 1;
                                        if (i3 == 0 && str != null && str.toLowerCase().startsWith(str5)) {
                                            i3 = 2;
                                        }
                                        if (i3 == 0) {
                                            if (i3 != 1) {
                                                arrayList3.add(gm.r0(b10.h("@", str), null, "@" + str5));
                                            } else if (z10) {
                                                TLRPC.User user2 = (TLRPC.User) tLObject;
                                                arrayList3.add(gm.r0(user2.first_name, user2.last_name, str5));
                                            } else {
                                                arrayList3.add(gm.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                            }
                                            arrayList2.add(tLObject);
                                        } else {
                                            i4++;
                                            z7 = z2;
                                            z11 = false;
                                        }
                                    } else {
                                        z2 = z7;
                                    }
                                    z7 = z2;
                                }
                                z2 = z7;
                                i3 = i5;
                                if (i3 == 0) {
                                    i3 = 2;
                                }
                                if (i3 == 0) {
                                }
                            }
                            z2 = z7;
                        }
                        i2++;
                        z8 = z;
                        z7 = z2;
                        z9 = false;
                    }
                    gm.c3(new j2b(cacVar3, arrayList2, arrayList3, (byte) 25));
                    break;
                }
        }
    }
}
