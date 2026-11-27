package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
