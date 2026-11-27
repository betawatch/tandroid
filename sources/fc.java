// default package

import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class fc {
    public static final LongSparseArray a = new LongSparseArray();
    public static final LongSparseArray b = new LongSparseArray();

    public static TL_aicompose.AiComposeTone a(int i, TL_aicompose.InputAiComposeTone inputAiComposeTone) {
        if (inputAiComposeTone == null) {
            return null;
        }
        ArrayList arrayList = uc7.s1(i).Q1().b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
            if ((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneID) && (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.inputAiComposeToneID) inputAiComposeTone).id == ((TL_aicompose.TL_aiComposeTone) aiComposeTone).id) {
                return aiComposeTone;
            }
            if ((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSlug) && (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) && TextUtils.equals(((TL_aicompose.inputAiComposeToneSlug) inputAiComposeTone).slug, ((TL_aicompose.TL_aiComposeTone) aiComposeTone).slug)) {
                return aiComposeTone;
            }
            if ((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneDefault) && (aiComposeTone instanceof TL_aicompose.TL_aiComposeToneDefault) && TextUtils.equals(((TL_aicompose.inputAiComposeToneDefault) inputAiComposeTone).tone, ((TL_aicompose.TL_aiComposeToneDefault) aiComposeTone).tone)) {
                return aiComposeTone;
            }
        }
        return null;
    }

    public static ec b(int i, long j) {
        ec ecVar;
        if (j == 0) {
            return null;
        }
        if (!wf3.B(j)) {
            ls6 d0 = ls6.d0(i);
            d0.k();
            TL_aicompose.inputAiComposeStyle inputaicomposestyle = (TL_aicompose.inputAiComposeStyle) d0.r1.f(j);
            if (inputaicomposestyle != null) {
                ec ecVar2 = new ec();
                ecVar2.c = TextUtils.isEmpty(inputaicomposestyle.to_lang) ? null : inputaicomposestyle.to_lang;
                TL_aicompose.InputAiComposeTone d = d(inputaicomposestyle.tone);
                ecVar2.d = d;
                ecVar2.b = inputaicomposestyle.emojify;
                ecVar2.f = ecVar2.c == null ? 1 : 0;
                TL_aicompose.AiComposeTone a2 = a(i, d);
                String str = (a2 == null || TextUtils.isEmpty(a2.title)) ? null : a2.title;
                String str2 = ecVar2.c;
                if (str2 != null) {
                    String F0 = r3c.F0(r3c.K0(str2, null, null));
                    if (str != null) {
                        F0 = qd4.y(str, " ", F0);
                    }
                    ecVar2.e = F0;
                } else {
                    if (str == null) {
                        str = ob6.M0(2131754960, null);
                    }
                    ecVar2.e = str;
                }
                if (ecVar2.b) {
                    ecVar2.e = c00.k(new StringBuilder(), ecVar2.e, " + Emoji");
                }
                return ecVar2;
            }
        }
        LongSparseArray longSparseArray = a;
        long j2 = (j << 3) + i;
        LongSparseArray longSparseArray2 = b;
        if (longSparseArray2.get(j2) != null) {
            ecVar = (ec) longSparseArray.get(j2);
        } else {
            String string = a.b.getSharedPreferences("anim_ai_always", 0).getString(c(i, j), null);
            if (string != null) {
                try {
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 2));
                    ecVar = new ec();
                    serializedData.readInt32(false);
                    ecVar.f = serializedData.readInt32(false);
                    ecVar.a = serializedData.readBool(false);
                    ecVar.b = serializedData.readBool(false);
                    ecVar.c = serializedData.readBool(false) ? serializedData.readString(false) : null;
                    ecVar.e = serializedData.readString(false);
                    if (serializedData.readBool(false)) {
                        ecVar.d = TL_aicompose.InputAiComposeTone.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    }
                    serializedData.cleanup();
                } catch (Throwable unused) {
                }
                longSparseArray.put(j2, ecVar);
                longSparseArray2.put(j2, Boolean.TRUE);
            }
            ecVar = null;
            longSparseArray.put(j2, ecVar);
            longSparseArray2.put(j2, Boolean.TRUE);
        }
        if (ecVar == null) {
            return null;
        }
        if (ecVar.a || wf3.B(j)) {
            return ecVar;
        }
        return null;
    }

    public static String c(int i, long j) {
        return i + "_" + j;
    }

    public static TL_aicompose.InputAiComposeTone d(TL_aicompose.InputAiComposeTone inputAiComposeTone) {
        if (((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneDefault) && TextUtils.isEmpty(((TL_aicompose.inputAiComposeToneDefault) inputAiComposeTone).tone)) || (inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse)) {
            return null;
        }
        return inputAiComposeTone;
    }

    public static void e(int i, long j, ec ecVar) {
        TL_aicompose.inputAiComposeStyle inputaicomposestyle;
        if (j != 0) {
            byte b2 = 0;
            boolean z = ecVar != null && (ecVar.a || wf3.B(j));
            ec ecVar2 = z ? ecVar : null;
            LongSparseArray longSparseArray = a;
            LongSparseArray longSparseArray2 = b;
            long j2 = (j << 3) + i;
            if (ecVar2 != null || longSparseArray2.get(j2) == null || longSparseArray.get(j2) != null) {
                longSparseArray.put(j2, ecVar2);
                longSparseArray2.put(j2, Boolean.TRUE);
                if (ecVar2 == null) {
                    a.b.getSharedPreferences("anim_ai_always", 0).edit().remove(c(i, j)).apply();
                } else {
                    SerializedData serializedData = new SerializedData();
                    serializedData.writeInt32(1);
                    serializedData.writeInt32(ecVar2.f);
                    serializedData.writeBool(ecVar2.a);
                    serializedData.writeBool(ecVar2.b);
                    serializedData.writeBool(ecVar2.c != null);
                    String str = ecVar2.c;
                    if (str != null) {
                        serializedData.writeString(str);
                    }
                    String str2 = ecVar2.e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    serializedData.writeString(str2);
                    TL_aicompose.InputAiComposeTone d = d(ecVar2.d);
                    serializedData.writeBool(d != null);
                    if (d != null) {
                        d.serializeToStream(serializedData);
                    }
                    a.b.getSharedPreferences("anim_ai_always", 0).edit().putString(c(i, j), Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                    serializedData.cleanup();
                }
            }
            if (wf3.B(j)) {
                return;
            }
            ls6 d0 = ls6.d0(i);
            if (ecVar == null || z) {
                inputaicomposestyle = null;
            } else {
                inputaicomposestyle = new TL_aicompose.inputAiComposeStyle();
                inputaicomposestyle.tone = d(ecVar.d);
                inputaicomposestyle.to_lang = TextUtils.isEmpty(ecVar.c) ? null : ecVar.c;
                inputaicomposestyle.emojify = ecVar.b;
            }
            if (wf3.B(j)) {
                return;
            }
            TLRPC.InputPeer j1 = d0.getMessagesController().j1(j);
            d0.k();
            TL_aicompose.inputAiComposeStyle inputaicomposestyle2 = (TL_aicompose.inputAiComposeStyle) d0.r1.f(j);
            TL_aicompose.inputAiComposeStyle inputaicomposestyle3 = ls6.A0(inputaicomposestyle) ? null : inputaicomposestyle;
            if (ls6.j(inputaicomposestyle2, inputaicomposestyle3)) {
                return;
            }
            d0.F1(j, inputaicomposestyle3);
            TL_aicompose.setChatStyle setchatstyle = new TL_aicompose.setChatStyle();
            setchatstyle.peer = j1;
            setchatstyle.style = inputaicomposestyle3;
            d0.getConnectionsManager().sendRequestTyped(setchatstyle, new ic(b2), new am3(d0, j, inputaicomposestyle3, inputaicomposestyle2));
        }
    }
}
