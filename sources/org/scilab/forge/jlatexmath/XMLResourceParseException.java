package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class XMLResourceParseException extends ResourceParseException {
    private static final long serialVersionUID = 2091302779298293946L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public XMLResourceParseException(String str, String str2, String str3, String str4) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": invalid <");
        sb.append(str2);
        sb.append(">-element found: attribute '");
        sb.append(str3);
        sb.append("' ");
        sb.append(str4 == null ? "is required!" : str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public XMLResourceParseException(String str, String str2, String str3, String str4, Throwable th) {
        super(r0.toString(), th);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": invalid <");
        sb.append(str2);
        sb.append(">-element found: attribute '");
        sb.append(str3);
        sb.append("' ");
        sb.append(str4 == null ? "is required!" : str4);
    }

    public XMLResourceParseException(String str, String str2) {
        super(str + ": the required <" + str2 + ">-element is not found!");
    }

    public XMLResourceParseException(String str, Throwable th) {
        super(str, th);
    }

    public XMLResourceParseException(String str) {
        super(str);
    }
}
