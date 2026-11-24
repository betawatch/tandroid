// default package

import android.util.Base64;
import android.util.JsonReader;
import android.view.View;
import com.google.firebase.components.ComponentRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.utils.code.highlight.PrismaHighlighter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class a32 implements ku4, ee, kac, y73, gka, hka, pac, mr2, v03 {
    public final /* synthetic */ byte a;

    public /* synthetic */ a32(byte b) {
        this.a = b;
    }

    public static vk2 c() {
        InputStream open = a.b.getAssets().open("grammars.dat");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[TLObject.FLAG_13];
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        open.close();
                        return new vk2(new PrismaHighlighter(byteArray));
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void f(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override // v03
    public final Object a(JsonReader jsonReader) {
        switch (this.a) {
            case 28:
                jsonReader.beginObject();
                String str = null;
                String str2 = null;
                String str3 = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName) {
                        case "libraryName":
                            str2 = jsonReader.nextString();
                            if (str2 != null) {
                                break;
                            } else {
                                gxc.d("Null libraryName");
                                break;
                            }
                        case "arch":
                            str = jsonReader.nextString();
                            if (str != null) {
                                break;
                            } else {
                                gxc.d("Null arch");
                                break;
                            }
                        case "buildId":
                            str3 = jsonReader.nextString();
                            if (str3 != null) {
                                break;
                            } else {
                                gxc.d("Null buildId");
                                break;
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (str != null && str2 != null && str3 != null) {
                    break;
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (str == null) {
                        sb.append(" arch");
                    }
                    if (str2 == null) {
                        sb.append(" libraryName");
                    }
                    if (str3 == null) {
                        sb.append(" buildId");
                    }
                    dq9.m(ts2.n("Missing required properties:", sb));
                    break;
                }
            default:
                jsonReader.beginObject();
                String str4 = null;
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (nextName2.equals("filename")) {
                        str4 = jsonReader.nextString();
                        if (str4 == null) {
                            gxc.d("Null filename");
                            break;
                        }
                    } else if (nextName2.equals("contents")) {
                        bArr = Base64.decode(jsonReader.nextString(), 2);
                        if (bArr == null) {
                            gxc.d("Null contents");
                            break;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (str4 != null && bArr != null) {
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    if (str4 == null) {
                        sb2.append(" filename");
                    }
                    if (bArr == null) {
                        sb2.append(" contents");
                    }
                    dq9.m(ts2.n("Missing required properties:", sb2));
                    break;
                }
        }
        return null;
    }

    @Override // pac
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        byte b = this.a;
        return Boolean.FALSE;
    }

    @Override // y73
    public final a83 createDataSource() {
        return new ly(a.b);
    }

    @Override // hka
    public final void d(Object obj, float f) {
        gl2 gl2Var = (gl2) obj;
        switch (this.a) {
            case 12:
                gl2Var.M1 = f;
                if (gl2Var.getParent() != null) {
                    ((View) gl2Var.getParent()).invalidate();
                    break;
                }
                break;
            case 13:
            case 15:
            default:
                gl2Var.P1 = f;
                if (gl2Var.getParent() != null) {
                    ((View) gl2Var.getParent()).invalidate();
                    break;
                }
                break;
            case 14:
                gl2Var.N1 = f;
                if (gl2Var.getParent() != null) {
                    ((View) gl2Var.getParent()).invalidate();
                    break;
                }
                break;
            case 16:
                gl2Var.O1 = f;
                if (gl2Var.getParent() != null) {
                    ((View) gl2Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // mr2
    public final List g(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // gka
    public final float get(Object obj) {
        gl2 gl2Var = (gl2) obj;
        switch (this.a) {
            case 11:
                return gl2Var.M1;
            case 12:
            case 14:
            default:
                return gl2Var.P1;
            case 13:
                return gl2Var.N1;
            case 15:
                return gl2Var.O1;
        }
    }

    @Override // kac
    public final Object j(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        return num.intValue() == 0 ? jb6.H(',', "Stars", num2.intValue()) : String.valueOf(num2);
    }

    @Override // ku4
    public final Object l(Object obj) {
        switch (this.a) {
            case 0:
                ika ikaVar = d32.c0;
                return Boolean.FALSE;
            default:
                return CheckBoxBase.I;
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 1:
                heVar.dismiss();
                break;
            case 2:
            default:
                heVar.dismiss();
                break;
            case 3:
                heVar.dismiss();
                break;
        }
    }
}
