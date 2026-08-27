package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class XMLResourceParseException extends ResourceParseException {
    private static final long serialVersionUID = 2091302779298293946L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public XMLResourceParseException(String str, String str2, String str3, String str4) {
        super(r0.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(": invalid <");
        sb2.append(str2);
        sb2.append(">-element found: attribute '");
        sb2.append(str3);
        sb2.append("' ");
        sb2.append(str4 == null ? "is required!" : str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public XMLResourceParseException(String str, String str2, String str3, String str4, Throwable th) {
        super(r0.toString(), th);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(": invalid <");
        sb2.append(str2);
        sb2.append(">-element found: attribute '");
        sb2.append(str3);
        sb2.append("' ");
        sb2.append(str4 == null ? "is required!" : str4);
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
